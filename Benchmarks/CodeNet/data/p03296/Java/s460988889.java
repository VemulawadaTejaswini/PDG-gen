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
 *
 * @author Zayakin Andrey
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Input in = new Input(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Input in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = in.nextIntArray(n);
            int r = 102;
            int[][] dp = new int[n + 1][r + 1];
            for (int[] d : dp) {
                Arrays.fill(d, Integer.MAX_VALUE / 2);
            }
            dp[0][r] = 0;
            for (int i = 0; i < n; i++) {
                for (int p = 1; p <= r; p++) {
                    for (int j = 1; j <= r; j++) {
                        if (dp[i][p] >= Integer.MAX_VALUE / 2) {
                            continue;
                        }
                        if (p != j) {
                            dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][p] +
                                    (j == a[i] ? 0 : 1));

                        }
                    }
                }
            }
            int best = Integer.MAX_VALUE / 2;
            for (int p = 1; p <= r; p++) {
                best = Math.min(best, dp[n][p]);
            }
            out.println(best);
        }

    }

    static class Input {
        private StringTokenizer tokenizer = null;
        private BufferedReader reader;

        public Input(InputStream inputStream) {
            reader = new BufferedReader(new InputStreamReader(inputStream));
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }

        public String nextToken() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(nextLine());
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }

        public int[] nextIntArray(int n, int add) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextInt() + add;
            }
            return result;
        }

        public int[] nextIntArray(int n) {
            return nextIntArray(n, 0);
        }

    }
}

