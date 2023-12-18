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
        EGetEverything solver = new EGetEverything();
        solver.solve(1, in, out);
        out.close();
    }

    static class EGetEverything {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int a[] = new int[m];
            int doa[] = new int[m];
            long dp[][] = new long[m + 1][(int) Math.pow(2, n)];
            for (int i = 0; i < m; i++) {
                a[i] = in.nextInt();
                int b = in.nextInt();
                for (int j = 0; j < b; j++) {
                    doa[i] |= 1 << in.nextInt() - 1;
                }
            }
            for (int i = 0; i <= m; i++) {
                for (int j = 0; j < Math.pow(2, n); j++) {
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
            dp[0][0] = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < Math.pow(2, n); j++) {
                    dp[i + 1][j] = dp[i + 1][j - (j & doa[i])] + a[i];
                    dp[i + 1][j] = Math.min(dp[i][j], dp[i + 1][j]);
                }
            }
            out.println(dp[m - 1][(int) Math.pow(2, n) - 1] != Integer.MAX_VALUE ? dp[m - 1][(int) Math.pow(2, n) - 1] : -1);
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

