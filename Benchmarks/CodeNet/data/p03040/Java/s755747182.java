import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
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
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FAbsoluteMinima solver = new FAbsoluteMinima();
        solver.solve(1, in, out);
        out.close();
    }

    static class FAbsoluteMinima {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int q = in.nextInt();

            long sumb = 0;

            PriorityQueue<Long> min = new PriorityQueue<>((x, y) -> Long.compare(y, x));
            PriorityQueue<Long> max = new PriorityQueue<>((x, y) -> Long.compare(x, y));

            long minsum = 0;
            long maxsum = 0;

            while (q-- > 0) {
                int t = in.nextInt();

                if (t == 1) {
                    long a = in.nextInt();
                    long b = in.nextInt();

                    sumb += b;

                    if (min.isEmpty() || a <= min.peek()) {
                        min.add(a);
                        minsum += a;
                    } else {
                        max.add(a);
                        maxsum += a;
                    }

                    while (max.size() > min.size()) {
                        long peek = max.poll();
                        min.add(peek);

                        maxsum -= peek;
                        minsum += peek;
                    }

                    while (min.size() > max.size() + 1) {
                        long peek = min.poll();
                        max.add(peek);

                        minsum -= peek;
                        maxsum += peek;
                    }
                } else {

                    long mini = min.peek();

                    long ans = 0;

                    ans += ((long) min.size() * mini) - minsum;

                    ans += maxsum - ((long) max.size() * mini);

                    out.println(mini + " " + (ans + sumb));
                }
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

        public void println(Object... objects) {
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

