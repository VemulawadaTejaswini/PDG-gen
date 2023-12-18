import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
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
 * @author L_aka_ryuga
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DFlippingSigns solver = new DFlippingSigns();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFlippingSigns {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.ni();
            long[] arr = in.nla(n);
            long[] brr = in.copyLongArray(arr);

            long sum = in.sumArray(arr);

            long newsum = sum;
            for (int i = 0; i < n - 1; ++i) {

                if (arr[i] <= 0) {
                    long val = newsum - 2 * arr[i] - 2 * arr[i + 1];
                    if (val >= newsum) {
                        arr[i] = -arr[i];
                        arr[i + 1] = -arr[i + 1];
                        newsum = val;
                    }
                }

            }

            long newsum2 = sum;
            for (int i = n - 1; i >= 1; --i) {

                if (brr[i] <= 0) {
                    long val = newsum2 - 2 * brr[i] - 2 * brr[i - 1];
                    if (val >= newsum2) {
                        brr[i] = -brr[i];
                        brr[i - 1] = -brr[i - 1];
                        newsum2 = val;
                    }
                }

            }

            out.println(Math.max(sum, Math.max(newsum, newsum2)));


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

        public int ni() {
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

        public long nl() {
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

        public long[] nla(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; ++i) array[i] = nl();
            return array;
        }

        public long sumArray(long[] arr) {
            long sum = 0;
            for (int i = 0; i < arr.length; i++)
                sum += arr[i];
            return sum;
        }

        public long[] copyLongArray(long[] arr) {
            long[] newarr = new long[arr.length];
            for (int i = 0; i < arr.length; ++i) newarr[i] = arr[i];
            return newarr;
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

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

    }
}

