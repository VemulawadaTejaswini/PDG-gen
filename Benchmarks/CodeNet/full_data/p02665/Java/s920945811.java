package com.rakuten.dps.dataplatform.pipeline.service.exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        long max = a[n];
        long prevNodes = a[n];
        for (int i = n - 1; i >= 0; i--) {
            long currNodes = (long) Math.min(prevNodes + a[i], Math.pow(2, i));
            max += currNodes;
            prevNodes = currNodes;
        }
        System.out.println(max);
    }
}
