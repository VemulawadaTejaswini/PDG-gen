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
 * @author Pranay2516
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Atcoder_F solver = new Atcoder_F();
        solver.solve(1, in, out);
        out.close();
    }

    static class Atcoder_F {
        int[][] dp = new int[3000][3000];
        int[][] choice = new int[3000][3000];

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            char s[] = in.next().toCharArray(), t[] = in.next().toCharArray();
            int n = s.length, m = t.length;
            StringBuilder str = new StringBuilder();
            dp[0][0] = 0;
            if (s[0] == t[0]) {
                dp[0][0] = 1;
                choice[0][0] = 2;
            }
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    if (i > 0) {
                        dp[i][j] = dp[i - 1][j];
                        choice[i][j] = 0;
                    }
                    if (j > 0) {
                        if (dp[i][j - 1] > dp[i][j]) {
                            dp[i][j] = dp[i][j - 1];
                            choice[i][j] = 1;
                        }

                    }
                    if (s[i] == t[j]) {
                        int ans = 1;
                        if (i > 0 && j > 0) {
                            ans = 1 + dp[i - 1][j - 1];
                        }
                        if (ans > dp[i][j]) {
                            dp[i][j] = ans;
                            choice[i][j] = 2;
                        }
                    }
                }
            }
            int i = n - 1, j = m - 1;
            while (i >= 0 && j >= 0) {
                if (choice[i][j] == 0) i--;
                else if (choice[i][j] == 1) j--;
                else {
                    str.append(s[i]);
                    i--;
                    j--;
                }
            }
            out.println(str.reverse());
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

