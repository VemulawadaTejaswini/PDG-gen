import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Stack;
import java.util.Vector;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        OutputWriter out = new OutputWriter(outputStream);
        FLCSEditorial solver = new FLCSEditorial();
        solver.solve(1, in, out);
        out.close();
    }

    static class FLCSEditorial {
        int[][] dp;

        int lcs(char[] c1, char[] c2, int n, int m) {
            if (dp[n][m] == -1) {
                if (n == 0 || m == 0)
                    dp[n][m] = 0;
                else if (c1[n - 1] == c2[m - 1])
                    dp[n][m] = 1 + lcs(c1, c2, n - 1, m - 1);
                else {
                    int v1 = lcs(c1, c2, n - 1, m);
                    int v2 = lcs(c1, c2, n, m - 1);
                    dp[n][m] = Math.max(v1, v2);
                }
            }
            return dp[n][m];
        }

        void trace(char[] c1, char[] c2) {
            int n = c1.length;
            int m = c2.length;
            int i = n;
            int j = m;
            Stack<Character> s = new Stack<>();
            while (true) {
                if (n == 0 || m == 0 || dp[n][m] == 0)
                    break;
                if (n - 1 >= 0 && dp[n - 1][m] == dp[n][m])
                    n--;
                else if (m - 1 >= 0 && dp[n][m - 1] == dp[n][m])
                    m--;
                else {
                    s.push(c1[n - 1]);
                    n--;
                    m--;
                }
            }
            while (!s.isEmpty())
                System.out.print(s.pop());
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            char c1[] = in.nextString().toCharArray();
            char c2[] = in.nextString().toCharArray();
            int n = c1.length;
            int m = c2.length;
            dp = new int[n + 1][m + 1];
            for (int[] x : dp)
                Arrays.fill(x, -1);
            lcs(c1, c2, n, m);
            trace(c1, c2);
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

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

    }
}

