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
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mufaddal Naya
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DMovingPiece solver = new DMovingPiece();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMovingPiece {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
//    	w.print("Case #"+testNumber+": ");
            int n = c.readInt(), k = c.readInt();
            int[] p = c.readIntArray(n, -1), vv = c.readIntArray(n);

            long res = Utils.max(vv);
            for (int i = 0; i < n; i++) {
                long val = vv[p[i]], max = val;
                int cur = p[i], step = 1;
                ArrayList<Long> mx = new ArrayList<>();
                mx.add(val);
                while (cur != i && step != k) {
                    cur = p[cur];
                    val += vv[cur];
                    max = Math.max(val, max);
                    mx.add(max);
                    step++;
                }
                res = Math.max(res, max);
                if (step == k || val <= 0) {
                    continue;
                }
                long rr = k / step;
                val = val * rr;
                if (k % step != 0) {
                    val += Math.max(mx.get((k % step) - 1), 0);
                }
                res = Math.max(res, val);
            }
            w.printLine(res);
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

        public int[] readIntArray(int size, int x) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = readInt() + x;
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

    static class Utils {
        public static int max(int... a) {
            int max = a[0];
            for (int i = 1; i < a.length; i++) {
                max = Math.max(max, a[i]);
            }
            return max;
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
}

