//package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static class Task {

        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            int n = sc.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                B[i] = sc.nextInt();
            }
            if (Arrays.equals(A, B)) {
                pw.println(0);
                return;
            }
            boolean[] eq = new boolean[n];
            int eqCount = 0;
            for (int i = 0; i < n; i++) {
                eq[i] = A[i] == B[i];
                eqCount += eq[i] ? 1 : 0;
                if (A[i] > B[i]) {
                    pw.println(-1);
                    return;
                }
            }
            PriorityQueue<int[]> bPQ = new PriorityQueue<>(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return -o1[0] + o2[0];
                }
            });
            for (int i = 0; i < n; i++) {
                if (!eq[i]) bPQ.add(new int[]{B[i], i});
            }
            long steps = 0;
            while (eqCount < n) {
                int[] entry = bPQ.poll();
                int index = entry[1];
                int prevVal = B[(index + n - 1) % n];
                int nextVal = B[(index + 1) % n];
                int decreOnce = prevVal + nextVal;
                int atMostDecre = (entry[0] - A[index]) / decreOnce;
                if (atMostDecre <= 0) {
                    pw.println(-1);
                    return;
                }
                steps += atMostDecre;
                int curVal = entry[0] - atMostDecre * decreOnce;
                B[index] = curVal;
                if (curVal == A[index]) {
                    eqCount++;
                } else {
                    bPQ.add(new int[]{curVal, index});
                }
            }
            pw.println(steps);
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
