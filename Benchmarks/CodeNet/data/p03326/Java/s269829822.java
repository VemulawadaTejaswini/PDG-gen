import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author gaidash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DPatisserieABC solver = new DPatisserieABC();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPatisserieABC {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            final int[] mult = {-1, 1};

            int n = in.nextInt();
            int nTake = in.nextInt();
            Cake[] a = new Cake[n];
            for (int i = 0; i < n; i++) a[i] = new Cake(in.nextLong(), in.nextLong(), in.nextLong());

            long ret = 0;
            for (int state = 0; state < (1 << 3); state++) {
                final int b = mult[state & 1];
                final int t = mult[(state >> 1) & 1];
                final int p = mult[(state >> 2) & 1];
                Arrays.sort(a, (o1, o2) -> Long.compare(o2.beauty * b + o2.taste * t + o2.pop * p,
                        o1.beauty * b + o1.taste * t + o1.pop * p));
                long sumb = 0, sumt = 0, sump = 0;
                for (int i = 0; i < nTake; i++) {
                    sumb += a[i].beauty;
                    sumt += a[i].taste;
                    sump += a[i].pop;
                }
                ret = Math.max(ret, Math.abs(sumb) + Math.abs(sumt) + Math.abs(sump));
            }

            out.println(ret);
        }

        private class Cake {
            long beauty;
            long taste;
            long pop;

            private Cake(long beauty, long taste, long pop) {
                this.beauty = beauty;
                this.taste = taste;
                this.pop = pop;
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

        public void println(long i) {
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

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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

