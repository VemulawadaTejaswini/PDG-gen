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
        to_infinity solver = new to_infinity();
        solver.solve(1, in, out);
        out.close();
    }

    static class to_infinity {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            String s = in.scanString();
            long n = s.length();
            long totals_sum = 0;
            long k = in.scanLong();
            long a = 5000000000000000l;
            for (int i = 0; i < n; i++) {
                long p = power(s.charAt(i) - '0', a);
                if (p <= 0) {
                    out.println(s.charAt(i));
                    return;
                }
                totals_sum = ((totals_sum) + p);
                if (totals_sum >= k || totals_sum <= 0) {
                    out.println(s.charAt(i));
                    return;
                }
            }
        }

        public static long power(long x, long y) {
            long res = 1;
            x = x;
            while (y > 0) {
                if ((y & 1) != 0)
                    res = (res * x);
                y = y >> 1;
                x = (x * x);
            }
            return res;
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

    }
}

