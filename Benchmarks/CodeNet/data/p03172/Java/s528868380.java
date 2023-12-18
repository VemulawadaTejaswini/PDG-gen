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
        MCandies solver = new MCandies();
        solver.solve(1, in, out);
        out.close();
    }

    static class MCandies {
        private static final long mod = (long) (1e9 + 7);

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            int k = in.scanInt();
            long dp[] = new long[k + 5];

            dp[0] = 1;

            for (int i = 0; i < n; i++) {
                long x = in.scanInt();
                long aux[] = new long[k + 5];
                for (int used_ = k; used_ >= 0; --used_) {
                    long tmp = dp[used_];
                    int l = used_ + 1;
                    int r = (int) (used_ + Math.min(x, k - used_));
                    aux[l] += (aux[l] + tmp) % mod;
                    if (r + 1 <= k + 1) {
                        aux[(r + 1)] -= tmp;
                        while (aux[(r + 1)] < 0) aux[r + 1] += mod;
                    }
                }
                for (int j = 1; j <= k; j++) aux[j] = (aux[j] + aux[j - 1]) % mod;
                for (int j = 0; j <= k; j++) dp[j] = (dp[j] + aux[j]) % mod;
            }
            out.println(dp[k]);
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

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

    }
}

