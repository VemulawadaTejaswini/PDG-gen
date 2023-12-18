import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Interval> intervals = new ArrayList<>(m);
        for (int i = 0; i < m; ++i) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            intervals.add(new Interval(l, r, c));
        }
        intervals.sort(Comparator.comparingInt(o -> o.l));
        SegmentTree segmentTree = new SegmentTree(n);
        segmentTree.set(1, 1, 0);
        long ans = 0;
        for (Interval interval : intervals) {
            long min = segmentTree.query(interval.l);
            if (min == Long.MAX_VALUE) {
                ans = -1;
                break;
            }
            segmentTree.set(interval.l, interval.r, min + interval.c);
        }
        if (ans == 0)
            ans = segmentTree.query(n);
        writer.println(ans);
        writer.close();
    }

    private static class Interval {
        private final int l, r, c;

        private Interval(int l, int r, int c) {
            this.l = l;
            this.r = r;
            this.c = c;
        }
    }

    private static class SegmentTree {

        private long[] min;
        private int n;

        private SegmentTree(int n) {
            this.n = n;
            min = new long[4 * n];
            Arrays.fill(min, Long.MAX_VALUE);
        }

        private void set(int l, int r, long v) {
            set(0, 0, n, l, r, v);
        }

        private void set(int k, int l0, int r0, int l, int r, long v) {
            if (l > r)
                return;
            if (l == l0 && r == r0) {
                min[k] = Math.min(min[k], v);
                return;
            }
            int mid = (l0 + r0) / 2;
            set(2 * k + 1, l0, mid, l, Math.min(mid, r), v);
            set(2 * k + 2, mid + 1, r0, Math.max(mid + 1, l), r, v);
        }

        private long query(int p) {
            return query(0, 0, n, p);
        }

        private long query(int k, int l0, int r0, int p) {
            if (l0 == p && p == r0)
                return min[k];
            int mid = (l0 + r0) / 2;
            if (p <= mid)
                return Math.min(min[k], query(2 * k + 1, l0, mid, p));
            else
                return Math.min(min[k], query(2 * k + 2, mid + 1, r0, p));
        }
    }

    private static class SimpleScanner {

        private static final int BUFFER_SIZE = 10240;

        private Readable in;
        private CharBuffer buffer;
        private boolean eof;

        SimpleScanner(InputStream in) {
            this.in = new BufferedReader(new InputStreamReader(in));
            buffer = CharBuffer.allocate(BUFFER_SIZE);
            buffer.limit(0);
            eof = false;
        }


        private char read() {
            if (!buffer.hasRemaining()) {
                buffer.clear();
                int n;
                try {
                    n = in.read(buffer);
                } catch (IOException e) {
                    n = -1;
                }
                if (n <= 0) {
                    eof = true;
                    return '\0';
                }
                buffer.flip();
            }
            return buffer.get();
        }

        private void checkEof() {
            if (eof)
                throw new NoSuchElementException();
        }

        private char nextChar() {
            checkEof();
            char b = read();
            checkEof();
            return b;
        }

        private String next() {
            char b;
            do {
                b = read();
                checkEof();
            } while (Character.isWhitespace(b));
            StringBuilder sb = new StringBuilder();
            do {
                sb.append(b);
                b = read();
            } while (!eof && !Character.isWhitespace(b));
            return sb.toString();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}