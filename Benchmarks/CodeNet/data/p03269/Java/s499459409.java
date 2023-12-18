import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int L = in.readInt();
            List<D.Edge> edges = solve(L);

            int n = 0;
            for (D.Edge e : edges) {
                n = Math.max(n, e.x);
                n = Math.max(n, e.y);
            }
            n++;

            for (D.Edge e : edges) {
                e.normalize(n);
            }

            out.printLine(n + " " + edges.size());
            for (D.Edge e : edges) {
                out.printLine(e.x + " " + e.y + " " + e.w);
            }
        }

        private List<D.Edge> solve(int L) {
            int n = getVertCount(L);
            List<D.Edge> edges = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                edges.add(new D.Edge(i + 1, i, 0));
                edges.add(new D.Edge(i + 1, i, 1 << i));
            }
            if ((L & (L - 1)) == 0) {
                return edges;
            }
            int have = Integer.highestOneBit(L);
            while (have < L) {
                int bit = Integer.numberOfTrailingZeros(Integer.highestOneBit(L - have));
                int pw = 19;
                while (have + (1 << pw) - 1 >= L) {
                    pw--;
                }
                edges.add(new D.Edge(n - 1, pw, have));
                have += 1 << bit;
            }
            if (n < 1 || n > 20) {
                throw new AssertionError();
            }
            if (edges.size() > 60) {
                throw new AssertionError();
            }
            return edges;
        }

        private int getVertCount(int L) {
            return Integer.numberOfTrailingZeros(Integer.highestOneBit(L)) + 1;
        }

        static class Edge {
            int x;
            int y;
            int w;

            public Edge(int x, int y, int w) {
                this.x = x;
                this.y = y;
                this.w = w;
            }

            public void normalize(int n) {
                x = n - x;
                y = n - y;
            }

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

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
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
}

