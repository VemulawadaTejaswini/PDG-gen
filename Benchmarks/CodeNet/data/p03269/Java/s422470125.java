//package com.company;

import java.io.*;
import java.util.*;

public class Main {
    static long TIME_START, TIME_END;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new FileInputStream("Test.in"));
        PrintWriter pw = new PrintWriter(System.out);
//        PrintWriter pw = new PrintWriter(new FileOutputStream("Test.out"));

        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();
        Task t = new Task();
        t.solve(sc, pw);
        TIME_END = System.currentTimeMillis();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        pw.close();
        System.out.println("Memory increased:" + (usedMemoryAfter - usedMemoryBefore) / 1000000);
        System.out.println("Time used: " + (TIME_END - TIME_START) + ".");
    }

    public static class Task {

        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            int l = sc.nextInt();
            List<int[]> edges = new ArrayList<>();
            int n = 1;
            while (true) {
                if (l == 1) {
//                    edges.add(new int[]{n, -1, 1});
//                    n++;
                    break;
                }
                edges.add(new int[]{n, n + 1, 0});
                edges.add(new int[]{n, n + 1, (l + 1) / 2});
                if (l % 2 != 0) {
                    edges.add(new int[]{n, -1, l / 2});
                }
                n += 1;
                l /= 2;
            }
            pw.println(n + " " + edges.size());
            for (int i = 0; i < edges.size(); i++) {
                int a = edges.get(i)[0];
                int b = edges.get(i)[1]; if (b == -1) b = n;
                int c = edges.get(i)[2];
                pw.println(a + " " + b + " " + c);
            }

        }


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