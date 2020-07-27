package com.fbodhi.cloud.service.impl;

import com.fbodhi.cloud.dao.PaymentDao;
import com.fbodhi.cloud.entities.Payment;
import com.fbodhi.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }

}
