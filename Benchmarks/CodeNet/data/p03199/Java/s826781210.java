import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.AbstractMap;
import java.util.TreeMap;
import java.util.Map;
import java.io.Closeable;
import java.util.Map.Entry;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
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
            int m = in.readInt();

            boolean valid = true;
            TreeMap<Long, Integer>[] maps = new TreeMap[4];
            for (int i = 0; i < 4; i++) {
                maps[i] = new TreeMap<>();
            }
            for (int i = 0; i < m; i++) {
                int a = in.readInt();
                int b = in.readInt();
                int c = in.readInt();

                Long key = DigitUtils.asLong(a, b);
                maps[Math.min(3, Math.abs(a - b))].put(key, c);
            }
            int[] diagonal = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                diagonal[i] = maps[0].getOrDefault(DigitUtils.asLong(i, i), -1);
            }
            int[] bottom = new int[n + 1];
            int[] top = new int[n + 1];
            for (int i = 2; i <= n; i++) {
                bottom[i] = maps[1].getOrDefault(DigitUtils.asLong(i, i - 1), -1);
                top[i] = maps[1].getOrDefault(DigitUtils.asLong(i - 1, i), -1);
            }
            boolean[] decided = new boolean[n + 1];
            for (int i = 3; i <= n; i++) {
                Integer up = maps[2].get(DigitUtils.asLong(i - 2, i));
                Integer bot = maps[2].get(DigitUtils.asLong(i, i - 2));
                if (up != null && bot != null) {
                    if (diagonal[i - 1] == -1) {
                        diagonal[i - 1] = (up + bot) % 2;
                    } else if (diagonal[i - 1] != (up + bot) % 2) {
                        valid = false;
                    }
                }
                if (up != null || bot != null) {
                    decided[i] = true;
                }
            }


            NumberTheory.Modular mod = new NumberTheory.Modular(998244353);
            NumberTheory.Power pow = new NumberTheory.Power(mod);

            int[][] dp = new int[n + 1][2];
            if (diagonal[1] == -1) {
                dp[1][0] = dp[1][1] = 1;
            } else {
                dp[1][diagonal[1]] = 1;
            }

            for (int i = 2; i <= n; i++) {
                if (bottom[i] != -1 && top[i] != -1) {
                    dp[i][0] = dp[i - 1][DigitUtils.mod(bottom[i] + top[i], 2)];
                    dp[i][1] = dp[i - 1][DigitUtils.mod(bottom[i] + top[i] + 1, 2)];
                } else {
                    dp[i][1] = dp[i][0] = mod.plus(dp[i - 1][0], dp[i - 1][1]);
                }
                if (diagonal[i] != -1) {
                    dp[i][1 - diagonal[i]] = 0;
                }
            }

            int totalWay = mod.plus(dp[n][0], dp[n][1]);
            for (int i = 2; i <= n; i++) {
                if (top[i] == -1 && bottom[i] == -1) {
                    totalWay = mod.mul(totalWay, 2);
                }
            }
            for (int i = 3; i <= n; i++) {
                if (!decided[i]) {
                    totalWay = mod.mul(totalWay, 2);
                }
            }

            long remain = ((long) n * n - n - 2 * (n - 1) - 2 * (n - 2)) / 2;
            while (!maps[3].isEmpty()) {
                Map.Entry<Long, Integer> kv = maps[3].pollFirstEntry();
                Long otherSide = DigitUtils.asLong(DigitUtils.lowBit(kv.getKey()), DigitUtils.highBit(kv.getKey()));
                if (maps[3].containsKey(otherSide)) {
                    Integer otherSideValue = maps[3].remove(otherSide);
                    if (!kv.getValue().equals(otherSideValue)) {
                        valid = false;
                    }
                }
                remain--;
            }

            totalWay = mod.mul(totalWay, pow.pow(2, remain));

            if (valid) {
                out.println(totalWay);
            } else {
                out.println(0);
            }
        }

    }
    static class NumberTheory {
        public static class Modular {
            int m;

            public Modular(int m) {
                this.m = m;
            }

            public Modular(long m) {
                this.m = (int) m;
                if (this.m != m) {
                    throw new IllegalArgumentException();
                }
            }

            public Modular(double m) {
                this.m = (int) m;
                if (this.m != m) {
                    throw new IllegalArgumentException();
                }
            }

            public int valueOf(int x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return x;
            }

            public int valueOf(long x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return (int) x;
            }

            public int mul(int x, int y) {
                return valueOf((long) x * y);
            }

            public int plus(int x, int y) {
                return valueOf(x + y);
            }

            public String toString() {
                return "mod " + m;
            }

        }

        public static class Power {
            final NumberTheory.Modular modular;

            public Power(NumberTheory.Modular modular) {
                this.modular = modular;
            }

            public int pow(int x, long n) {
                if (n == 0) {
                    return modular.valueOf(1);
                }
                long r = pow(x, n >> 1);
                r = modular.valueOf(r * r);
                if ((n & 1) == 1) {
                    r = modular.valueOf(r * x);
                }
                return (int) r;
            }

        }

    }
    static class DigitUtils {
        private DigitUtils() {}

        public static long asLong(int high, int low) {
            return (((long) high) << 32) | low;
        }

        public static int highBit(long x) {
            return (int) (x >> 32);
        }

        public static int lowBit(long x) {
            return (int) x;
        }

        public static int mod(int x, int mod) {
            x %= mod;
            if (x < 0) {
                x += mod;
            }
            return x;
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

