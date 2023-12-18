//package com.company;

import java.io.*;
import java.util.*;

public class Main {
    static long TIME_START, TIME_END;
    public static void main(String[] args) throws IOException {
        MyScanner sc = new MyScanner(System.in);
//        MyScanner sc = new MyScanner(new FileInputStream("Test.in"));
        PrintWriter pw = new PrintWriter(System.out);
        TIME_START = System.currentTimeMillis();
        Task.solve(sc, pw);
        TIME_END = System.currentTimeMillis();
//        pw.println("Time used: " + (TIME_END - TIME_START) + ".");
        pw.close();
    }

    public static class Task {
        static int n;
        static int k;
        static int[] xi;
        static int[] yi;
        static int[][] countLD;
        static int[][] gridPoint;
        static int getBlock(int x, int y) {
            int xx = Math.min(x + k - 1, 4 * k);
            int yy = Math.min(y + k - 1, 4 * k);
            int t = countLD[xx][yy] - countLD[x - 1][yy] - countLD[xx][y - 1] + countLD[x - 1][y - 1];
            return t;
        }
        public static void solve(MyScanner sc, PrintWriter pw) throws IOException {
            n = sc.nextInt();
            k = sc.nextInt();
            xi = new int[n];
            yi = new int[n];
            countLD = new int[4 * k + 2][4 * k + 2];
            gridPoint = new int[2 * k + 2][2 * k + 2];
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                char c = sc.next().charAt(0);
                if (c == 'B') {
                    x += k;
                }
                x %= (2 * k);
                y %= (2 * k);
                gridPoint[x + 1][y + 1]++;
            }
            for (int i = 1 + k; i <= 4 * k; i++) {
                for (int j = 1 + k; j <= 4 * k; j++) {
                    countLD[i][j] = countLD[i - 1][j] + countLD[i][j - 1] - countLD[i - 1][j - 1];
                    if (i - k <= 2 * k + 1 && j - k <= 2 * k + 1) {
                        countLD[i][j] += gridPoint[i - k][j - k];
                    }
                }
            }
            int max = 0;
            for (int i = k + 1; i <= 3 * k; i++) {
                for (int j = k + 1; j <= 3 * k; j++) {
                    if (i > 2 * k && j > 2 * k) continue;
                    int c = 0;
                    c += getBlock(i, j);
                    c += getBlock(i - k, j - k);
                    c += getBlock(i + k, j - k);
                    c += getBlock(i - k, j + k);
                    c += getBlock(i + k, j + k);
                    max = Math.max(max, c);
                }
            }
            pw.println(max);
        }

    }

    static class MyScanner {
        StringTokenizer st;
        BufferedReader br;

        public MyScanner(InputStream s){  br = new BufferedReader(new InputStreamReader(s));}

        public MyScanner(FileReader s) throws FileNotFoundException {br = new BufferedReader(s);}

        public String next() throws IOException
        {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {return Integer.parseInt(next());}

        public long nextLong() throws IOException {return Long.parseLong(next());}

        public String nextLine() throws IOException {return br.readLine();}

        public double nextDouble() throws IOException { return Double.parseDouble(next()); }

        public boolean ready() throws IOException {return br.ready();}
    }
}
