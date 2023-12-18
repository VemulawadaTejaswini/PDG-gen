//package com.company;

import java.io.*;
import java.util.*;


public class Main {
    static int[][] con;
    static int[] a;
    static int[] b;
    static int n;
    public static void main(String[] args) throws IOException {
        MyScanner sc = new MyScanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        a = new int[m];
        b = new int[m];
        con = new int[n][n];
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt() - 1; int b1 = sc.nextInt() - 1;
            a[i] = a1; b[i] = b1;
            con[a1][b1] = 1;
            con[b1][a1] = 1;
        }
        int ss = 0;
        for (int i = 0; i < m; i++) {
            if (is_con(i)){
                ss++;
            }
        }
        System.out.println(m - ss);
    }
    public static boolean is_con(int dis){
        boolean[] vis = new boolean[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        vis[0] = true;
        while (!st.empty()){
            int idx = st.pop();
            for (int i = 0; i < n; i++) {
                if ((a[dis] == idx && b[dis] == i) || (a[dis] == i) && b[dis] == idx) continue;
                if (!vis[i] && con[idx][i] != 0){
                    st.push(i);
                    vis[i] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (!vis[i]){
                return false;
            }
        }
        return true;
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