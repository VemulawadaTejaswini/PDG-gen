import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.io.InputStream;

/**
 * @author khokharnikunj8
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "khokharnikunj8", 1 << 27);
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
            ETwoCurrencies solver = new ETwoCurrencies();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class ETwoCurrencies {
        int[][][] G;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int m = in.readInt();
            int s = in.readInt();
            int[] from = new int[m];
            int[] to = new int[m];
            int[] A = new int[m];
            int[] B = new int[m];
            for (int i = 0; i < m; i++) {
                from[i] = in.readInt();
                to[i] = in.readInt();
                A[i] = in.readInt();
                B[i] = in.readInt();
            }
            long[] C = new long[n + 1];
            long[] D = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                C[i] = in.readInt();
                D[i] = in.readInt();
            }
            G = packGraphW(from, to, A, B, n, m);
            long[][] dp = new long[n + 1][2501];
            SequenceUtils.deepFill(dp, Long.MAX_VALUE);
            boolean[][] visited = new boolean[n + 1][2501];
            PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(o -> o[0]));
            pq.add(new long[]{0, 1, Math.min(2500, s)});
            dp[1][Math.min(2500, s)] = 0;
            while (pq.size() > 0) {
                long[] temp = pq.poll();
                int node = (int) temp[1];
                int silver = (int) temp[2];
                if (visited[node][silver]) continue;
                visited[node][silver] = true;
                int extra;
                for (extra = 1; silver + extra * C[node] <= 2500; extra++) {
                    if (dp[node][(int) (silver + extra * C[node])] > temp[0] + D[node] * extra) {
                        dp[node][(int) (silver + extra * C[node])] = temp[0] + D[node] * extra;
                        pq.add(new long[]{temp[0] + D[node] * extra, node, silver + extra * C[node]});
                    }
                }
                if (dp[node][2500] > temp[0] + D[node] * extra) {
                    dp[node][2500] = temp[0] + D[node] * extra;
                    pq.add(new long[]{dp[node][2500], node, 2500});
                }
                for (int[] adja : G[node]) {
                    if (adja[1] <= silver && dp[adja[0]][silver - adja[1]] > temp[0] + adja[2]) {
                        dp[adja[0]][silver - adja[1]] = temp[0] + adja[2];
                        pq.add(new long[]{temp[0] + adja[2], adja[0], silver - adja[1]});
                    }
                }
            }
            for (int i = 2; i <= n; i++) {
                long ans = Long.MAX_VALUE;
                for (long j : dp[i]) ans = Math.min(ans, j);
                out.println(ans);
            }
        }

        public static int[][][] packGraphW(int[] from, int[] to, int[] w1, int[] w2, int n, int m) {
            int[][][] g = new int[n + 1][][];
            int[] p = new int[n + 1];
            for (int i = 0; i < m; i++) p[from[i]]++;
            for (int i = 0; i < m; i++) p[to[i]]++;
            for (int i = 0; i <= n; i++) g[i] = new int[p[i]][3];
            for (int i = 0; i < m; i++) {
                --p[from[i]];
                g[from[i]][p[from[i]]][0] = to[i];
                g[from[i]][p[from[i]]][1] = w1[i];
                g[from[i]][p[from[i]]][2] = w2[i];
                --p[to[i]];
                g[to[i]][p[to[i]]][0] = from[i];
                g[to[i]][p[to[i]]][1] = w1[i];
                g[to[i]][p[to[i]]][2] = w2[i];
            }
            return g;
        }

    }

    static class FastOutput implements AutoCloseable, Closeable, Appendable {
        private StringBuilder cache = new StringBuilder(1 << 20);
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

    static class SequenceUtils {
        public static void deepFill(Object array, long val) {
            if (!array.getClass().isArray()) {
                throw new IllegalArgumentException();
            }
            if (array instanceof long[]) {
                long[] longArray = (long[]) array;
                Arrays.fill(longArray, val);
            } else {
                Object[] objArray = (Object[]) array;
                for (Object obj : objArray) {
                    deepFill(obj, val);
                }
            }
        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 20];
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

