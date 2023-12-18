//package com.company;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        MyScanner sc = new MyScanner(System.in);
        int[] cnt = new int[200010];
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            cnt[a] += b;
        }
        int tt = 0;
        for (int i = 0; i < cnt.length; i++) {
            tt += cnt[i];
            if (tt >= k){
                System.out.println(i);
                return;
            }
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