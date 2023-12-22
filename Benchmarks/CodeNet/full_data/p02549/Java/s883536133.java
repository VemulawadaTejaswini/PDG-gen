//package atcoder.beginner179;

import java.io.*;
import java.util.*;

public class Main {
    static InputReader in;
    static PrintWriter out;

    public static void main(String[] args) {
        //initReaderPrinter(true);
        initReaderPrinter(false);
        //solve(in.nextInt());
        solve(1);
    }

    static void solve(int testCnt) {
        for (int testNumber = 0; testNumber < testCnt; testNumber++) {
            int n = in.nextInt(), k = in.nextInt();
            int[][] seg = new int[k][2];
            for(int i = 0; i < k; i++) {
                seg[i][0] = in.nextInt();
                seg[i][1] = in.nextInt();
            }
            int mod = 998244353;
            long[] dp = new long[n + 1];
            long[] ps = new long[n + 1];
            dp[1] = 1;
            ps[1] = 1;
            for(int i = 2; i <= n; i++) {
                for(int j = 0; j < k; j++) {
                    int l = i - seg[j][1];
                    int r = i - seg[j][0];
                    if(r < 1) {
                        continue;
                    }
                    if(l < 1) {
                        l = 1;
                    }
                    dp[i] = (dp[i] + (ps[r] - ps[l - 1] + mod)) % mod;
                }
                ps[i] = (dp[i] + ps[i - 1]) % mod;
            }
            out.println(dp[n]);
        }
        out.close();
    }

    static void initReaderPrinter(boolean test) {
        if (test) {
            try {
                in = new InputReader(new FileInputStream("src/input.in"));
                out = new PrintWriter(new FileOutputStream("src/output.out"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            in = new InputReader(System.in);
            out = new PrintWriter(System.out);
        }
    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        InputReader(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream), 32768);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
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

        Integer[] nextIntArray(int n) {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        Long[] nextLongArray(int n) {
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }
    }
}


