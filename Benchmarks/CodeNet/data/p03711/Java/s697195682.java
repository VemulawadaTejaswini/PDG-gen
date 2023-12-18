//package com.zhangyong.algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

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

    private void solve() {
        //0 31 29 31 30 31 30 31 31 30 31 30 31
        int[] arr = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int x, y;
        x = in.nextInt();
        y = in.nextInt();
        if (arr[x] == arr[y]) {
            out.println("Yes");
        } else {
            out.println("No");
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
