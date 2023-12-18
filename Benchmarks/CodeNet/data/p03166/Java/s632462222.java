import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        GLongestPath solver = new GLongestPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class GLongestPath {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.ni(), m = in.ni();
            LinkedList<Integer> g[] = new LinkedList[n];
            for (int i = 0; i < n; i++) g[i] = new LinkedList<>();
            for (int i = 0; i < m; i++) {
                int u = in.ni() - 1, v = in.ni() - 1;
                g[u].add(v);
            }
            int dp[] = new int[n];
            Arrays.fill(dp, -1);
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (dp[i] == -1) {
                    dfs(i, g, dp);
                }
                max = Math.max(max, dp[i]);
            }
            out.println(max);
        }

        private void dfs(int i, LinkedList<Integer>[] g, int[] dp) {
            int max = 0;
            for (int c : g[i]) {
                if (dp[c] == -1) {
                    dfs(c, g, dp);
                }
                max = Math.max(max, dp[c] + 1);
            }
            dp[i] = max;
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
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int ni() {
            return nextInt();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

