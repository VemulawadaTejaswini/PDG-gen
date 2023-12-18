import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.Deque;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 * 
 * @author daltao
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "daltao", 1 << 27);
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
            TaskE solver = new TaskE();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskE {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int a = in.readInt();

            if (a == 0) {
                out.println(new DigitUtils.Log2().ceilLog(n) + 1);
                return;
            }

            if (a + 1 >= n) {
                out.println(n);
                return;
            }

            long[] f = new long[n + 1];
            long[] g = new long[n + 1];
            for (int i = 0; i <= a + 1; i++) {
                f[i] = 1;
                g[i] = i;
            }

            LeqSlopeOptimizer lso = new LeqSlopeOptimizer(n);
            lso.add(0, 1, 0);
            for (int i = a + 2; i <= n; i++) {
                f[i] = g[i - a];
                int j = lso.getBestChoice(i);
                g[i] = f[j] * i - j * f[j];
                lso.add(i * f[i], f[i], i);
            }

            for (int i = 0; i <= n; i++) {
                if (g[i] >= n) {
                    out.println(i);
                    return;
                }
            }
        }

    }
    static class LeqSlopeOptimizer {
        Deque<LeqSlopeOptimizer.Point> deque;

        public LeqSlopeOptimizer() {
            deque = new ArrayDeque<>(0);
        }

        public LeqSlopeOptimizer(int exp) {
            deque = new ArrayDeque<>(exp);
        }

        private double slope(LeqSlopeOptimizer.Point a, LeqSlopeOptimizer.Point b) {
            if (b.x == a.x) {
                if (b.y == a.y) {
                    return 0;
                } else if (b.y > a.y) {
                    return 1e50;
                } else {
                    return 1e-50;
                }
            }
            return (double) (b.y - a.y) / (b.x - a.x);
        }

        public LeqSlopeOptimizer.Point add(long y, long x, int id) {
            LeqSlopeOptimizer.Point t1 = new LeqSlopeOptimizer.Point(x, y, id);
            while (deque.size() >= 2) {
                LeqSlopeOptimizer.Point t2 = deque.removeLast();
                LeqSlopeOptimizer.Point t3 = deque.peekLast();
                if (slope(t3, t2) < slope(t2, t1)) {
                    deque.addLast(t2);
                    break;
                }
            }
            deque.addLast(t1);
            return t1;
        }

        public int getBestChoice(long s) {
            while (deque.size() >= 2) {
                LeqSlopeOptimizer.Point h1 = deque.removeFirst();
                LeqSlopeOptimizer.Point h2 = deque.peekFirst();
                if (slope(h2, h1) > s) {
                    deque.addFirst(h1);
                    break;
                }
            }
            return deque.peekFirst().id;
        }

        private static class Point {
            final long x;
            final long y;
            final int id;

            private Point(long x, long y, int id) {
                this.x = x;
                this.y = y;
                this.id = id;
            }

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
                    throw new RuntimeException(e);
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
        private DigitUtils() {}

        public static class Log2 {
            public int ceilLog(int x) {
                return 32 - Integer.numberOfLeadingZeros(x - 1);
            }

        }

    }
    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(1 << 20);
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

        public FastOutput flush() {
            try {
                os.append(cache);
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

    }
}

