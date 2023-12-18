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
        JSushi solver = new JSushi();
        solver.solve(1, in, out);
        out.close();
    }

    static class JSushi {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            double[][][] dp = new double[310][310][310];

            int c1 = 0, c2 = 0, c3 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                if (a[i] == 1) c1++;
                else if (a[i] == 2) c2++;
                else c3++;
            }

            for (int k = 0; k < 310; k++) {
                for (int j = 0; j + k < 310; j++) {
                    for (int i = 0; i + j + k < 310; i++) {
                        if (i == 0 && j == 0 && k == 0) continue;

                        dp[i][j][k] += (double) n / (double) (i + j + k);
                        double pi = (double) i / (double) (i + j + k);
                        double pj = (double) j / (double) (i + j + k);
                        double pk = (double) k / (double) (i + j + k);

                        if (i > 0) dp[i][j][k] += (pi * dp[i - 1][j][k]);
                        if (j > 0) dp[i][j][k] += (pj * dp[i + 1][j - 1][k]);
                        if (k > 0) dp[i][j][k] += (pk * dp[i][j + 1][k - 1]);
                    }
                }
            }

            out.println(dp[c1][c2][c3]);
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

