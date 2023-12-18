import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        static boolean ans = false;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = 4;
            List<Integer>[] g = GraphUtils.nextU(in, n, n - 1, true);
            dfs(g, 0, -1, new boolean[n]);
            out.println(ans ? "YES" : "NO");
        }

        public static void dfs(List<Integer>[] g, int cur, int par, boolean[] marked) {
            if (ans) return;
            marked[cur] = true;
            for (Integer next : g[cur]) {
                if (marked[next]) continue;
                dfs(g, next, cur, marked);
            }
            boolean ok = true;
            for (int i = 0; i < 4; ++i) ok &= marked[i];
            marked[cur] = false;
            if (ok) ans = true;
        }

    }

    static class GraphUtils {
        public static List<Integer>[] nextU(FastReader in, int n, int m, boolean oneIndexed) {
            int diff = oneIndexed ? 1 : 0;
            List<Integer>[] g = new List[n];
            for (int i = 0; i < n; ++i) g[i] = new ArrayList<>();
            for (int i = 0; i < m; ++i) {
                int u = in.nextInt() - diff;
                int v = in.nextInt() - diff;
                g[u].add(v);
                g[v].add(u);
            }
            return g;
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        private int pread() {
            if (pnumChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= pnumChars) {
                curChar = 0;
                try {
                    pnumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (pnumChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            int res = 0;
            do {
                if (c == ',') {
                    c = pread();
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

