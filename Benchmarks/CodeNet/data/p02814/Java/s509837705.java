//package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static PrintWriter out = new PrintWriter(System.out, true);
    public static long n, m;
    public static long[] a;

    public static long gcd(long a, long b) {
        while (b > 0) {
            long c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static void Input() {
        n = sc.nextLong();
        m = sc.nextLong();
        a = new long[(int) n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            a[i] /= 2;
        }
    }

    public static void Solve() {
        long x = a[0];
        for (int i = 1; i < n; i++) {
            x = lcm(x, a[i]);
            if (x > m) {
                out.println(0);
                return;
            }
        }

        for (int i = 0; i < n; i++)
            if ((x / a[i]) % 2 == 0) {
                out.println(0);
                return;
            }

        long res = (m / x - 1) / 2 + 1;
        out.println(res);
    }

    public static void main(String[] args) {
        Input();
        Solve();
    }
}
