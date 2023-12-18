/**
 * Created by happygirlzt on 2019-08-17 19:51
 */

import java.io.*;
import java.util.*;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void solve(String s) {
        if (s == null || s.length() == 0) {
            System.out.println(0);
            return;
        }

        int n = s.length();
        int k = 1;
        char prev = s.charAt(0);
        int prevLen = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != prev || prevLen > 1) {
                k++;
                prevLen = 1;
                prev = s.charAt(i);
            } else {
                if (i + 1 < n) {
                    i++;
                    prev = s.charAt(i);
                    prevLen = 2;
                    k++;
                }
            }
        }

        System.out.println(k);
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        String s = fr.nextLine();
        solve(s);
    }
}
