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
        ESumEqualsXor solver = new ESumEqualsXor();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESumEqualsXor {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String x = in.next();
            long mod = 10000_0000_7;
            long dp[] = new long[x.length() + 1];
            long dp2[] = new long[x.length() + 1];
            dp2[0] = 1;
            for (int i = 1; i <= x.length(); i++) {
                if (x.charAt(i - 1) == '1') {
                    dp2[i] = (2 * dp2[i - 1]) % mod;
                    dp[i] = (3 * dp[i - 1] + dp2[i - 1]) % mod;
                } else {
                    dp2[i] = dp2[i - 1] % mod;
                    dp[i] = (3 * dp[i - 1]) % mod;
                }
            }
            out.println((dp[x.length()] + dp2[x.length()]) % mod);
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

    }
}

