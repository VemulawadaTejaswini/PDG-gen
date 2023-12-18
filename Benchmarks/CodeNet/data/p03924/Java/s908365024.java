import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        public int n;
        public int m;
        public int mod = 1000000007;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();
            long[][][] dp = new long[2][n + 1][n + 1];
            dp[0][n][0] = 1;
            for (int slots = 1; slots <= m; slots++) {
                int cur = slots % 2, prev = 1 - cur;
                for (int x = 0; x <= n; x++) {
                    for (int y = 0; y <= n; y++) {
                        dp[cur][x][y] = 0;
                        if (x > 0 && x + y <= n) dp[cur][x][y] += x * dp[prev][x + y][0];
                        if (y > 0) dp[cur][x][y] += y * dp[prev][x][y];
                        if (n - x - y > 0 && y + 1 <= n) dp[cur][x][y] += (n - x - y) * dp[prev][x][y + 1];
                        dp[cur][x][y] %= mod;
                    }
                }
            }
            out.println(dp[m % 2][1][0]);
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

