import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Set;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

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
        agc013b solver = new agc013b();
        solver.solve(1, in, out);
        out.close();
    }

    static class agc013b {
        List[] g;
        boolean[] v;
        boolean isd = false;
        boolean zf = false;
        List<Integer> ans = new ArrayList<>();
        Set<Integer> l = new HashSet<>();
        int le = -1;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            g = new List[n];

            for (int i = 0; i < n; i++) {
                g[i] = new ArrayList();
            }

            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;

                g[a].add(b);
                g[b].add(a);
            }

            v = new boolean[n];

            dfs(0);

            v = new boolean[n];

            dfs2(le);

            out.println(ans.size());

            for (int num : ans) {
                out.print((num + 1) + " ");
            }
        }

        void dfs2(int u) {
            if (isd)
                return;

            v[u] = true;
            ans.add(u);
            if (u == 0) {
                zf = true;
            }
            if (ans.size() >= 2 && l.contains(u) && zf) {
                isd = true;
                return;
            }

            for (int ve : (List<Integer>) g[u]) {
                if (!v[ve]) {
                    dfs2(ve);
                }
            }
            if (!isd) {
                ans.remove(u);
                if (u == 0) {
                    zf = false;
                }
            }
        }

        void dfs(int u) {
            v[u] = true;

            int c = 0;
            for (int ve : (List<Integer>) g[u]) {
                if (!v[ve]) {
                    c++;
                    dfs(ve);
                }
            }

            if (c == 0) {
                le = u;
                l.add(u);
            }
            if (g[u].size() == 1 && u == 0) {
                l.add(u);
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

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
        }

    }
}

