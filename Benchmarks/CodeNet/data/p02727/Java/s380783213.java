import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.AbstractCollection;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author --
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        ERedAndGreenApples solver = new ERedAndGreenApples();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERedAndGreenApples {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int x = c.readInt(), y = c.readInt(), a = c.readInt(), b = c.readInt(), cc = c.readInt();
            int aa[] = c.readIntArray(a), bb[] = c.readIntArray(b), ccc[] = c.readIntArray(cc);
            Sort.mergeSort(aa, 0, a);
            Sort.mergeSort(bb, 0, b);
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 0; i < x; i++) {
                pq.add(aa[a - 1 - i]);
            }
            for (int i = 0; i < y; i++) {
                pq.add(bb[b - 1 - i]);
            }
            PriorityQueue<Integer> pp = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < cc; i++) {
                pp.add(ccc[i]);
            }
            if (!pp.isEmpty() && pq.peek() <= pp.peek()) {
                int lll = pp.poll();
                pq.poll();
                pq.add(lll);
            }

            long res = 0;
            for (int xx : pq) {
                res += xx;
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

