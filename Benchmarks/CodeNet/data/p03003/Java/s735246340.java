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
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ECommonSubsequence solver = new ECommonSubsequence();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECommonSubsequence {
        public static long mod = 10000_0000_7;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            long dp[][] = new long[n + 1][m + 1];
            int a[] = new int[n + 1];
            int b[] = new int[m + 1];
            for (int i = 0; i <= n; i++) dp[i][0] = 1;
            for (int i = 0; i <= m; i++) dp[0][i] = 1;
            for (int i = 1; i <= n; i++) a[i] = in.nextInt();
            for (int i = 1; i <= m; i++) b[i] = in.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    dp[i][j] += (dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1] + mod) % mod;
                    dp[i][j] %= mod;
                    if (a[i] == b[j]) {
                        dp[i][j] += dp[i - 1][j - 1] % mod;
                    }
                }
            }
            out.println(dp[n][m]);


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

