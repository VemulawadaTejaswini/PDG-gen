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
 * @author prakharjain
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
            int n = in.nextInt();

            Integer[] a = in.nextIntArrayBoxed(n);

            Arrays.sort(a);

            int neg = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] < 0) {
                    neg++;
                }
            }

            if (neg == 0) {

                long ans = 0;

                for (int i = 1; i < n; i++) {
                    ans += a[i];
                }

                ans -= a[0];

                out.println(ans);

                long num = a[0];
                for (int i = 1; i < n - 1; i++) {
                    out.println(num + " " + a[i]);
                    num -= a[i];
                }

                out.println(a[n - 1] + " " + num);
            } else if (neg == n) {
                long ans = 0;

                for (int i = 0; i < n - 1; i++) {
                    ans -= a[i];
                }

                ans += a[n - 1];

                out.println(ans);

                long num = a[n - 1];
                for (int i = 0; i < n - 1; i++) {
                    out.println(num + " " + a[i]);
                    num -= a[i];
                }
            } else {
                long ans = 0;

                for (int i = 0; i < n; i++) {
                    ans += Math.abs(a[i]);
                }

                out.println(ans);

                long num = a[n - 1];

                for (int i = 0; i < neg - 1; i++) {
                    out.println(num + " " + a[i]);
                    num -= a[i];
                }

                long num2 = a[neg - 1];

                for (int i = neg; i < n - 1; i++) {
                    out.println(num2 + " " + a[i]);
                    num2 -= a[i];
                }

                out.println(num + " " + num2);
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

        public Integer[] nextIntArrayBoxed(int n) {
            Integer[] array = new Integer[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

