import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        CSuccessiveSubtraction solver = new CSuccessiveSubtraction();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSuccessiveSubtraction {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int[] a = in.readIntArray(n);

            boolean allMinus = Arrays.stream(a).allMatch(x -> x < 0);
            boolean allPlus = Arrays.stream(a).allMatch(x -> x > 0);

            long absSum = 0;
            for (int i = 0; i < n; i++) {
                absSum += Math.abs(a[i]);
            }

            if (allMinus) {
                int maxIndex = 0;
                for (int i = 0; i < n; i++) {
                    if (a[maxIndex] < a[i]) maxIndex = i;
                }
                out.printLine(absSum + 2 * a[maxIndex]);

                for (int i = 0; i < n; i++) {
                    if (i == maxIndex) continue;
                    out.printLine(a[maxIndex] + " " + a[i]);
                    a[maxIndex] -= a[i];
                }
                return;
            }

            if (allPlus) {
                int minIndex = 0;
                for (int i = 0; i < n; i++) {
                    if (a[minIndex] > a[i]) minIndex = i;
                }
                out.printLine(absSum - 2 * a[minIndex]);

                if (minIndex == 0) {
                    for (int i = 2; i < n; i++) {
                        out.printLine(a[minIndex] + " " + a[i]);
                        a[minIndex] -= a[i];
                    }
                    out.printLine(a[1] + " " + a[minIndex]);
                } else {
                    for (int i = 1; i < n; i++) {
                        if (i == minIndex) continue;
                        out.printLine(a[minIndex] + " " + a[i]);
                        a[minIndex] -= a[i];
                    }
                    out.printLine(a[0] + " " + a[minIndex]);
                }
                return;
            }

            Arrays.sort(a);
            out.printLine(absSum);
            for (int i = 1; i < n - 1; i++) {
                if (a[i] > 0) {
                    out.printLine(a[0] + " " + a[i]);
                    a[0] -= a[i];
                } else {
                    out.printLine(a[n - 1] + " " + a[i]);
                    a[n - 1] -= a[i];
                }
            }
            out.printLine(a[n - 1] + " " + a[0]);
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

        public void printLine(long i) {
            writer.println(i);
        }

    }
}

