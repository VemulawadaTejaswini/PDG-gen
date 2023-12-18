//package com.zhangyong.algorithm;
 
import java.io.*;
import java.util.StringTokenizer;
 
public class Main{
 
    FastScanner in;
    PrintWriter out;
 
    class FastScanner {
 
        BufferedReader br;
        StringTokenizer st;
 
        private FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
 
        private FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
    }
 
    static final int count = 100000;
 
    private void solve() {
        int n = in.nextInt();
        long m = in.nextLong();
        long arr[] = new long[count];
        int l;
        long r;
        for (int i = 0; i < n; i++) {
            l = in.nextInt();
            r = in.nextLong();
            arr[l] += r;
        }
        for (int i = 0; i < count; i++) {
            if ((m -= arr[i]) <= 0) {
                out.print(i);
                break;
            }
        }
    }
 
    private void run() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }
 
    public static void main(String[] args) {
        new Main().run();
    }
}