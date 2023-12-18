//package atcoder.dpContest;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        try {
//            FastScanner in = new FastScanner(new FileInputStream("src/input.in"));
//            PrintWriter out = new PrintWriter(new FileOutputStream("src/output.out"));

        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
            solve(1, in, out);

//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static void solve(int q, FastScanner in, PrintWriter out) {
        for (int qq = 0; qq < q; qq++) {
            int mod = (int)1e9 + 7;
            int N = in.nextInt(), K = in.nextInt();
            int[] a = new int[N];
            for(int i = 0; i < N; i++) {
                a[i] = in.nextInt();
            }

            long[] dp = new long[K + 1];    //d[i]: the number of ways using i candies
            dp[0] = 1;
            for(int child = 0; child < N; child++) {
                long[] accuSum = new long[K + 1];
                for(int usedCandies = 0; usedCandies <= K; usedCandies++) {
                    //the current child can pick from [0, Math.min(a[child], K - used)],
                    //meaning using the current dp[usedCandies] we update dp[usedCandies + 1], ...... dp[usedCandies + Math.min(a[child], K - used)]
                    //by adding dp[usedCandies] to each one of these
                    int L = usedCandies + 1;
                    int R = usedCandies + Math.min(a[child], K - usedCandies);
                    if(L <= R) {
                        accuSum[L] = modularAdd(accuSum[L], dp[usedCandies], mod);
                        if(R + 1 <= K) {
                            accuSum[R + 1] = modularSubtract(accuSum[R + 1], dp[usedCandies], mod);
                        }
                    }
                }

                long prefixSum = 0;
                for(int i = 0; i <= K; i++) {
                    prefixSum = modularAdd(prefixSum, accuSum[i], mod);
                    dp[i] = modularAdd(dp[i], prefixSum, mod);
                }
            }

            out.println(dp[K]);
        }
        out.close();
    }

    private static long modularAdd(long a, long b, int mod) {
        long sum = a + b;
        if(sum >= mod) {
            sum -= mod;
        }
        return sum;
    }

    private static long modularSubtract(long a, long b, int mod) {
        long diff = a - b;
        if(diff < 0) {
            diff += mod;
        }
        return diff;
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
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
    }
}


