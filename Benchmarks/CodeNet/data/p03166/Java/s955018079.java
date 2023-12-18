import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Abhas Jain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        GLongestPath solver = new GLongestPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class GLongestPath {
        ArrayList<Integer>[] adj;
        boolean[] vis;
        int[] dp;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.ni();
            adj = new ArrayList[n];
            vis = new boolean[n];
            dp = new int[n];
            for (int i = 0; i < n; ++i) adj[i] = new ArrayList<>();
            int m = in.ni();
            for (int i = 0; i < m; ++i) {
                int a = in.ni() - 1;
                int b = in.ni() - 1;
                adj[a].add(b);
            }
            for (int i = 0; i < n; ++i) {
                if (!vis[i]) dfs(i);
            }
            int ans = 0;
            for (int i = 0; i < n; ++i) {
                ans = Math.max(ans, dp[i]);
            }
            out.println(ans - 1);
        }

        public int dfs(int node) {
            if (dp[node] != 0) return dp[node];
            int ans = 0;
            for (int g : adj[node]) {
                ans = Math.max(ans, dfs(g));
            }
            vis[node] = true;
            return dp[node] = (1 + ans);
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

        public int ni() {
            return Integer.parseInt(next());
        }

    }
}

