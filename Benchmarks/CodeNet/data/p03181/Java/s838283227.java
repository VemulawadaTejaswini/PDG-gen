import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        VSubtree solver = new VSubtree();
        solver.solve(1, in, out);
        out.close();
    }

    static class VSubtree {
        List[] g;
        int n;
        int m;
        long[] sub;
        long[] dp;
        long[] ans;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            n = in.nextInt();

            m = in.nextInt();

            g = new List[n];

            in.readUndirectedGraph(g, n, n - 1, 1);

            sub = new long[n];
            dp = new long[n];
            ans = new long[n];

            dfs(0, -1);

            dfs2(0, -1, -1, -1);

            for (int i = 0; i < n; i++) {
                out.println(ans[i]);
            }

        }

        void dfs(int u, int p) {
            sub[u] = 1;
            for (int i = 0; i < g[u].size(); i++) {
                int v = (int) g[u].get(i);

                if (v != p) {
                    dfs(v, u);
                    sub[u] *= (1 + sub[v]);
                    sub[u] %= m;
                }
            }
        }

        void dfs2(int u, int p, long prep, long sufp) {

            if (u == 0) {
                dp[0] = 1;
                ans[0] = sub[0];
            } else {
                long val = ((prep * sufp) % m) * dp[p];
                dp[u] = 1 + val;
                dp[u] %= m;

                ans[u] += (sub[u] * dp[u]) % m;
                ans[u] %= m;
            }

            int cc = g[u].size();

            if (u != 0) {
                cc--;
            }

            if (cc == 0)
                return;

            long[] val = new long[cc];
            long[] pre = new long[cc + 1];
            long[] suf = new long[cc + 2];

            for (int i = 0, j = 0; i < g[u].size(); i++) {
                int v = (int) g[u].get(i);

                if (v != p) {
                    val[j] = 1 + sub[v];
                    val[j] %= m;
                    j++;
                }
            }

            pre[0] = 1;

            for (int i = 0; i < cc; i++) {
                pre[i + 1] = pre[i] * val[i];
                pre[i + 1] %= m;
            }

            suf[cc + 1] = 1;

            for (int i = cc - 1; i >= 0; i--) {
                suf[i + 1] = suf[i + 2] * val[i];
                suf[i + 1] %= m;
            }

            for (int i = 0, j = 1; i < g[u].size(); i++) {
                int v = (int) g[u].get(i);

                if (v != p) {
                    dfs2(v, u, pre[j - 1], suf[j + 1]);
                    j++;
                }
            }
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public void readUndirectedGraph(List[] g, int numOfVertices, int numOfEdges, int offset) {
            for (int i = 0; i < numOfVertices; i++) {
                g[i] = new ArrayList();
            }

            for (int i = 0; i < numOfEdges; i++) {
                int u = nextInt() - offset;
                int v = nextInt() - offset;

                g[u].add(v);
                g[v].add(u);
            }
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

        public void println(long i) {
            writer.println(i);
        }

    }
}

