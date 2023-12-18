import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.IntPredicate;
import java.util.function.LongBinaryOperator;

public class Main {
    private static final class Monster {
        final long x;
        final long h;
        Monster(long x, long h) {
            this.x = x;
            this.h = h;
        }
        long x() {
            return x;
        }
    }
    static void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        long d = in.nextLong();
        long a = in.nextLong();
        long[][] xh = in.nextVerticalLongArrays(2, n);
        long[] x = xh[0];
        long[] h = xh[1];

        List<Monster> monsters = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            monsters.add(new Monster(x[i], h[i]));
        }
        monsters.sort(Comparator.comparingLong(Monster::x));

        SegmentTree damages = SegmentTree.sum(n + 1);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            Monster monster = monsters.get(i);
            long currentDamage = damages.query(0, i + 1);
            long remains = monster.h - currentDamage;
            if (remains <= 0) {
                continue;
            }
            long attackCount = divAndCeil(remains, a);
            ans += attackCount;
            long damage = attackCount * a;
            damages.update(i, damages.query(i, i + 1) + damage);
            int j = upperBound(i + 1, n, k -> {
                return monsters.get(k).x <= monster.x + 2 * d;
            });
            damages.update(j, damages.query(j, j + 1) - damage);
        }
        out.println(ans);
    }
    private static int upperBound(int from, int to, IntPredicate p) {
        if (from == Integer.MIN_VALUE || from > to) {
            throw new IllegalArgumentException();
        }
        int low = from;
        int high = to - 1;
        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            if (p.test(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    static final class SegmentTree {
        final int n;
        final long[] a;
        private final long identityElement;
        private final LongBinaryOperator op;

        SegmentTree(int n, long identityElement, LongBinaryOperator op) {
            this.n = Integer.bitCount(n) == 1
                    ? n
                    : Integer.highestOneBit(n) << 1;

            a = new long[this.n * 2 - 1];
            Arrays.fill(a, identityElement);

            this.identityElement = identityElement;
            this.op = op;
        }
        static SegmentTree min(int n) {
            return new SegmentTree(n, Long.MAX_VALUE, Math::min);
        }
        static SegmentTree max(int n) {
            return new SegmentTree(n, Long.MIN_VALUE, Math::max);
        }
        static SegmentTree sum(int n) {
            return new SegmentTree(n, 0, Math::addExact);
        }
        void update(int i, long v) {
            if (i < 0 || i >= n) {
                throw new IndexOutOfBoundsException();
            }
            int j = n + i - 1;
            a[j] = v;
            while (j > 0) {
                j = (j - 1) / 2;
                a[j] = op.applyAsLong(a[j * 2 + 1], a[j * 2 + 2]);
            }
        }
        private long _query(int from, int to, int k, int left, int right) {
            if (right <= from || to <= left) {
                return identityElement;
            }
            if (from <= left && right <= to) {
                return a[k];
            }
            int center = (left + right) >>> 1;
            return op.applyAsLong(_query(from, to, k * 2 + 1, left, center),
                                  _query(from, to, k * 2 + 2, center, right));
        }
        long query(int from, int to) {
            if (from < 0 || to > n || from > to) {
                throw new IndexOutOfBoundsException();
            }
            return _query(from, to, 0, 0, n);
        }
    }
    private static long divAndCeil(long divident, long divisor) {
        if (divident < 0) {
            throw new IllegalArgumentException();
        }
        if (divisor <= 0) {
            throw new IllegalArgumentException();
        }
        return (divident + divisor - 1) / divisor;
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
