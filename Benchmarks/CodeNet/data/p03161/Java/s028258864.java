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
 * @author Abhas Jain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BFrog2 solver = new BFrog2();
        solver.solve(1, in, out);
        out.close();
    }

    static class BFrog2 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.ni(), k = in.ni();
            int[] ar = new int[n];
            for (int i = 0; i < n; ++i) {
                ar[i] = in.ni();
            }
            int[] dp = new int[n];
            for (int i = 1; i < n; ++i) {
                int ans = Integer.MAX_VALUE;
                for (int j = Math.max(0, i - k); j < i; ++j) {
                    ans = Math.min(ans, dp[j] + Math.abs(ar[j] - ar[i]));
                }
                dp[i] = ans;
            }
            out.print(dp[n - 1]);
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

        public int ni() {
            return Integer.parseInt(next());
        }

    }
}

