package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BigDecimal total = new BigDecimal(0);
        final BigDecimal rate = new BigDecimal(380000.0);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            String u = sc.next();
            if ("JPY".equals(u)) {
                total = total.add(new BigDecimal(x));
            } else {
                total = total.add(new BigDecimal(x).multiply(rate));
            }
        }
        System.out.println(total);
    }
}
