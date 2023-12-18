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
        LDeque solver = new LDeque();
        solver.solve(1, in, out);
        out.close();
    }

    static class LDeque {
        long[] arr;
        long[][][] dp;

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            arr = new long[n];
            in.scanLong(arr);
            dp = new long[n][n][2];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j][1] = dp[i][j][0] = -1;
                }
            }

            for (int l = 1; l <= n; l++) {
                for (int i = 0; i < n; i++) {
                    int j = i + l - 1;
                    if (j >= n) continue;
                    if (i == j) {
                        dp[i][j][0] = arr[i];
                        dp[i][j][1] = -arr[i];
                        continue;
                    }
                    if (i > j) {
                        dp[i][j][0] = 0;
                        dp[i][j][1] = 0;
                        continue;
                    }
                    dp[i][j][0] = Math.max(arr[i] + dp[i + 1][j][1], arr[j] + dp[i][j - 1][1]);
                    dp[i][j][1] = Math.min(-arr[i] + dp[i + 1][j][0], -arr[j] + dp[i][j - 1][0]);
                }
            }
            out.println(dp[0][n - 1][0]);

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

        public long scanLong() {
            long I = 0;
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

        public void scanLong(long[] A) {
            for (int i = 0; i < A.length; i++) A[i] = scanLong();
        }

    }
}

