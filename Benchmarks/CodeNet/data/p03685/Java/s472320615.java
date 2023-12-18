import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
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
            TaskA solver = new TaskA();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskA {
        int r;
        int c;
        boolean valid = true;
        BIT lb;
        BIT rb;
        BIT tb;
        BIT bb;
        RandomWrapper rw = new RandomWrapper(new Random(0));

        public boolean inboard(IntPoint a) {
            return a.x == 0 || a.y == 0 ||
                    a.x == c || a.y == r;
        }

        public void check(IntPoint pt) {
            if (pt.x == 0) {
                valid = valid && lb.query(pt.y + 1) == 0;
            }
            if (pt.x == c) {
                valid = valid && rb.query(pt.y + 1) == 0;
            }
            if (pt.y == 0) {
                valid = valid && bb.query(pt.x + 1) == 0;
            }
            if (pt.y == r) {
                valid = valid && tb.query(pt.x + 1) == 0;
            }
        }

        public void solve(int testNumber, FastInput in, FastOutput out) {
            c = in.readInt();
            r = in.readInt();
            int n = in.readInt();

            lb = new BIT(r + 1);
            rb = new BIT(r + 1);
            tb = new BIT(c + 1);
            bb = new BIT(c + 1);
            List<IntLine> lineList = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                IntPoint a = new IntPoint(in.readInt(), in.readInt());
                IntPoint b = new IntPoint(in.readInt(), in.readInt());
                if (inboard(a) && inboard(b)) {


                    if (a.x == 0 && b.x == 0) {
                        int cnt = lb.query(Math.max(b.y, a.y) + 1) - lb.query(Math.min(b.y, a.y) + 1);
                        if (cnt != 0) {
                            valid = false;
                        }
                        lb.update(Math.max(b.y, a.y) + 1, 1);
                        lb.update(Math.min(b.y, a.y) + 1, -1);
                    } else if (a.y == 0 && b.y == 0) {
                        int cnt = bb.query(Math.max(b.x, a.x) + 1) - bb.query(Math.min(b.x, a.x) + 1);
                        if (cnt != 0) {
                            valid = false;
                        }
                        bb.update(Math.max(b.x, a.x) + 1, 1);
                        bb.update(Math.min(b.x, a.x) + 1, -1);
                    } else if (a.x == c && b.x == c) {
                        int cnt = rb.query(Math.max(b.y, a.y) + 1) - rb.query(Math.min(b.y, a.y) + 1);
                        if (cnt != 0) {
                            valid = false;
                        }
                        rb.update(Math.max(b.y, a.y) + 1, 1);
                        rb.update(Math.min(b.y, a.y) + 1, -1);
                    } else if (a.y == 0 && b.y == 0) {
                        int cnt = tb.query(Math.max(b.x, a.x) + 1) - tb.query(Math.min(b.x, a.x) + 1);
                        if (cnt != 0) {
                            valid = false;
                        }
                        tb.update(Math.max(b.x, a.x) + 1, 1);
                        tb.update(Math.min(b.x, a.x) + 1, -1);
                    } else {
                        IntLine line = new IntLine(a, b);
                        lineList.add(line);
                    }
                }
            }

            IntLine[] lines = lineList.toArray(new IntLine[0]);
            for (IntLine line : lines) {
                check(line.a);
                check(line.b);
            }
            dac(lines, 0, lines.length - 1);
            out.println(valid ? "YES" : "NO");
        }

        public void dac(IntLine[] lines, int l, int r) {
            if (r <= l) {
                return;
            }
            ArrayUtils.swap(lines, rw.nextInt(l, r), l);
            int sep = l + 1;
            for (int i = l + 1; i <= r; i++) {
                int sa = lines[l].whichSide(lines[i].a);
                int sb = lines[l].whichSide(lines[i].b);
                if (sa * sb == -1) {
                    valid = false;
                }
                if (sa + sb < 0) {
                    ArrayUtils.swap(lines, sep, i);
                    sep++;
                }
            }
            dac(lines, l + 1, sep - 1);
            dac(lines, sep, r);
        }

    }

    static class BIT {
        private int[] data;
        private int n;

        public BIT(int n) {
            this.n = n;
            data = new int[n + 1];
        }

        public int query(int i) {
            int sum = 0;
            for (; i > 0; i -= i & -i) {
                sum += data[i];
            }
            return sum;
        }

        public void update(int i, int mod) {
            if (i <= 0) {
                return;
            }
            for (; i <= n; i += i & -i) {
                data[i] += mod;
            }
        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                builder.append(query(i) - query(i - 1)).append(' ');
            }
            return builder.toString();
        }

    }

    static class RandomWrapper {
        private Random random;

        public RandomWrapper(Random random) {
            this.random = random;
        }

        public int nextInt(int l, int r) {
            return random.nextInt(r - l + 1) + l;
        }

    }

    static class IntPoint {
        int x;
        int y;

        public IntPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return String.format("(%d, %d)", x, y);
        }

    }

    static class IntLine {
        IntPoint a;
        IntPoint b;

        public String toString() {
            return a + "->" + b;
        }

        public IntLine(IntPoint a, IntPoint b) {
            this.a = a;
            this.b = b;
        }

        public int whichSide(IntPoint pt) {
            long vecx = b.x - a.x;
            long vecy = b.y - a.y;
            long ptx = pt.x - a.x;
            long pty = pt.y - a.y;
            return Long.signum(vecx * pty - vecy * ptx);
        }

    }

    static class ArrayUtils {
        public static <T> void swap(T[] data, int i, int j) {
            T tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
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

    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput println(String c) {
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

