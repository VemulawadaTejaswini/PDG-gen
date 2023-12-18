import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
            TaskF solver = new TaskF();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskF {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int x = in.readInt();
            int d = in.readInt();
            x -= d;

            if (d == 0) {
                if (x == 0) {
                    out.println(1);
                } else {
                    out.println(n + 1);
                }
                return;
            }

            int absX = Math.abs(x);
            int absD = Math.abs(d);
            int g = new Gcd().gcd(absX, absD);
            x /= g;
            d /= g;
            absD /= g;
            absX /= g;

            long inf = (long) 1e13;
            PersistentSegment[] segs = new PersistentSegment[n + 1];
            for (int i = 0; i <= n; i++) {
                int pick = DigitUtils.mod(i, absD);
                if (segs[pick] == null) {
                    segs[pick] = new PersistentSegment(-inf, inf);
                }
                long differ = (long) (i - pick) * x / d;
                long min = sum(1, i) + differ;
                long max = sum(n - i + 1, n) + differ;
                segs[pick].update(min, max, -inf, inf);
            }

            long ans = 0;
            for (int i = 0; i <= n; i++) {
                if (segs[i] == null) {
                    continue;
                }
                ans += segs[i].cnt;
            }

            out.println(ans);
        }

        public long sum(long l, long r) {
            if (l > r) {
                return 0;
            }
            return (l + r) * (r - l + 1) / 2;
        }

    }

    static class Gcd {
        public int gcd(int a, int b) {
            return a >= b ? gcd0(a, b) : gcd0(b, a);
        }

        private int gcd0(int a, int b) {
            return b == 0 ? a : gcd0(b, a % b);
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

        public FastOutput println(int c) {
            cache.append(c).append('\n');
            return this;
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

    static class DigitUtils {
        private DigitUtils() {
        }

        public static int mod(int x, int mod) {
            x %= mod;
            if (x < 0) {
                x += mod;
            }
            return x;
        }

    }

    static class PersistentSegment implements Cloneable {
        private static final PersistentSegment NIL = new PersistentSegment(0, -1);
        private PersistentSegment left = NIL;
        private PersistentSegment right = NIL;
        private long size;
        public long cnt;
        private boolean tag;

        static {
            NIL.left = NIL.right = NIL;
        }

        public void pushUp() {
            cnt = left.cnt + right.cnt;
        }

        public void pushDown(long l, long r) {
            if (left == NIL) {
                left = left.clone();
                right = right.clone();

                long m = (l + r) >> 1;
                left.size = m - l + 1;
                right.size = r - (m + 1) + 1;
            }

            if (tag) {
                left.tag = right.tag = true;
                left.cnt = left.size;
                right.cnt = right.size;
                tag = false;
            }
        }

        public PersistentSegment(long l, long r) {
            left = right = NIL;
            size = r - l + 1;
        }

        private boolean covered(long ll, long rr, long l, long r) {
            return ll <= l && rr >= r;
        }

        private boolean noIntersection(long ll, long rr, long l, long r) {
            return ll > r || rr < l;
        }

        public void update(long ll, long rr, long l, long r) {
            if (noIntersection(ll, rr, l, r)) {
                return;
            }
            if (covered(ll, rr, l, r)) {
                tag = true;
                cnt = size;
                return;
            }
            pushDown(l, r);
            long m = (l + r) >> 1;
            left.update(ll, rr, l, m);
            right.update(ll, rr, m + 1, r);
            pushUp();
        }

        public PersistentSegment clone() {
            try {
                return (PersistentSegment) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

