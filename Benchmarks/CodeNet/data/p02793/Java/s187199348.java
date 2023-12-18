//package com.company;
import java.util.*;

public class Main {
    static final private int MAX_N = (int)(1E6 + 10);
    static final private int MOD = (int)(1E9 + 7);

    static private int multiply(int a, int b) {
        return (int)(((long)a * b) % MOD);
    }

    // fast bin pow
    static private int pow(int a, int p) {
        int cur = a;
        int ans = 1;
        while (p > 0) {
            if (p % 2 == 1)
                ans = (int)(((long)ans * cur) % MOD);
            p /= 2;
            cur = (int)(((long)cur * cur) % MOD);
        }
        return ans;
    }

    static private int inv(int x) {
        return pow(x, MOD - 2);
    }

    public static void main(String[] args) {
        // inp
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        // sieve
        int[] sieve = new int[MAX_N];
        for (int i = 2; i < MAX_N; i++)
            if (sieve[i] == 0) {
                sieve[i] = i;
                for (int j = i + i; j < MAX_N; j += i)
                    sieve[j] = i;
            }

        // count powers
        int[] cnt = new int[MAX_N];
        for (int i = 0; i < n; i++) {
            int x = a[i];
            while (x > 1) {
                int p = sieve[x];
                int pw = 0;
                while (sieve[x] == p) {
                    x /= p;
                    pw++;
                }
                cnt[p] = Math.max(cnt[p], pw);
            }
        }

        // count lcm
        int s = 1;
        for (int i = 2; i < MAX_N; i++)
            s = multiply(s, pow(i, cnt[i]));

        // count ans
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += multiply(s, inv(a[i]));
            res %= MOD;
        }

        // output
        System.out.println(res);
    }
}
