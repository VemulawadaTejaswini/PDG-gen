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
            Task solver = new Task();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class Task {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();

            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.readInt() - 1;
            }

            PermutationUtils.PowerPermutation pp = new PermutationUtils.PowerPermutation(p, n);
            int[] a = new int[n];
            int[] b = new int[n];
            int[] sum = new int[n];
            for (int i = 0; i < n; i++) {
                sum[i] = pp.apply(i, -1);
            }

            a[0] = 0;
            b[0] = sum[0];
            for (int i = 1; i < n; i++) {
                a[i] = a[i - 1] + 1;
                b[i] = sum[i] - a[i];
                if (b[i] >= b[i - 1]) {
                    int d = b[i] - (b[i - 1] - 1);
                    b[i] = b[i - 1] - 1;
                    a[i] += d;
                }
            }

            int minA = a[ArrayUtils.indexOfMin(a, 0, n)];
            int minB = b[ArrayUtils.indexOfMin(b, 0, n)];
            for (int i = 0; i < n; i++) {
                a[i] -= minA - 1;
                b[i] -= minB - 1;
            }

            for (int i = 0; i < n; i++) {
                out.append(a[i]).append(' ');
            }
            out.println();
            for (int i = 0; i < n; i++) {
                out.append(b[i]).append(' ');
            }
        }

    }
    static class DigitUtils {
        private DigitUtils() {}

        public static int mod(int x, int mod) {
            x %= mod;
            if (x < 0) {
                x += mod;
            }
            return x;
        }

    }
    static class PermutationUtils {
        private static final long[] PERMUTATION_CNT = new long[21];
        static {
            PERMUTATION_CNT[0] = 1;
            for (int i = 1; i <= 20; i++) {
                PERMUTATION_CNT[i] = PERMUTATION_CNT[i - 1] * i;
            }
        }

        public static class PowerPermutation {
            int[] g;
            int[] idx;
            int[] l;
            int[] r;
            int n;

            public PowerPermutation(int[] p) {
                this(p, p.length);
            }

            public PowerPermutation(int[] p, int len) {
                n = len;
                boolean[] visit = new boolean[n];
                g = new int[n];
                l = new int[n];
                r = new int[n];
                idx = new int[n];
                int wpos = 0;
                for (int i = 0; i < n; i++) {
                    int val = p[i];
                    if (visit[val]) {
                        continue;
                    }
                    visit[val] = true;
                    g[wpos] = val;
                    l[wpos] = wpos;
                    idx[val] = wpos;
                    wpos++;
                    while (true) {
                        int x = p[g[wpos - 1]];
                        if (visit[x]) {
                            break;
                        }
                        visit[x] = true;
                        g[wpos] = x;
                        l[wpos] = l[wpos - 1];
                        idx[x] = wpos;
                        wpos++;
                    }
                    for (int j = l[wpos - 1]; j < wpos; j++) {
                        r[j] = wpos - 1;
                    }
                }
            }

            public int apply(int x, int p) {
                int i = idx[x];
                int dist = DigitUtils.mod((i - l[i]) + p, r[i] - l[i] + 1);
                return g[dist + l[i]];
            }

            public String toString() {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    builder.append(apply(i, 1)).append(' ');
                }
                return builder.toString();
            }

        }

    }
    static class ArrayUtils {
        public static int indexOfMin(int[] data, int from, int to) {
            int m = from;
            for (int i = from + 1; i < to; i++) {
                if (data[m] > data[i]) {
                    m = i;
                }
            }
            return m;
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

        public FastOutput append(char c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(int c) {
            cache.append(c);
            return this;
        }

        public FastOutput println() {
            cache.append('\n');
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
}

