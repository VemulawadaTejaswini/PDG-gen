//package com.questetra.test.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static M[] magics;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();
        magics = new M[N];
        int minConsume = Integer.MAX_VALUE;
        int maxAtack = 0;
        for (int i = 0; i < N; i++) {
            M m = new M();
            m.atack = sc.nextInt();
            m.consume = sc.nextInt();
            minConsume = Math.min(minConsume, m.consume);
            maxAtack = Math.max(maxAtack, m.atack);
            sc.nextLine();
            magics[i] = m;
        }
        Arrays.sort(magics, Comparator.comparingDouble(M::ratio).reversed());

        int sum = 0;
        while (H > maxAtack) {
            H -= magics[0].atack;
            sum += magics[0].consume;
        }
        sum = attack(0, H, sum, Integer.MAX_VALUE);
        System.out.println(sum);
    }

    static class M {
        int atack;
        int consume;

        float ratio() {
            return ((float) atack) / consume;
        }
    }

    static int attack(int index, final int H, final int sum, int currentMinSum) {
        for (int i = index; i < magics.length; i++) {
            int aH = H - magics[i].atack;
            int aSum = sum + magics[i].consume;
            if (currentMinSum < aSum) {
                // 打ち切り
                continue;
            }
            if (aH > 0) {
                aSum = attack(i, aH, aSum, currentMinSum);
            }
            currentMinSum = Math.min(currentMinSum, aSum);
        }
        return currentMinSum;
    }
}