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
 *
 * @author aps
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        MCandies solver = new MCandies();
        solver.solve(1, in, out);
        out.close();
    }

    static class MCandies {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            Numbers number = new Numbers(1000000007);
            int n = in.nextInt(), k = in.nextInt();
            int[] a = new int[n + 1];
            long[][] dp = new long[n + 5][k + 5];

            for (int i = 1; i <= n; i++) a[i] = in.nextInt();
            dp[0][0] = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= k; j++) {
                    if (j > 0) dp[i][j] = number.add(dp[i][j], dp[i][j - 1]);
                    int x = Math.max(0, j - a[i]);
                    if (x == 0) dp[i][j] = number.add(dp[i][j], dp[i - 1][j]);
                    else {
                        long num = number.sub(dp[i - 1][j], dp[i - 1][x - 1]);
                        dp[i][j] = number.add(dp[i][j], num);
                    }
                }
            }
            out.println(dp[n][k]);
        }

    }

    static class Numbers {
        public long mod;

        public Numbers(long MOD) {
            mod = MOD;
        }

        public long add(long a, long b) {
            a += b;
            if (a >= mod) a -= mod;
            return a;
        }

        public long sub(long a, long b) {
            a -= b;
            if (a < 0) a += mod;
            return a;
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

