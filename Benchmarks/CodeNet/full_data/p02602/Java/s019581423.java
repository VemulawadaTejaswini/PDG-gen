import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author New User
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        CMarks solver = new CMarks();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMarks {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt(), k = c.readInt();
            int[] a = c.readIntArray(n);

            BigInteger bi = new BigInteger("1");
            TreeSet<Integer> tt = new TreeSet<>();
            for (int i = 0; i < k; i++) {
                if (a[i] != 0) {
                    bi = bi.multiply(new BigInteger(a[i] + ""));
                } else {
                    tt.add(i);
                }
            }

            for (int i = k; i < n; i++) {
                BigInteger b2 = new BigInteger(bi.toString());
                if (a[i - k] != 0) {
                    b2 = b2.divide(new BigInteger(a[i - k] + ""));
                }
                if (a[i] != 0) {
                    b2 = b2.multiply(new BigInteger(a[i] + ""));
                }

                boolean bb1 = false, bb2 = false;
                {
                    if (tt.ceiling(i - k) != null && tt.ceiling(i - k) < k) {
                        bb1 = true;
                    }
                }
                {
                    if (tt.ceiling(i - k + 1) != null && tt.ceiling(i - k) <= k) {
                        bb2 = true;
                    }
                }
                if (bb2) {
                    w.printLine("No");
                } else {
                    if (bb1) {
                        w.printLine("Yes");
                    } else {
                        if (b2.compareTo(bi) > 0) {
                            w.printLine("Yes");
                        } else {
                            w.printLine("No");
                        }
                    }
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

        public int[] readIntArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = readInt();
            }
            return array;
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

