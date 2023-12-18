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
 * @author Yuan Lei
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task1002 solver = new Task1002();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task1002 {
        int[][] dp;
        ArrayList<Integer>[] edges;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            edges = new ArrayList[n + 1];
            for (int i = 1; i <= n; ++i) edges[i] = new ArrayList<>();
            for (int i = 0; i < m; ++i) {
                int x, y;
                x = in.nextInt();
                y = in.nextInt();
                edges[x].add(y);
                edges[y].add(x);
            }
            dp = new int[n + 1][2];
            dfs(1, 0);
            int[][] cnt = new int[2][2];
            long ans = 0;
            for (int i = 1; i <= n; ++i) {
                cnt[dp[i][0]][dp[i][1]]++;
            }
            ans += 1L * cnt[1][0] * cnt[0][1];
            ans += 1L * cnt[1][0] * cnt[1][1];
            ans += 1L * cnt[0][1] * cnt[1][1];
            ans += 1L * cnt[1][1] * (cnt[1][1] - 1) / 2;
            ans -= m;
            out.println(ans);
        }

        private void dfs(int node, int odd) {
            if (dp[node][odd] > 0) return;
            dp[node][odd] = 1;
            for (int y : edges[node]) {
                dfs(y, odd ^ 1);
            }
        }

    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public boolean hasNext() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    final String line = reader.readLine();
                    if (line == null) return false;
                    tokenizer = new StringTokenizer(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return true;
        }

        public String next() {
            if (hasNext()) return tokenizer.nextToken();
            return null;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

