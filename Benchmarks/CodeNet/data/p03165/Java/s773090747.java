import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Shivam
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FLCS solver = new FLCS();
        solver.solve(1, in, out);
        out.close();
    }

    static class FLCS {
        int[][] dp;

        public int lcs(char[] c, char[] s, int n, int m) {
            if (n == 0 || m == 0)
                dp[n][m] = 0;
            else if (c[n - 1] == s[m - 1])
                dp[n][m] = 1 + lcs(c, s, n - 1, m - 1);
            else if (dp[n][m] == -1)
                dp[n][m] = Math.max(lcs(c, s, n - 1, m), lcs(c, s, n, m - 1));
            return dp[n][m];
        }

        public String trace(char[] c, char[] s, int n, int m) {
            String st = "";
            while (n > 0 && m > 0) {
                if (c[n - 1] == s[m - 1]) {
                    st = c[n - 1] + st;
                    n--;
                    m--;
                } else if (dp[n - 1][m] > dp[n][m - 1])
                    n--;
                else
                    m--;
            }
            return st;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            char[] c = in.nextString().toCharArray();
            char[] s = in.nextString().toCharArray();
            int n = c.length;
            int m = s.length;
            dp = new int[n + 1][m + 1];
            for (int i = 0; i <= n; i++)
                Arrays.fill(dp[i], -1);
            int answer = lcs(c, s, n, m);
            //out.println(answer);
            String st = trace(c, s, n, m);
            out.println(st);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

