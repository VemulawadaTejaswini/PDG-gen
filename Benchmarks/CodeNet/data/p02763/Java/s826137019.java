//package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static class Task {
        public void add(int[] t, int i, int value) {
            for (; i < t.length; i |= i + 1)
                t[i] += value;
        }

        // sum[0..i]
        public int sum(int[] t, int i) {
            if (i < 0) return 0;
            int res = 0;
            for (; i >= 0; i = (i & (i + 1)) - 1)
                res += t[i];
            return res;
        }

        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            int n = sc.nextInt();
            int[][] pref = new int[26][n];
            String s = sc.next();
            int[] ss = new int[n];
            for (int i = 0; i < n; i++) {
                ss[i] = s.charAt(i) - 'a';
            }
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < n; j++) {
                    if (ss[j] == i) {
                        add(pref[i], j, 1);
                    }
                }
            }
            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                int t = sc.nextInt();
                if (t == 1) {
                    int x = sc.nextInt() - 1;
                    int y = sc.next().charAt(0) - 'a';
                    add(pref[ss[x]], x, -1);
                    ss[x] = y;
                    add(pref[ss[x]], x, 1);
                } else {
                    int l = sc.nextInt() - 1;
                    int r = sc.nextInt();
                    int cnt = 0;
                    for (int j = 0; j < 26; j++) {
                        if (sum(pref[j], r - 1) - sum(pref[j], l - 1) > 0) cnt++;
                    }
                    pw.println(cnt);
                }

            }
        }
    }

    static long TIME_START, TIME_END;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new FileInputStream("input"));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
//        PrintWriter pw = new PrintWriter(new FileOutputStream("input"));

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