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
        ICoins solver = new ICoins();
        solver.solve(1, in, out);
        out.close();
    }

    static class ICoins {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            double p[] = new double[n + 1];
            for (int i = 1; i <= n; i++) {
                p[i] = in.scanDouble();
            }
            double dp[][] = new double[n + 1][n + 1];
            dp[0][0] = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    dp[i][j + 1] += (dp[i - 1][j] * p[i]);
                    dp[i][j] += dp[i - 1][j] * (1 - p[i]);
                }
            }


            double ans = 0;
            for (int j = 0; j <= n; j++) {
                int h = j;
                int t = n - j;
                if (h > t) {
                    ans += dp[n][j];
                }
            }

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

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

        public double scanDouble() {
            int c = scan();
            while (isWhiteSpace(c)) c = scan();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = scan();
            }
            double RESULT = 0;
            while (!isWhiteSpace(c) && c != '.') {
                if (c == 'e' || c == 'E') {
                    return RESULT * Math.pow(10, scanInt());
                }
                RESULT *= 10;
                RESULT += c - '0';
                c = scan();
            }
            if (c == '.') {
                c = scan();
                double m = 1;
                while (!isWhiteSpace(c)) {
                    if (c == 'e' || c == 'E') {
                        return RESULT * Math.pow(10, scanInt());
                    }
                    m /= 10;
                    RESULT += (c - '0') * m;
                    c = scan();
                }
            }
            return RESULT * sgn;
        }

    }
}

