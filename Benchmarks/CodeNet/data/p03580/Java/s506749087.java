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
 * @author Yuan Lei
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task1003 solver = new Task1003();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task1003 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.next();
            int[][][] dp = new int[n + 1][2][2];
            if (s.length() < 3) {
                out.println(0);
                return;
            } else {
                for (int i = 0; i <= n; ++i) {
                    for (int a = 0; a < 2; ++a) {
                        for (int b = 0; b < 2; ++b) {
                            dp[i][a][b] = -1;
                        }
                    }
                }
                int x = s.charAt(0) - '0';
                int y = s.charAt(1) - '0';
                dp[2][x][y] = 0;
                for (int i = 3; i <= n; ++i) {
                    for (int a = 0; a < 2; ++a) {
                        for (int b = 0; b < 2; ++b) {
                            int c = s.charAt(i - 1) - '0';
                            if (c == 0) {
                                dp[i][b][c] = Math.max(dp[i][b][c], dp[i - 1][a][b]);
                            } else {
                                //not change
                                dp[i][b][c] = Math.max(dp[i][b][c], dp[i - 1][a][b]);
                                //change
                                if (a == 1 && b == 0 && dp[i - 1][1][0] >= 0) {
                                    dp[i][1][0] = Math.max(dp[i][1][0], dp[i - 1][1][0] + 1);
                                }
                            }
                        }
                    }
                }
                int ans = -1;
                for (int a = 0; a < 2; ++a) {
                    for (int b = 0; b < 2; ++b) {
                        ans = Math.max(ans, dp[n][a][b]);
                    }
                }
                out.println(ans);
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

