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
 *
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DLamp solver = new DLamp();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLamp {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt();
            char[][] a = new char[n][];
            for (int i = 0; i < n; i++)
                a[i] = s.next().toCharArray();
            int[][][] dp = new int[4][n][m];

            for (int i = 0; i < n; i++) {

                if (a[i][0] == '.')
                    dp[0][i][0] = -1;

                for (int j = 1; j < m; j++)
                    if (a[i][j] == '.')
                        dp[0][i][j] = dp[0][i][j - 1];
                    else
                        dp[0][i][j] = j;
            }

            for (int i = 0; i < n; i++) {

                if (a[i][m - 1] == '.')
                    dp[2][i][m - 1] = m;
                else
                    dp[2][i][m - 1] = m - 1;

                for (int j = m - 2; j >= 0; j--) {
                    if (a[i][j] == '.')
                        dp[2][i][j] = dp[2][i][j + 1];
                    else
                        dp[2][i][j] = j;
                }
            }

            for (int j = 0; j < m; j++) {

                if (a[0][j] == '.')
                    dp[1][0][j] = -1;

                for (int i = 1; i < n; i++) {
                    if (a[i][j] == '.')
                        dp[1][i][j] = dp[1][i - 1][j];
                    else
                        dp[1][i][j] = i;
                }
            }

            for (int j = 0; j < m; j++) {

                if (a[n - 1][j] == '.')
                    dp[3][n - 1][j] = n;
                else
                    dp[3][n - 1][j] = n - 1;

                for (int i = n - 2; i >= 0; i--) {
                    if (a[i][j] == '.')
                        dp[3][i][j] = dp[3][i + 1][j];
                    else
                        dp[3][i][j] = i;
                }
            }

            int res = 0;

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {

                    if (a[i][j] == '#')
                        continue;

                    int can = 1;
                    can += dp[3][i][j] - i - 1;
                    can += i - dp[1][i][j] - 1;
                    can += dp[2][i][j] - j - 1;
                    can += j - dp[0][i][j] - 1;
                    res = Math.max(can, res);
                }
            }

            w.println(res);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
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

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return nextString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

