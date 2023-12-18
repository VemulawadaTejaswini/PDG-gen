import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.util.Deque;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            TaskW solver = new TaskW();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskW {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int m = in.readInt();
            Interval[] intervals = new Interval[m];
            for (int i = 0; i < m; i++) {
                intervals[i] = new Interval();
                intervals[i].l = in.readInt();
                intervals[i].r = in.readInt();
                intervals[i].a = in.readInt();
            }
            Arrays.sort(intervals, (a, b) -> a.r - b.r);
            Deque<Interval> deque = new ArrayDeque<>(Arrays.asList(intervals));
            Segment seg = new Segment(0, n);
            seg.update(0, 0, 0, n, -seg.query(0, 0, 0, n));
            for (int i = 1; i <= n; i++) {
                long max = seg.query(0, i - 1, 0, n);
                seg.update(i, i, 0, n, max - seg.query(i, i, 0, n));
                while (!deque.isEmpty() && deque.peekFirst().r == i) {
                    Interval head = deque.removeFirst();
                    seg.update(head.l, head.r, 0, n, head.a);
                }
            }
            long ans = seg.query(0, n, 0, n);
            out.println(ans);
        }

    }

    static class Interval {
        int l;
        int r;
        int a;

    }

    static class Segment implements Cloneable {
        private Segment left;
        private Segment right;
        private long val;
        private long max;

        public void modify(long x) {
            max += x;
            val += x;
        }

        public void pushUp() {
            max = Math.max(left.max, right.max);
        }

        public void pushDown() {
            if (val != 0) {
                left.modify(val);
                right.modify(val);
                val = 0;
            }
        }

        public Segment(int l, int r) {
            if (l < r) {
                int m = (l + r) >> 1;
                left = new Segment(l, m);
                right = new Segment(m + 1, r);
                pushUp();
            } else {
                val = max = (long) -1e18;
            }
        }

        private boolean covered(int ll, int rr, int l, int r) {
            return ll <= l && rr >= r;
        }

        private boolean noIntersection(int ll, int rr, int l, int r) {
            return ll > r || rr < l;
        }

        public void update(int ll, int rr, int l, int r, long x) {
            if (noIntersection(ll, rr, l, r)) {
                return;
            }
            if (covered(ll, rr, l, r)) {
                modify(x);
                return;
            }
            pushDown();
            int m = (l + r) >> 1;
            left.update(ll, rr, l, m, x);
            right.update(ll, rr, m + 1, r, x);
            pushUp();
        }

        public long query(int ll, int rr, int l, int r) {
            if (noIntersection(ll, rr, l, r)) {
                return (long) -1e18;
            }
            if (covered(ll, rr, l, r)) {
                return max;
            }
            pushDown();
            int m = (l + r) >> 1;
            return Math.max(left.query(ll, rr, l, m),
                    right.query(ll, rr, m + 1, r));
        }

    }

    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput println(long c) {
            cache.append(c).append('\n');
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                os.flush();
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        public String toString() {
            return cache.toString();
        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    bufLen = -1;
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

    }
}

