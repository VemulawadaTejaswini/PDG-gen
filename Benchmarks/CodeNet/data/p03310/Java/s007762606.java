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
            DEqualCut solver = new DEqualCut();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class DEqualCut {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int[] a = new int[n];
            in.populate(a);

            Region r1 = new Region(a, 0, 1);
            Region r2 = new Region(a, 2, n - 1);
            r1.fix();
            r2.fix();
            long ans = solve(r1, r2);
            while (r2.r - r2.l + 1 > 2) {
                r1.rr();
                r2.lr();
                r1.fix();
                r2.fix();
                ans = Math.min(ans, solve(r1, r2));
            }

            out.println(ans);
        }

        public long solve(Region r1, Region r2) {
            long max = Math.max(r1.sl, r1.sr);
            max = Math.max(max, r2.sl);
            max = Math.max(max, r2.sr);

            long min = Math.min(r1.sl, r1.sr);
            min = Math.min(min, r2.sl);
            min = Math.min(min, r2.sr);

            return max - min;
        }

    }

    static class FastOutput implements AutoCloseable, Closeable, Appendable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput append(CharSequence csq) {
            cache.append(csq);
            return this;
        }

        public FastOutput append(CharSequence csq, int start, int end) {
            cache.append(csq, start, end);
            return this;
        }

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput append(char c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(long c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(long c) {
            return append(c).println();
        }

        public FastOutput println() {
            cache.append(System.lineSeparator());
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

    static class Region {
        int[] area;
        int l;
        int r;
        int mid;
        long sl;
        long sr;

        public Region(int[] area, int l, int r) {
            mid = l;
            this.area = area;
            this.l = l;
            this.r = r;
            for (int i = l; i <= r; i++) {
                if (i <= mid) {
                    sl += area[i];
                } else {
                    sr += area[i];
                }
            }
        }

        public void lr() {
            sl -= area[l];
            l++;
        }

        public void rr() {
            r++;
            sr += area[r];
        }

        public void fix() {
            while (mid > l && Math.abs(sr - sl) > Math.abs(sr - sl + 2 * area[mid])) {
                sr += area[mid];
                sl -= area[mid];
                mid--;
            }
            while (r - mid > 1 && Math.abs(sr - sl) > Math.abs(sr - sl - 2 * area[mid + 1])) {
                mid++;
                sr -= area[mid];
                sl += area[mid];
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

        public void populate(int[] data) {
            for (int i = 0; i < data.length; i++) {
                data[i] = readInt();
            }
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