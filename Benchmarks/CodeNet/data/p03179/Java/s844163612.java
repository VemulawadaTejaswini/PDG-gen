import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jenish
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TPermutation solver = new TPermutation();
        solver.solve(1, in, out);
        out.close();
    }

    static class TPermutation {
        private static final long mod = (long) (1e9 + 7);

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            long dp[][] = new long[n + 5][n + 5];
            long pre[] = new long[n + 5];
            String s = in.scanString();
            dp[1][1] = 1;
            pre[1] = 1;
            for (int i = 1; i <= n; i++) pre[i] = (pre[i] + pre[i - 1]) % mod;
            for (int len = 2; len <= n; len++) {
                for (int b = 1; b <= len; b++) {
                    int l, r;
                    if (s.charAt(len - 2) == '>') {
                        l = b;
                        r = len - 1;
                    } else {
                        l = 1;
                        r = b - 1;
                    }
                    long temp = pre[r] - pre[l - 1];
                    while (temp < 0) temp += mod;
                    dp[len][b] = (dp[len][b] + (temp)) % mod;
                }
                for (int i = 1; i <= n; i++) pre[i] = dp[len][i] % mod;
                for (int i = 1; i <= n; i++) pre[i] = (pre[i] + pre[i - 1]) % mod;

            }
            long ans = 0;
            for (int i = 1; i <= n; i++) ans = (ans + dp[n][i]) % mod;
            out.println(ans);
        }

    }

    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int INDEX;
        private BufferedInputStream in;
        private int TOTAL;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (INDEX >= TOTAL) {
                INDEX = 0;
                try {
                    TOTAL = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (TOTAL <= 0) return -1;
            }
            return buf[INDEX++];
        }

        public int scanInt() {
            int I = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    I *= 10;
                    I += n - '0';
                    n = scan();
                }
            }
            return neg * I;
        }

        public String scanString() {
            int c = scan();
            while (isWhiteSpace(c)) c = scan();
            StringBuilder RESULT = new StringBuilder();
            do {
                RESULT.appendCodePoint(c);
                c = scan();
            } while (!isWhiteSpace(c));
            return RESULT.toString();
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

    }
}

