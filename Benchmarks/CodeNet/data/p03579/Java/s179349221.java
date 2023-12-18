import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Vector;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
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
        OutputWriter out = new OutputWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        static int MAXN = 100000 + 10;
        Vector<Integer>[] vec = new Vector[MAXN];
        int co[] = new int[MAXN];
        boolean f;

        void dfs(int u, int fa, int ok) {
            co[u] = ok;
            int p = ok ^ 1;
            for (int i = 0; i < vec[u].size() && !f; i++) {
                if (vec[u].get(i) == fa) continue;
                if (co[vec[u].get(i)] == 0) {
                    dfs(vec[u].get(i), u, p);
                } else {
                    if (co[vec[u].get(i)] != p) {
                        f = true;
                        return;
                    }
                }
            }
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {

            int n, m;
            n = in.nextInt();
            m = in.nextInt();
            for (int i = 0; i < m; i++) {
                int a, b;
                a = in.nextInt();
                b = in.nextInt();
                vec[a].add(b);
                vec[b].add(a);
            }
            f = false;
            dfs(1, -1, 0);
            if (f == true) {
                out.println("%lld\n", (long) n * (n - 1) / 2 - m);
            } else {
                int ans1 = 0, ans2 = 0;
                for (int i = 1; i <= n; i++) {
                    if (co[i] == 0) ans1++;
                    else
                        ans2 += 1;
                }
                out.println("%ld\n", (long) ans1 * ans2 - m);
            }
            return;
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

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
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

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }
}

