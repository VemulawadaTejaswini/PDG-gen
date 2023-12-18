//package atcoder.beginner144;

import java.io.*;
import java.util.*;

public class Main {
    private static List<Integer>[] paths;
    private static double[] dp;
    private static int N, M;
    private static double ans;

    public static void main(String[] args) {
//        try {
//            FastScanner in = new FastScanner(new FileInputStream("src/input.in"));
//            PrintWriter out = new PrintWriter(new FileOutputStream("src/output.out"));
        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

            solve(in, out);

//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static void input(FastScanner in, PrintWriter out) {
        N = in.nextInt();
        M = in.nextInt();
        paths = new List[N + 1];
        dp = new double[N + 1];

        for(int i = 1; i <= N; i++) {
            paths[i] = new ArrayList<>();
        }
        for(int i = 0; i < M; i++) {
            int s = in.nextInt(), t = in.nextInt();
            paths[s].add(t);
        }
    }

    private static void f(int block) {
        dp[N] = 0;
        for(int i = N - 1; i >= 1; i--) {
            double sum = 0.0;
            double maxAdj = 0.0;
            int num = paths[i].size();
            for(int j : paths[i]) {
                sum += dp[j];
                maxAdj = Math.max(maxAdj, dp[j]);
            }
            if(i == block && num > 1) {
                num--;
                sum -= maxAdj;
            }
            dp[i] = sum / num + 1;
        }
        ans = Math.min(ans, dp[1]);
    }

    private static void solve(FastScanner in, PrintWriter out) {
        input(in, out);
        ans = Double.MAX_VALUE;
        for(int i = 1; i < N; i++) {
            f(i);
        }
        out.println(ans);
        out.close();
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


