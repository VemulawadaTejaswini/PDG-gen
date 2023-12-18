//package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//****Use Integer Wrapper Class for Arrays.sort()****
public class Main {
    public static void main(String[] Args) {
        FastReader scan = new FastReader();
        int n = scan.nextInt();
        int k = scan.nextInt();
        int mod = 1000000007;
        long[] fact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % mod;
        }
        long ans = 0;
        for (int i = k; i <= n; i++) {
            ans = (ans + (ncr(n, i - 1, fact, mod) + (n - i + 1)) % mod) % mod;
        }
        ans++;
        System.out.println(ans);
    }

    static long ncr(int n, int r, long[] fact, long mod) {
        return (fact[n] * power((fact[r] * fact[n - r]) % mod, mod - 2)) % mod;
    }

    static long power(long x, long y) {
        long res = 1;
        long mod = 1000000007;
        while (y > 0) {
            if (y % 2 != 0)
                res = (res * x) % mod;
            y >>= 1;
            x = (x * x) % mod;
        }
        return res;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}
