import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.stream.LongStream;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
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
        ETrBBnsformBBtion solver = new ETrBBnsformBBtion();
        solver.solve(1, in, out);
        out.close();
    }

    static class ETrBBnsformBBtion {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int[] s = in.readString().chars().map(c -> c - 'A' + 1).toArray();
            int[] t = in.readString().chars().map(c -> c - 'A' + 1).toArray();
            RangeSum ss = new RangeSum(s);
            RangeSum tt = new RangeSum(t);
            int n = in.readInt();
            for (int i = 0; i < n; i++) {
                int[] a = in.readIntArray(4);
                MiscUtils.decreaseByOne(a);
                long sum = ss.getSumClosed(a[0], a[1]) - tt.getSumClosed(a[2], a[3]);
                out.printLine(sum % 3 == 0 ? "YES" : "NO");
            }
        }

    }

    static class RangeSum {
        private long[] sum;

        public RangeSum(long[] arr) {
            sum = new long[arr.length + 1];
            System.arraycopy(arr, 0, sum, 1, arr.length);
            for (int i = 0; i < sum.length - 1; i++) {
                sum[i + 1] += sum[i];
            }
        }

        public RangeSum(int[] arr) {
            this(IntStream.of(arr).mapToLong(x -> x).toArray());
        }

        public long getSumClosed(int startInclusive, int endInclusive) {
            if (startInclusive > endInclusive || startInclusive < 0
                    || endInclusive >= sum.length) {
                throw new IllegalArgumentException();
            }

            return sum[endInclusive + 1] - sum[startInclusive];
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

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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

    static class MiscUtils {
        public static void decreaseByOne(int[]... arrays) {
            for (int[] array : arrays) {
                for (int i = 0; i < array.length; i++) {
                    array[i]--;
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
}

