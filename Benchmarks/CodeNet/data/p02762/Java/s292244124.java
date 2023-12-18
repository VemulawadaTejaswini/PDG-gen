//package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static class Task {
        public class DJS {
            int[] xx;
            public DJS(int n) {
                xx = new int[n];
                Arrays.fill(xx, -1);
            }
            int find(int x) {
                return xx[x] < 0 ? x: (xx[x] = find(xx[x]));
            }
            void uun(int a, int b) {
                int ra = find(a), rb = find(b);
                if (ra != rb) xx[ra] = rb;
            }
        }

        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            List<Integer>[] f = new List[n];
            List<Integer>[] b = new List[n];
            DJS djs = new DJS(n);
            for (int i = 0; i < n; i++) {
                f[i] = new ArrayList<>();
                b[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt() - 1;
                int c = sc.nextInt() - 1;
                f[a].add(c);
                f[c].add(a);
                djs.uun(a, c);
            }
            for (int i = 0; i < k; i++) {
                int a = sc.nextInt() - 1;
                int c = sc.nextInt() - 1;
                b[a].add(c);
                b[c].add(a);
            }
            long[] ans = new long[n];
            Map<Integer, Set<Integer>> group = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int r = djs.find(i);
                if (!group.containsKey(r)) group.put(r, new HashSet<>());
                group.get(r).add(i);
            }
            for (Map.Entry<Integer, Set<Integer>> en: group.entrySet()) {
                Set<Integer> s = en.getValue();
                for (int z: s) {
                    long tot = (long) s.size() - 1;
                    tot -= f[z].size();
                    for (int x: b[z]) if (s.contains(x)) {
                        tot--;
                    }
                    ans[z] = tot;
                }
            }
            for (long x: ans) pw.print(x + " ");
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