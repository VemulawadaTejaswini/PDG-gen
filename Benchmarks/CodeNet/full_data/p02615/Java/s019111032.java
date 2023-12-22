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
 * @author New User
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DChatInACircle solver = new DChatInACircle();
        solver.solve(1, in, out);
        out.close();
    }

    static class DChatInACircle {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt();
            int a[] = c.readIntArray(n);
            Sort.mergeSort(a);
            long res = 0;
            int cur_power = 1, cur = 0;
            int ptr = n - 1;
            while (true) {
                if (cur + cur_power >= n - 1) {
                    for (int i = 0; i < cur_power && i + cur < n - 1; i++) {
                        res += a[ptr];
                    }
//				tr(res);
                    break;
                }
                res += cur_power * (long) a[ptr];
//    		tr(a[ptr], cur_power, res);
                ptr--;
                cur += cur_power;
                cur_power <<= 2;
            }

            w.printLine(res);
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

    static class Sort {
        public static void mergeSort(int[] a, int low, int high) {
            if (high - low < 2) {
                return;
            }
            int mid = (low + high) >>> 1;
            mergeSort(a, low, mid);
            mergeSort(a, mid, high);
            int[] b = Arrays.copyOfRange(a, low, mid);
            for (int i = low, j = mid, k = 0; k < b.length; i++) {
                if (j == high || b[k] <= a[j]) {
                    a[i] = b[k++];
                } else {
                    a[i] = a[j++];
                }
            }
        }

        public static void mergeSort(int[] a) {
            mergeSort(a, 0, a.length);
        }

    }
}

