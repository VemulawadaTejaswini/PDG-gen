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
        FLCS solver = new FLCS();
        solver.solve(1, in, out);
        out.close();
    }

    static class FLCS {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {

            String s = in.scanString();
            String t = in.scanString();
            long dp[][] = new long[s.length() + 1][t.length() + 1];
            for (int i = 0; i <= s.length(); i++) {
                for (int j = 0; j <= t.length(); j++) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 0;
                        continue;
                    }

                    if (s.charAt(i - 1) == t.charAt(j - 1)) {
                        dp[i][j] = Math.max(dp[i][j], 1 + dp[i - 1][j - 1]);
                    } else {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                        dp[i][j] = Math.max(dp[i][j], dp[i][j - 1]);
                    }

                }
            }


            int index = (int) dp[s.length()][t.length()];


            char lcs[] = new char[index + 1];
            lcs[index] = '$';


            int i = s.length(), j = t.length();
            while (i > 0 && j > 0) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    lcs[index - 1] = s.charAt(i - 1);
                    i--;
                    j--;
                    index--;
                } else if (dp[i - 1][j] > dp[i][j - 1])
                    i--;
                else
                    j--;
            }

            for (int k = 0; k < dp[s.length()][t.length()]; k++) out.print(lcs[k]);
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

    }
}

