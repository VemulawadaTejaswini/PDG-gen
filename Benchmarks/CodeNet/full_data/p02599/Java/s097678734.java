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
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        int q = in.nextInt();
        int[] c = in.nextIntArray(n);
        int[][] lr = in.nextVerticalIntArrays(2, q);
        int[] l = decrement(lr[0]);
        int[] r = lr[1];
        Queue<Range> ranges =
                new PriorityQueue<>(Comparator.comparingInt(Range::to));
        for (int i = 0; i < q; i++) {
            ranges.offer(new Range(l[i], r[i], i));
        }
        int[] rightmostOf = new int[n + 1];
        Arrays.fill(rightmostOf, -1);
        var t = new BinaryIndexedTree(n);
        var ans = new long[q];
        for (int i = 0; i < n; i++) {
            if (rightmostOf[c[i]] != -1)
                t.add(rightmostOf[c[i]], -1);
            t.add(i, 1);
            rightmostOf[c[i]] = i;
            while (!ranges.isEmpty() && ranges.peek().to == i + 1) {
                Range range = ranges.poll();
                ans[range.id] = t.range(range.from, range.to);
            }
        }
        out.printLines(ans);
    }
    static final class BinaryIndexedTree {
        private final int length;
        private final long[] a;

        BinaryIndexedTree(int length) {
            if (length < 1) {
                throw new IllegalArgumentException();
            }
            this.length = length;
            this.a = new long[length + 1];
        }
        void add(int index, long value) {
            if (index < 0 || index >= length) {
                throw new IndexOutOfBoundsException();
            }
            for (int j = index + 1; j <= length; j += Integer.lowestOneBit(j)) {
                a[j] += value;
            }
        }
        long prefixSum(int toIndex) {
            if (toIndex < 0 || toIndex > length) {
                throw new IndexOutOfBoundsException();
            }
            long result = 0;
            for (int i = toIndex; i >= 1; i -= Integer.lowestOneBit(i)) {
                result += a[i];
            }
            return result;
        }
        long range(int fromIndex, int toIndex) {
            return prefixSum(toIndex) - prefixSum(fromIndex);
        }
        long get(int index) {
            return range(index, index + 1);
        }
        void set(int index, long value) {
            add(index, value - get(index));
        }
    }
    static final class Range {
        final int from;
        final int to;
        final int id;
        Range(int from, int to, int id) {
            this.from = from;
            this.to = to;
            this.id = id;
        }
        int to() {
            return to;
        }
    }
    private static int[] decrement(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i]--;
        }
        return a;
    }
    public static void main(String[] args) {
        MyWriter w = new MyWriter(System.out);
        new Main().solve(new MyScanner(System.in), w);
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
        private int readByte() {
            if (point < readLength) {
                int result = buffer[point];
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
        private static boolean isVisibleChar(int c) {
            return 33 <= c && c <= 126;
        }
        char nextChar() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            return (char)c;
        }
        String next() {
            return next(16);
        }
        String next(int n) {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            StringBuilder b = new StringBuilder(n);
            do {
                b.append((char)c);
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            boolean minus = false;
            long limit = -Long.MAX_VALUE;
            if (c == '-') {
                minus = true;
                limit = Long.MIN_VALUE;
                c = readByte();
            }
            long n = 0L;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                if (n < limit / 10L) {
                    throw new InputMismatchException();
                }
                n *= 10L;
                int digit = c - '0';
                if (n < limit + digit) {
                    throw new InputMismatchException();
                }
                n -= digit;
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return minus ? n : -n;
        }
        int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
                throw new InputMismatchException();
            }
            return (int)n;
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextInt();
            }
            return result;
        }
        long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
        }
        char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextChar();
            }
            return result;
        }
        char[][] next2dCharArray(int h, int w) {
            char[][] result = new char[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    result[i][j] = nextChar();
                }
            }
            return result;
        }
        int[][] nextVerticalIntArrays(int arrayCount, int arrayLength) {
            int[][] result = new int[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextInt();
                }
            }
            return result;
        }
        long[][] nextVerticalLongArrays(int arrayCount, int arrayLength) {
            long[][] result = new long[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextLong();
                }
            }
            return result;
        }
        char[][] nextVerticalCharArrays(int arrayCount, int arrayLength) {
            char[][] result = new char[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextChar();
                }
            }
            return result;
        }
        List<String> nextStringList(int n) {
            var result = new ArrayList<String>(n);
            for (int i = 0; i < n; i++) {
                result.add(next());
            }
            return result;
        }
        List<Integer> nextIntList(int n) {
            var result = new ArrayList<Integer>(n);
            for (int i = 0; i < n; i++) {
                result.add(nextInt());
            }
            return result;
        }
        List<Long> nextLongList(int n) {
            var result = new ArrayList<Long>(n);
            for (int i = 0; i < n; i++) {
                result.add(nextLong());
            }
            return result;
        }
    }
    static final class MyWriter extends PrintWriter {
        MyWriter(OutputStream out) {
            super(out);
        }
        void println(int[] x) {
            println(x, " ");
        }
        void println(int[] x, String delimiter) {
            if (x.length > 0) {
                print(x[0]);
                for (int i = 1; i < x.length; i++) {
                    print(delimiter);
                    print(x[i]);
                }
            }
            println();
        }
        void println(long[] x) {
            println(x, " ");
        }
        void println(long[] x, String delimiter) {
            if (x.length > 0) {
                print(x[0]);
                for (int i = 1; i < x.length; i++) {
                    print(delimiter);
                    print(x[i]);
                }
            }
            println();
        }
        void println(Iterable<?> iterable) {
            println(iterable, " ");
        }
        void println(Iterable<?> iterable, String delimiter) {
            Iterator<?> i = iterable.iterator();
            if (i.hasNext()) {
                print(i.next());
                while (i.hasNext()) {
                    print(delimiter);
                    print(i.next());
                }
            }
            println();
        }
        void printLines(int[] x) {
            println(x, System.lineSeparator());
        }
        void printLines(long[] x) {
            println(x, System.lineSeparator());
        }
        void printLines(Iterable<?> iterable) {
            println(iterable, System.lineSeparator());
        }
    }
}
