import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
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
        MCandies solver = new MCandies();
        solver.solve(1, in, out);
        out.close();
    }

    static class MCandies {
        int MOD = (int) 1e9 + 7;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            long[] dp = new long[(int) 1e6];// dp[i] = number of ways to share 'i' candies
            long[] sum = new long[(int) 1e6];
            dp[0] = 1;
            for (int i = 0; i < N; i++) {
                int max = in.nextInt();
                for (int j = K; j >= 0; j--) {
                    // from dp[j + 1]  to dp[j + max] ... adding dp[j]
                    sum[j + 1] = (sum[j + 1] + dp[j]) % MOD;
                    sum[j + max + 1] = (sum[j + max + 1] - dp[j] + MOD) % MOD;
//                for(int k = 1; k <= max; k++){
//                    dp[k+j] = dp[k+j] + dp[j];
//                }
                }
                long net = 0;
                for (int j = 0; j < (int) 2e5; j++) {
                    net = (sum[j] + net) % MOD;
                    sum[j] = 0;
                    dp[j] = (dp[j] + net) % MOD;
                }
            }
            out.print(dp[K]);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

