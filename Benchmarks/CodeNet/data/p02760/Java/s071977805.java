//package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static class Task {


        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            int[][] aa = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    aa[i][j] = sc.nextInt();
                }
            }
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (aa[j][k] == x) aa[j][k] = 0;
                    }
                }
            }
            boolean f = false;
            for (int i = 0; i < 3; i++) {
                boolean g = true;
                for (int j = 0; j < 3; j++) {
                    if (aa[i][j]!=0) g = false;
                }
                if (g) f = true;
            }
            for (int i = 0; i < 3; i++) {
                boolean g = true;
                for (int j = 0; j < 3; j++) {
                    if (aa[j][i]!=0) g = false;
                }
                if (g) f = true;
            }
            if (aa[0][0] == 0 &&aa[1][1] == 0 && aa[2][2] == 0) f = true;
            if (aa[2][0] == 0 &&aa[1][1] == 0 && aa[0][2] == 0) f = true;
            pw.println(f? "Yes": "No");
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