//package com.company;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static class Task {


        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] keys = new int[m][2];
            for (int i = 0; i < m; i++) {
                keys[i][0] = sc.nextInt();
                int k = sc.nextInt();
                for (int j = 0; j < k; j++) {
                    keys[i][1] += 1 << (sc.nextInt() - 1);
                }
            }
            int[] dp = new int[1 << n];
            Arrays.fill(dp, Integer.MAX_VALUE / 2);
            dp[0] = 0;
            int[] nextDp = new int[1 << n];
            for (int i = 0; i < m; i++) {
                System.arraycopy(dp, 0, nextDp, 0, dp.length);
                for (int j = 0; j < 1 << n; j++) {
                    nextDp[j | keys[i][1]] = Math.min(nextDp[j | keys[i][1]], dp[j] + keys[i][0]);
                }
                dp = nextDp;
            }
            pw.println(dp[(1 << n) - 1] >= Integer.MAX_VALUE / 2 ? -1 : dp[(1 << n) - 1]);
        }
    }

    static long TIME_START, TIME_END;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new FileInputStream("input"));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
//        PrintWriter pw = new PrintWriter(new FileOutputStream("output"));

        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();
        Task t = new Task();
        t.solve(sc, pw);
        TIME_END = System.currentTimeMillis();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        pw.close();
        System.err.println("Memory increased: " + (usedMemoryAfter - usedMemoryBefore) / 1000000);
        System.err.println("Time used: " + (TIME_END - TIME_START) + ".");
    }

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
