//package com.company;
// Always comment out package when submitting.


import java.io.*;
import java.util.*;

public class Main {
    public static class Task {

        public class Trie {
            Trie left, right;
            int[] max;
            Trie() {
                max = new int[2];
            }
        }
        int n;
        Trie root;
        public void insert(int i, int val) {
            Trie cur = root;
            for (int j = n - 1; j >= 0; j--) {
                if (((1 << j) & i) != 0) {
                    if (cur.left == null) cur.left = new Trie();
                    cur = cur.left;
                } else {
                    if (cur.right == null) cur.right = new Trie();
                    cur = cur.right;
                }
            }
            cur.max[0] = val;
        }

        public void dfs(Trie cur) {
            if (cur.left != null) {
                dfs(cur.left); dfs(cur.right);
                int[] pp = new int[4];
                for (int i = 0; i < 2; i++) {
                    pp[i] = cur.left.max[i];
                }
                for (int i = 0; i < 2; i++) {
                    pp[i + 2] = cur.right.max[i];
                }
                Arrays.sort(pp);
                cur.max[0] = pp[3];
                cur.max[1] = pp[2];
                System.err.println(Arrays.toString(cur.max));
            }
        }

        public int query(int index) {
            Trie cur = root;
            int[] mm = new int[4];
            for (int j = n - 1; j >= 0; j--) {
                if (((1 << j) & index) != 0) {
                    mm[0] = cur.right.max[0];
                    mm[1] = cur.right.max[1];
                    Arrays.sort(mm);
                    cur = cur.left;
                } else {
                    cur = cur.right;
                }
            }
            mm[1] = cur.max[0];
            mm[0] = cur.max[1];
            Arrays.sort(mm);
            return mm[3] + mm[2];
        }

        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            int n = sc.nextInt();
            final int[] a = new int[1 << n];
            for (int i = 0; i < 1 << n; i++) {
                a[i] = sc.nextInt();
            }
            int[][] dp = new int[1 << n][2];
            dp[1][0] = 0;
            dp[1][1] = -1;
            for (int i = 1; i < 1 << n; i++) {
                dp[i][0] = i;
                dp[i][1] = -1;
//                System.err.println(i);
//                System.err.println(Arrays.toString(dp[i]));
                for (int j = n - 1; j >= 0; j--) {
                    if (((1 << j) & i) != 0) {
                        int[] collect = dp[i ^ (1 << j)];
                        Integer[] wild = new Integer[4];
                        wild[0] = dp[i][0];
                        wild[1] = dp[i][1];
                        wild[2] = collect[0];
                        wild[3] = collect[1];
                        Arrays.sort(wild, new Comparator<Integer>() {
                            @Override
                            public int compare(Integer i1, Integer i2) {
                                if (i1.equals(i2)) {
                                    return 0;
                                }
                                if (i1 == -1) return -1;
                                if (i2 == -1) return 1;
                                return Integer.compare(a[i1], a[i2]);
                            }
                        });
                        int idx = 0;
                        int pv = -2;
                        for (int k = 3; k >= 0; k--) {
                            if (wild[k] == -1) throw new RuntimeException(Arrays.toString(wild));
                            if (wild[k] == pv) continue;
                            pv = dp[i][idx++] = wild[k];
                            if (idx == 2) break;
                        }
//                        System.err.println(Arrays.toString(dp[i]));
                    }
                }
            }
            int prev = 0;
            for (int i = 1; i < 1 << n; i++) {
                int temp = (a[dp[i][0]] + a[dp[i][1]]);
                prev = Math.max(prev, temp);
                pw.println(prev);
            }
            pw.close();
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