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
        DFlippingSigns solver = new DFlippingSigns();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFlippingSigns {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long a[] = new long[n];
            long dp[][] = new long[n][2];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            dp[0][0] = a[0] + a[1];
            dp[0][1] = -dp[0][0];
            for (int i = 1; i < n - 1; i++) {
                dp[i][0] = Math.max(dp[i - 1][0] + a[i + 1], dp[i - 1][1] + a[i + 1]);
                dp[i][1] = Math.max(dp[i - 1][0] - 2 * a[i] - a[i + 1], dp[i - 1][1] + 2 * a[i] - a[i + 1]);
            }
            out.println(Math.max(dp[n - 2][0], dp[n - 2][1]));
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

