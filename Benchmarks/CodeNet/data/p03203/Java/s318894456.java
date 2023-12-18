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
import java.util.Objects;
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
        DGridGame solver = new DGridGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class DGridGame {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            int n = in.nextInt();

            if (n == 0) {
                out.println(h);
                return;
            }

            List<pair> pairs = new ArrayList<>();
            Set<pair> spairs = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;

                pair cp = new pair(x, y);
                pairs.add(cp);
                spairs.add(cp);
            }

            int sr = 0;

            while (spairs.contains(new pair(sr + 1, 1))) {
                sr++;
            }

            for (int i = 0; i < sr; i++) {
                if (spairs.contains(new pair(i + 1, 0))) {
                    out.println(i + 1);
                    return;
                }
            }

            for (pair pair : pairs) {
                pair.x -= sr;
            }

            spairs.clear();

            for (pair pair : pairs) {
                spairs.add(pair);
            }

            pairs.sort((p1, p2) ->
            {
                if (p1.x == p2.x) {
                    return p1.y - p2.y;
                } else {
                    return p1.x - p2.x
                            ;
                }
            });


            for (int i = 0; i < n; i++) {
                int cx = pairs.get(i).x;
                int cy = pairs.get(i).y;

                if (cx <= 0)
                    continue;

                if (isv(cx - 1, cy) && !spairs.contains(new pair(cx - 1, cy))) {
                    out.println(cx + sr);
                    return;
                }
            }

            out.println(h);
        }

        boolean isv(int x, int y) {
            if (x >= y)
                return true;
            return false;
        }

        class pair {
            int x;
            int y;

            public pair(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                pair pair = (pair) o;
                return x == pair.x &&
                        y == pair.y;
            }

            public int hashCode() {
                return Objects.hash(x, y);
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

        public void close() {
            writer.close();
        }

        public void println(int i) {
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
}

