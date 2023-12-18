import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
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
            DAddAndRemove solver = new DAddAndRemove();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class DAddAndRemove {
        int n;
        int m;
        int mask;
        long[] a;
        long[][][][] dp;

        public long dp(int l, int r, int x, int y) {
            if (r < l || y >= dp[l][r][x].length) {
                return 0;
            }
            if (dp[l][r][x][y] == -1) {
                if (l + 1 == r) {
                    return dp[l][r][x][y] = 0;
                }
                dp[l][r][x][y] = (long) 1e18;
                for (int i = l + 1; i < r; i++) {
                    dp[l][r][x][y] = Math.min(dp[l][r][x][y],
                            dp(l, i, x, x + y) + dp(i, r, x + y, y) +
                                    a[i] * (x + y));
                }
            }
            return dp[l][r][x][y];
        }

        public void solve(int testNumber, FastInput in, FastOutput out) {
            n = in.readInt();
            a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.readInt();
            }

            m = n - 2;
            mask = 1 << m;
            dp = new long[n][n][mask][];
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    for (int k = 1; k < mask; k++) {
                        dp[i][j][k] = new long[mask / k + 1];
                        Arrays.fill(dp[i][j][k], -1);
                    }
                }
            }

            long ans = dp(0, n - 1, 1, 1) + a[0] + a[n - 1];

            out.println(ans);
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

