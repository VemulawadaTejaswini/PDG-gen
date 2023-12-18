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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EVirusTree2 solver = new EVirusTree2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EVirusTree2 {
        long[] t;
        long[] t2;
        Modulo m = new Modulo(MiscUtils.MOD7);
        long ans = 1;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int k = in.readInt();
            Graph g = new Graph(n);

            if (n == 1) {
                out.printLine(k);
                return;
            }

            t = new long[k];
            t[0] = k;
            for (int i = 1; i < k; i++) {
                t[i] = m.mlt(t[i - 1], k - i);
            }

            for (int i = 0; i < n - 1; i++) {
                int from = in.readInt() - 1;
                int to = in.readInt() - 1;
                g.addUndirectedEdge(from, to);
            }

            for (int i = 0; i < n; i++) {
                if (g.get(i).size() >= k) {
                    out.printLine(0);
                    return;
                }
            }

            if (g.get(0).size() == n - 1) {
                out.printLine(t[n]);
                return;
            }

            t2 = new long[k - 2];
            t2[0] = k - 2;
            for (int i = 1; i < k - 2; i++) {
                t2[i] = m.mlt(t2[i - 1], k - 2 - i);
            }

            f(g, 0, -1);

            out.printLine(m.mlt(ans, t[g.get(0).size()]));
        }

        private void f(Graph g, int i, int p) {
            for (int to : g.get(i)) {
                if (to == p) continue;
                f(g, to, i);
                int cn = g.get(to).size() - 1;
                if (cn == 0) continue;
                ans = m.mlt(ans, t2[cn - 1]);
            }
        }

    }

    static class MiscUtils {
        public static final int MOD7 = (int) (1e9 + 7);

    }

    static class Graph {
        private int n;
        private List<Set<Integer>> g;

        public Graph(int n) {
            this.n = n;
            g = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                g.add(new HashSet<>());
            }
        }

        public void addUndirectedEdge(int from, int to) {
            g.get(from).add(to);
            g.get(to).add(from);
        }

        public Set<Integer> get(int from) {
            return g.get(from);
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

        public void printLine(long i) {
            writer.println(i);
        }

        public void printLine(int i) {
            writer.println(i);
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

        public int readInt() {
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

    static class Modulo {
        long m;

        public Modulo(long m) {
            this.m = m;
        }

        public long mlt(long a, long b) {
            return (a * b) % m;
        }

    }
}

