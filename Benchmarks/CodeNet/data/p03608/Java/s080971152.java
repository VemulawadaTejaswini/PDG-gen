import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        final int INF = (int) 1e9;
        final int MX = 201;
        boolean[] vis;
        int[][] dp;
        int[] towns;
        int n;
        int m;
        int r;
        int res;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();
            r = in.nextInt();

            towns = new int[r];
            for (int i = 0; i < r; ++i) towns[i] = in.nextInt() - 1;
            dp = new int[MX][MX];
            for (int i = 0; i < n; ++i) Arrays.fill(dp[i], INF);
            for (int i = 0; i < m; ++i) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                int c = in.nextInt();
                dp[u][v] = dp[v][u] = c;
            }
            for (int k = 0; k < n; ++k) {
                for (int i = 0; i < n; ++i) {
                    for (int j = 0; j < n; ++j) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
                    }
                }
            }
            vis = new boolean[MX];
            res = INF;
            dfs(0, -1, 0);
            out.println(res);
        }

        private void dfs(int root, int prev, int distance) {
            if (root == r && res > distance) {
                res = distance;
                return;
            }
            for (int i = 0; i < r; ++i) {
                if (vis[i]) continue;
                vis[i] = true;
                if (prev == -1) {
                    dfs(root + 1, i, 0);
                } else {
                    dfs(root + 1, i, dp[towns[prev]][towns[i]] + distance);
                }
                vis[i] = false;
            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

