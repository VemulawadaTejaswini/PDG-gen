import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        SDigitSum solver = new SDigitSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class SDigitSum {
        String str;
        int d;
        long[][] dp;
        private static final long mod = (long) (1e9 + 7);

        long digitDp(int index, int sum, boolean tight) {
            if (index == str.length()) return ((sum % d) == 0) ? 1 : 0;
            if (!tight && dp[index][sum] != -1) return dp[index][sum];
            long ans = 0;
            int kk = (tight) ? str.charAt(index) - '0' : 9;
            for (int i = 0; i <= kk; i++) {
                boolean new_tight = (str.charAt(index) - '0' == i) ? tight : false;
                ans = (ans + digitDp(index + 1, (sum + i) % d, new_tight)) % mod;
            }
            if (!tight) dp[index][sum] = ans;
            return ans;
        }

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            str = in.scanString();
            d = in.scanInt();
            dp = new long[str.length() + 5][d];
            for (int i = 0; i < str.length() + 5; i++) Arrays.fill(dp[i], -1);
            long ans = digitDp(0, 0, true);
            ans--;
            while (ans < 0) ans += mod;
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

