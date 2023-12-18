import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    static void solve(MyScanner in, MyWriter out) {
        int h = in.nextInt();
        int w = in.nextInt();
        int k = in.nextInt();
        long[][] s = new long[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                s[i][j] = in.nextChar() == '1' ? 1 : 0;
            }
        }
        Cumulation2D c = new Cumulation2D(s);
        int answer = Integer.MAX_VALUE;
        for (int bit = 0; bit < (1 << (h - 1)); bit++) {
            int from = 0;
            List<Range> ranges = new ArrayList<>();
            for (int i = 0; i < (h - 1); i++) {
                if (((bit >> i) & 1) != 0) {
                    ranges.add(new Range(from, i + 1));
                    from = i + 1;
                }
            }
            ranges.add(new Range(from, h));

            int count = verticalCutCount(w, k, ranges, c);
            if (count == -1) {
                continue;
            }
            answer = Math.min(answer, count + Integer.bitCount(bit));
        }
        out.println(answer);
    }
    static int verticalCutCount(int w,
                                int k,
                                List<Range> ranges,
                                Cumulation2D c) {
        int result = 0;
        outer : for (int wFrom = 0, wTo = 1; wTo <= w;) {
            for (Range h : ranges) {
                if (c.rect(h.from, wFrom, h.to, wTo) <= k) {
                    continue;
                }
                if (wTo - wFrom == 1) {
                    return -1;
                }
                result++;
                wFrom = wTo - 1;
                continue outer;
            }
            wTo++;
        }
        return result;
    }
    static final class Range {
        final int from;
        final int to;
        Range(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }
    static final class Cumulation2D {
        final long[][] s;
        Cumulation2D(long[][] a) {
            int h = a.length;
            int w = a[0].length;
            s = new long[h + 1][w + 1];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    s[i + 1][j + 1] =
                            s[i + 1][j] + s[i][j + 1] - s[i][j] + a[i][j];
                }
            }
        }
        long rect(int i1, int j1, int i2, int j2) {
            if (i2 < i1 || j2 < j1) {
                throw new IllegalArgumentException();
            }
            return s[i2][j2] - s[i2][j1] - s[i1][j2] + s[i1][j1];
        }
    }
    public static void main(String[] args) {
        MyWriter w = new MyWriter(System.out);
        solve(new MyScanner(System.in), w);
        w.flush();
    }
    static final class MyScanner {
        static final int BUFFER_SIZE = 8192;
        private final InputStream in;
        private final byte[] buffer = new byte[BUFFER_SIZE];
        private int point;
        private int readLength;

        MyScanner(InputStream in) {
            this.in = in;
        }
        private byte readByte() {
            if (point < readLength) {
                byte result = buffer[point];
                point += 1;
                return result;
            }
            try {
                readLength = in.read(buffer);
            } catch (IOException e) {
                throw new AssertionError(null, e);
            }
            if (readLength == -1) {
                return -1;
            }
            point = 1;
            return buffer[0];
        }
        private static boolean isPrintableCharExceptSpace(byte c) {
            return 33 <= c && c <= 126;
        }
        public char nextChar() {
            byte c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            return (char)c;
        }
        public String next() {
            return next(16);
        }
        public String next(int n) {
            byte c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            StringBuilder b = new StringBuilder(n);
            do {
                b.append((char)c);
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return b.toString();
        }
        public long nextLong() {
            byte c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long result = 0L;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                result = result * 10L + (c - '0');
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return minus ? -result : result;
        }
        public int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
                throw new InputMismatchException();
            }
            return (int)n;
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        public int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextInt();
            }
            return result;
        }
        public long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
        }
        public char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextChar();
            }
            return result;
        }
        public char[][] next2dCharArray(int n, int m) {
            char[][] result = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = nextChar();
                }
            }
            return result;
        }
        public int[][] nextVerticalIntArrays(int arrayCount, int arrayLength) {
            int[][] result = new int[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextInt();
                }
            }
            return result;
        }
        public long[][] nextVerticalLongArrays(int arrayCount,
                                               int arrayLength) {
            long[][] result = new long[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextLong();
                }
            }
            return result;
        }
        public char[][] nextVerticalCharArrays(int arrayCount,
                                               int arrayLength) {
            char[][] result = new char[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextChar();
                }
            }
            return result;
        }
    }
    static final class MyWriter extends PrintWriter {
        MyWriter(OutputStream out) {
            super(out);
        }
        public void joinAndPrintln(int[] x) {
            joinAndPrintln(x, " ");
        }
        public void joinAndPrintln(int[] x, String delimiter) {
            StringBuilder b = new StringBuilder();
            if (x.length > 0) {
                b.append(x[0]);
                for (int i = 1; i < x.length; i++) {
                    b.append(delimiter).append(x[i]);
                }
            }
            println(b.toString());
        }
        public void joinAndPrintln(long[] x) {
            joinAndPrintln(x, " ");
        }
        public void joinAndPrintln(long[] x, String delimiter) {
            StringBuilder b = new StringBuilder();
            if (x.length > 0) {
                b.append(x[0]);
                for (int i = 1; i < x.length; i++) {
                    b.append(delimiter).append(x[i]);
                }
            }
            println(b.toString());
        }
        public void joinAndPrintln(Iterable<?> iterable) {
            joinAndPrintln(iterable, " ");
        }
        public void joinAndPrintln(Iterable<?> iterable, String delimiter) {
            StringBuilder b = new StringBuilder();
            for (Iterator<?> i = iterable.iterator(); i.hasNext();) {
                b.append(i.next());
                while (i.hasNext()) {
                    b.append(delimiter).append(i.next());
                }
            }
            println(b.toString());
        }
    }
}
