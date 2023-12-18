//package com.company;
// Always comment out package when submitting.
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static class Task {
        int mod = 1_000_000_007;
        long mult(long a, long b) {
            return a * b % mod;
        }
        long add(long a, long b) {
            return (a + b + mod) % mod;
        }
        long pow(long a, long b) {
            long ret = 1;
            while (b != 0) {
                if (b % 2 == 1) ret = ret * a % mod;
                a = a * a % mod;
                b >>= 1;
            }
            return ret;
        }
        int N, K;
        Map<Integer, Long> irreducibleCount;
        public long getOne(int val, int factor) {
            if (val == factor) return 0;
            return getOrSolve(factor);
        }
        public long getOrSolve(int val) {
            if (irreducibleCount.containsKey(val)) return irreducibleCount.get(val);
            long total = pow(K, (val + 1) / 2);
            for (int factor = 1; factor * factor <= val; factor++) {
                if (val % factor == 0) {
                    total = add(total, -getOne(val, factor));
                    if (val != factor * factor)
                        total = add(total, -getOne(val, val / factor));
                }
            }
            irreducibleCount.put(val, total);
            return total;
        }
        public long getOne(int factor) {
            if (factor % 2 == 0) {
                return mult(getOrSolve(factor), factor / 2);
            } else {
                return mult(getOrSolve(factor), factor);
            }
        }
        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            N = sc.nextInt();
            K = sc.nextInt();
            irreducibleCount = new HashMap<>();
            long total = 0;
            for (int factor = 1; factor * factor <= N; factor++) {
                if (N % factor == 0) {
                    total = add(total, getOne(factor));
                    if (N != factor * factor) {
                        total = add(total, getOne(N / factor));
                    }
                }
            }
            pw.println(total);
        }
    }

    // template, actual code is in class Task.
    static long TIME_START, TIME_END;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new FileInputStream("Test.in"));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
//        PrintWriter pw = new PrintWriter(new FileOutputStream("Test.out"));

        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();
        Task t = new Task();
        t.solve(sc, pw);
        TIME_END = System.currentTimeMillis();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        pw.close();
//        System.err.println("Memory increased: " + (usedMemoryAfter - usedMemoryBefore) / 1000000);
//        System.err.println("Time used: " + (TIME_END - TIME_START) + ".");
    }

    // Faster IO with BufferedReader wrapped with Scanner
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader s) throws FileNotFoundException {
            br = new BufferedReader(s);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}