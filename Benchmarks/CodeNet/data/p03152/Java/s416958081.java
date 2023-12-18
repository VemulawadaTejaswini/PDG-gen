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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DDoubleLandscape solver = new DDoubleLandscape();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDoubleLandscape {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int m = in.readInt();
            int[] a = in.readIntArray(n);
            int[] b = in.readIntArray(m);
            MiscUtils.decreaseByOne(a, b);

            boolean[] aa = new boolean[n * m];
            boolean[] bb = new boolean[n * m];
            for (int i = 0; i < n; i++) aa[a[i]] = true;
            for (int i = 0; i < m; i++) bb[b[i]] = true;

            int aCnt = 0;
            int bCnt = 0;
            Modulo.mod = MiscUtils.MOD7;
            Modulo ans = new Modulo(1);
            for (int i = n * m - 1; i >= 0; i--) {
                if (aa[i] && bb[i]) {
                    if (aCnt == n || bCnt == m) {
                        out.printLine(0);
                        return;
                    }
                    aCnt++;
                    bCnt++;
                } else if (aa[i]) {
                    if (aCnt == n || bCnt == 0) {
                        out.printLine(0);
                        return;
                    }
                    ans.mlt(bCnt);
                    aCnt++;
                } else if (bb[i]) {
                    if (bCnt == m || aCnt == 0) {
                        out.printLine(0);
                        return;
                    }
                    ans.mlt(aCnt);
                    bCnt++;
                } else {
                    if (aCnt == 0 || bCnt == 0) {
                        out.printLine(0);
                        return;
                    }
                    ans.mlt(aCnt * bCnt - (m * n - 1 - i));
                }
            }

            out.printLine(ans);
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

        public void printLine(int i) {
            writer.println(i);
        }

    }

    static class Modulo {
        public static long mod;
        private long value;

        public Modulo(long value) {
            this.value = (value % mod + mod) % mod;
        }

        public static long mlt(long a, long b) {
            return ((a % mod + mod) * (b % mod + mod)) % mod;
        }

        public Modulo mlt(long a) {
            setValue(mlt(value, a));
            return this;
        }

        public void setValue(long value) {
            this.value = value;
        }

        public String toString() {
            return "" + value;
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

    static class MiscUtils {
        public static final int MOD7 = (int) (1e9 + 7);

        public static void decreaseByOne(int[]... arrays) {
            for (int[] array : arrays) {
                for (int i = 0; i < array.length; i++) {
                    array[i]--;
                }
            }
        }

    }
}

