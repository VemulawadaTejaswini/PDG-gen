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
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);
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
            FPass solver = new FPass();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class FPass {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            Modular mod = new Modular(998244353);
            char[] s = in.readString().toCharArray();
            int n = s.length;

            int[][] dp = new int[n + 1][n + 1];
            dp[0][0] = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    int b = j;
                    int r = i - j;
                    int way = dp[i][j];
                    if (way == 0) {
                        continue;
                    }
                    if (s[i] == '0') {
                        //two blue
                        //this is blue
                        dp[i + 1][j + 1] = mod.plus(dp[i + 1][j + 1], way);
                        //this is red
                        if (r > 0) {
                            dp[i + 1][j + 2] = mod.plus(dp[i + 1][j + 2], way);
                        }
                    } else if (s[i] == '1') {
                        //one blue one red
                        //this is blue
                        dp[i + 1][j] = mod.plus(dp[i + 1][j], way);
                        //this is red
                        dp[i + 1][j + 1] = mod.plus(dp[i + 1][j + 1], way);
                    } else {
                        //two red
                        //this is blue
                        if (j > 0) {
                            dp[i + 1][j - 1] = mod.plus(dp[i + 1][j - 1], way);
                        }
                        //this is red
                        dp[i + 1][j] = mod.plus(dp[i + 1][j], way);
                    }
                }
            }

            int ans = 0;
            Combination comb = new Combination(n, new Power(mod));
            for (int i = 0; i <= n; i++) {
                int way = dp[n][i];
                way = mod.mul(way, comb.combination(n, i));
                ans = mod.plus(ans, way);
            }
            out.println(ans);
        }

    }

    static class Power implements InverseNumber {
        static IntExtGCDObject extGCD = new IntExtGCDObject();
        final Modular modular;

        public Modular getModular() {
            return modular;
        }

        public Power(Modular modular) {
            this.modular = modular;
        }

        public int inverse(int x) {
            int ans = inverseExtGCD(x);
//        if(modular.mul(ans, x) != 1){
//            throw new IllegalStateException();
//        }
            return ans;
        }

        public int inverseExtGCD(int x) {
            if (extGCD.extgcd(x, modular.getMod()) != 1) {
                throw new IllegalArgumentException();
            }
            return modular.valueOf(extGCD.getX());
        }

    }

    static class ExtGCD {
        public static int extGCD(int a, int b, int[] xy) {
            if (a >= b) {
                return extGCD0(a, b, xy);
            }
            int ans = extGCD0(b, a, xy);
            SequenceUtils.swap(xy, 0, 1);
            return ans;
        }

        private static int extGCD0(int a, int b, int[] xy) {
            if (b == 0) {
                xy[0] = 1;
                xy[1] = 0;
                return a;
            }
            int ans = extGCD0(b, a % b, xy);
            int x = xy[0];
            int y = xy[1];
            xy[0] = y;
            xy[1] = x - a / b * y;
            return ans;
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

        public FastOutput append(int c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(int c) {
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

    static class Modular {
        int m;

        public int getMod() {
            return m;
        }

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

    static class SequenceUtils {
        public static void swap(int[] data, int i, int j) {
            int tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }

    }

    static interface InverseNumber {
    }

    static interface IntCombination {
    }

    static class Combination implements IntCombination {
        final Factorial factorial;
        final Modular modular;

        public Combination(Factorial factorial) {
            this.factorial = factorial;
            this.modular = factorial.getMod();
        }

        public Combination(int limit, Power pow) {
            this(new Factorial(limit, pow));
        }

        public int combination(int m, int n) {
            if (n > m || n < 0) {
                return 0;
            }
            return modular.mul(modular.mul(factorial.fact(m), factorial.invFact(n)), factorial.invFact(m - n));
        }

    }

    static class Factorial {
        int[] fact;
        int[] inv;
        Modular mod;

        public Modular getMod() {
            return mod;
        }

        public Factorial(int[] fact, int[] inv, Power pow) {
            this.mod = pow.getModular();
            this.fact = fact;
            this.inv = inv;
            fact[0] = inv[0] = 1;
            int n = Math.min(fact.length, pow.getModular().getMod());
            for (int i = 1; i < n; i++) {
                fact[i] = i;
                fact[i] = mod.mul(fact[i], fact[i - 1]);
            }
            inv[n - 1] = pow.inverse(fact[n - 1]);
            for (int i = n - 2; i >= 1; i--) {
                inv[i] = mod.mul(inv[i + 1], i + 1);
            }
        }

        public Factorial(int limit, Power pow) {
            this(new int[limit + 1], new int[limit + 1], pow);
        }

        public int fact(int n) {
            return fact[n];
        }

        public int invFact(int n) {
            return inv[n];
        }

    }

    static class FastInput {
        private final InputStream is;
        private StringBuilder defaultStringBuf = new StringBuilder(1 << 13);
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

    }

    static class IntExtGCDObject {
        private int[] xy = new int[2];

        public int extgcd(int a, int b) {
            return ExtGCD.extGCD(a, b, xy);
        }

        public int getX() {
            return xy[0];
        }

    }
}

