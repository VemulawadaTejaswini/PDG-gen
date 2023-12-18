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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String T1 = in.next();
            String T2 = reverse(T1);
            int K = in.nextInt();

            int lcs = solve(T1, T2);
            out.println(Math.min(T1.length(), lcs + 2 * K));
        }

        private String reverse(String str) {
            char[] ans = str.toCharArray();
            for (int i = 0; i < str.length() / 2; i++) {
                char tmp = ans[str.length() - i - 1];
                ans[str.length() - i - 1] = ans[i];
                ans[i] = tmp;
            }
            return new String(ans);
        }

        private int solve(String S, String T) {
            int N = S.length();
            int M = T.length();

            int[][] dp = new int[N + 1][M + 1];

            for (int i = N - 1; i >= 0; i--) {
                dp[i][M] = dp[i + 1][M];
            }

            for (int i = M - 1; i >= 0; i--) {
                dp[N][i] = dp[N][i + 1];
            }

            for (int i = N - 1; i >= 0; i--) {
                for (int j = M - 1; j >= 0; j--) {
                    if (S.charAt(i) == T.charAt(j)) {
                        dp[i][j] = 1 + dp[i + 1][j + 1];
                    } else {
                        dp[i][j] = Math.max(dp[i + 1][j + 1], Math.max(dp[i + 1][j], dp[i][j + 1]));
                    }
                }
            }

            return dp[0][0];
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

