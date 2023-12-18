//package atcoder.dpContest;

import java.io.*;
import java.util.*;

public class Main {
    private static List<Integer>[] g;
    private static int[] dp;
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
            int N = in.nextInt(), M = in.nextInt();
            g = new List[N];
            for(int i = 0; i < N; i++) {
                g[i] = new ArrayList<>();
            }
            for(int i = 0; i < M; i++) {
                g[in.nextInt() - 1].add(in.nextInt() - 1);
            }
            dp = new int[N];
            Arrays.fill(dp, -1);
            for(int i = 0; i < N; i++) {
                dfs(i);
            }
            int ans = 0;
            for(int i = 0; i < N; i++) {
                ans = Math.max(ans, dp[i]);
            }
            out.println(ans);
        }
        out.close();
    }

    private static int dfs(int curr) {
        if(dp[curr] < 0) {
            dp[curr] = 0;
            for(int neighbor : g[curr]) {
                dp[curr] = Math.max(dp[curr], dfs(neighbor) + 1);
            }
        }
        return dp[curr];
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


