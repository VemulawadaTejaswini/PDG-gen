

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean local = false;
        boolean async = false;

        Charset charset = Charset.forName("ascii");

        FastIO io = local ? new FastIO(new FileInputStream("D:\\DATABASE\\TESTCASE\\Code.in"), System.out, charset) : new FastIO(System.in, System.out, charset);
        Task task = new Task(io, new Debug(local));

        if (async) {
            Thread t = new Thread(null, task, "dalt", 1 << 27);
            t.setPriority(Thread.MAX_PRIORITY);
            t.start();
            t.join();
        } else {
            task.run();
        }

        if (local) {
            io.cache.append("\n\n--memory -- \n" + ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) >> 20) + "M");
        }

        io.flush();
    }

    public static class Task implements Runnable {
        final FastIO io;
        final Debug debug;
        int inf = (int) 1e8;
        long lInf = (long) 1e18;

        public Task(FastIO io, Debug debug) {
            this.io = io;
            this.debug = debug;
        }

        @Override
        public void run() {
            solve();
        }


        long[][] dp;
        long[][] l2rMat;
        long[][] r2lMat;

        public void solve() {
            int n = io.readInt();
            List<Constraint> l2r = new ArrayList<>(n * (n - 1) / 2);
            List<Constraint> r2l = new ArrayList<>(n * (n - 1) / 2);
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j < i; j++) {
                    r2l.add(new Constraint(j, i - 1, io.readInt()));
                }
                for (int j = i + 1; j <= n; j++) {
                    l2r.add(new Constraint(i, j - 1, io.readInt()));
                }
            }
            l2rMat = new long[n + 1][n + 1];
            r2lMat = new long[n + 1][n + 1];
            for (Constraint c : l2r) {
                l2rMat[c.l][c.r] += c.cost;
            }
            for (Constraint c : r2l) {
                r2lMat[c.l][c.r] += c.cost;
            }

            debug.debug("l2r", l2rMat);
            debug.debug("r2l", r2lMat);

            preSum(l2rMat);
            preSum(r2lMat);

            debug.debug("l2r", l2rMat);
            debug.debug("r2l", r2lMat);

            dp = new long[n + 1][n + 1];
            for (long[] r : dp) {
                Arrays.fill(r, -1L);
            }
            dp[0][0] = 0;

            long ans = lInf;
            for (int i = 0; i < n; i++) {
                ans = Math.min(ans, dp(n, i));
            }
            debug.debug("dp", dp);
            io.cache.append(ans);
        }

        public long valueOf(long[][] mat, int i, int j) {
            if (i < 0 || i >= mat.length || j < 0 || j >= mat[0].length) {
                return 0;
            }
            return mat[i][j];
        }

        public long subarea(long[][] mat, int x1, int y1, int x2, int y2) {
            if (x1 > x2 || y1 > y2) {
                return 0;
            }
            return valueOf(mat, x2, y2) - valueOf(mat, x1 - 1, y2) - valueOf(mat, x2, y1 - 1) + valueOf(mat, x1 - 1, y1 - 1);
        }

        public long dp(int x, int i) {
            if (dp[x][i] == -1) {
                if (x <= i) {
                    dp[x][i] = lInf;
                    return lInf;
                }
                dp[x][i] = lInf;
                for (int j = 0; j <= i; j++) {
                    dp[x][i] = Math.min(dp[x][i],
                            dp(i, j) + subarea(l2rMat, i + 1, i + 1, x - 1, x - 1)
                                    + subarea(r2lMat, 1, i, j, x - 1));
                }
            }
            return dp[x][i];
        }

        public void preSum(long[][] g) {
            int n = g.length;
            int m = g[0].length;

            for (int i = 1; i < n; i++) {
                g[i][0] += g[i - 1][0];
            }
            for (int i = 1; i < m; i++) {
                g[0][i] += g[0][i - 1];
            }
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    g[i][j] += g[i - 1][j] + g[i][j - 1] - g[i - 1][j - 1];
                }
            }
        }


    }

    public static class Constraint {
        int l;
        int r;
        int cost;

        public Constraint(int l, int r, int cost) {
            this.l = l;
            this.r = r;
            this.cost = cost;
        }

    }

    public static class FastIO {
        public final StringBuilder cache = new StringBuilder(1 << 13);
        private final InputStream is;
        private final OutputStream os;
        private final Charset charset;
        private StringBuilder defaultStringBuf = new StringBuilder(1 << 13);
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastIO(InputStream is, OutputStream os, Charset charset) {
            this.is = is;
            this.os = os;
            this.charset = charset;
        }

        public FastIO(InputStream is, OutputStream os) {
            this(is, os, Charset.forName("ascii"));
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

        public long readLong() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            long val = 0;
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

        public double readDouble() {
            boolean sign = true;
            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+';
                next = read();
            }

            long val = 0;
            while (next >= '0' && next <= '9') {
                val = val * 10 + next - '0';
                next = read();
            }
            if (next != '.') {
                return sign ? val : -val;
            }
            next = read();
            long radix = 1;
            long point = 0;
            while (next >= '0' && next <= '9') {
                point = point * 10 + next - '0';
                radix = radix * 10;
                next = read();
            }
            double result = val + (double) point / radix;
            return sign ? result : -result;
        }

        public String readString(StringBuilder builder) {
            skipBlank();

            while (next > 32) {
                builder.append((char) next);
                next = read();
            }

            return builder.toString();
        }

        public String readString() {
            defaultStringBuf.setLength(0);
            return readString(defaultStringBuf);
        }

        public int readLine(char[] data, int offset) {
            int originalOffset = offset;
            while (next != -1 && next != '\n') {
                data[offset++] = (char) next;
                next = read();
            }
            return offset - originalOffset;
        }

        public int readString(char[] data, int offset) {
            skipBlank();

            int originalOffset = offset;
            while (next > 32) {
                data[offset++] = (char) next;
                next = read();
            }

            return offset - originalOffset;
        }

        public int readString(byte[] data, int offset) {
            skipBlank();

            int originalOffset = offset;
            while (next > 32) {
                data[offset++] = (byte) next;
                next = read();
            }

            return offset - originalOffset;
        }

        public char readChar() {
            skipBlank();
            char c = (char) next;
            next = read();
            return c;
        }

        public void flush() throws IOException {
            os.write(cache.toString().getBytes(charset));
            os.flush();
            cache.setLength(0);
        }

        public boolean hasMore() {
            skipBlank();
            return next != -1;
        }
    }

    public static class Debug {
        private boolean allowDebug;

        public Debug(boolean allowDebug) {
            this.allowDebug = allowDebug;
        }

        public void assertTrue(boolean flag) {
            if (!allowDebug) {
                return;
            }
            if (!flag) {
                fail();
            }
        }

        public void fail() {
            throw new RuntimeException();
        }

        public void assertFalse(boolean flag) {
            if (!allowDebug) {
                return;
            }
            if (flag) {
                fail();
            }
        }

        private void outputName(String name) {
            System.out.print(name + " = ");
        }

        public void debug(String name, int x) {
            if (!allowDebug) {
                return;
            }

            outputName(name);
            System.out.println("" + x);
        }

        public void debug(String name, long x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println("" + x);
        }

        public void debug(String name, double x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println("" + x);
        }

        public void debug(String name, int[] x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println(Arrays.toString(x));
        }

        public void debug(String name, long[] x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println(Arrays.toString(x));
        }

        public void debug(String name, double[] x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println(Arrays.toString(x));
        }

        public void debug(String name, Object x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println("" + x);
        }

        public void debug(String name, Object... x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println(Arrays.deepToString(x));
        }
    }
}
