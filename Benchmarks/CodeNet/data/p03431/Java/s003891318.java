import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScan in = new MyScan(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        static long[] ff;
        static FFT f = new FFT();

        public void solve(int testNumber, MyScan in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            if (n > k) {
                out.print(0);
                return;
            }
            ff = new long[k + 1];
            ff[1] = 1;
            for (int i = 2; i <= k; i++) {
                ff[i] = ff[i - 1] * 2;
                ff[i] %= Util._m;
            }
            out.print(nn(n)[k]);
        }

        static long[] nn(int f) {
            if (f == 1) {
                return ff;
            }
            long[] x = nn(f / 2);
            x = op(x, x);
            if (f % 2 == 1) {
                x = op(x, nn(1));
            }
            return x;
        }

        private static long[] op(long[] x, long[] nn) {
            long[] res = new long[1 << 20];
            f.multiply(res, x, nn, ff.length);
            long sum = res[0];
            for (int i = 1; i < ff.length; i++) {
                long ns = (sum + res[i]) % Util._m;
                res[i] = (res[i] + Util._m - sum) % Util._m;
                sum = ns;
            }
            return res;
        }

    }

    static class Util {
        public static final long MOD_FFT2 = 998244353;
        public static final long _m = MOD_FFT2;
        private static long[] fact;
        private static long[] inv;
        private static long[] ifact;

        public static void l() {
            fact = new long[1000001];
            inv = new long[1000001];
            ifact = new long[1000001];
            for (int s = 0; s < 2; s++) {
                fact[s] = 1;
                ifact[s] = 1;
                inv[s] = 1;
            }
            for (int i = 2; i < inv.length; i++) {
                inv[i] = (_m - (_m / i) * inv[(int) (_m % i)] % _m) % _m;
            }
            for (int i = 2; i < fact.length; i++) {
                fact[i] = i * fact[i - 1];
                ifact[i] = inv[i] * ifact[i - 1];
                fact[i] %= _m;
                ifact[i] %= _m;
            }
        }

        public static long pow(long v, long k, long m) {
            if (k == 0) return 1;
            long t = pow(v, k / 2, m);
            t *= t;
            t %= m;
            if (k % 2 == 1) {
                t *= v;
            }
            return t % m;

        }

        public static long powm(long v, long k) {
            return pow(v, k, _m);
        }

        public static long inv(long v) {
            if (inv == null) l();
            if (v < 1000000) return inv[(int) v];
            return powm(v, _m - 2);
        }

    }

    static class FFT {
        private int pow = 1 << 23;
        private long root = 31;
        private long rev_root = Util.inv(root);
        long[] ffFirst;
        long[] ffSecond;

        public void multiply(long[] result, long[] first, long[] second, int length) {
            if (ffFirst == null) {
                ffFirst = new long[result.length];
                ffSecond = new long[result.length];
            }
            int resultSize = Integer.highestOneBit(length - 1) << 2;
            resultSize = Math.max(resultSize, 4);
            Arrays.fill(ffFirst, 0, resultSize, 0);
            Arrays.fill(ffSecond, 0, resultSize, 0);
            System.arraycopy(first, 0, ffFirst, 0, length);
            System.arraycopy(second, 0, ffSecond, 0, length);
            fft(ffFirst, false, resultSize);
            if (first == second) {
                System.arraycopy(ffFirst, 0, ffSecond, 0, resultSize);
            } else
                fft(ffSecond, false, resultSize);
            for (int i = 0; i < resultSize; i++) {
                ffFirst[i] *= ffSecond[i];
                ffFirst[i] %= Util._m;
            }
            fft(ffFirst, true, resultSize);
            System.arraycopy(ffFirst, 0, result, 0, length);

        }

        private void fft(long[] data, boolean invert, int length) {
            for (int i = 1, j = 0; i < length; ++i) {
                int bit = length >> 1;
                for (; j >= bit; bit >>= 1)
                    j -= bit;
                j += bit;
                if (i < j) {
                    long temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }

            for (int len = 2; len <= length; len <<= 1) {
                long wlen = invert ? rev_root : root;
                for (int i = len; i < pow; i <<= 1)
                    wlen = wlen * wlen % Util._m;
                int half = len >> 1;
                for (int i = 0; i < length; i += len) {
                    long w = 1;
                    for (int j = 0; j < half; ++j) {
                        long u = data[i + j], v = data[i + j + half] * w % Util._m;
                        data[i + j] = u + v < Util._m ? u + v : u + v - Util._m;
                        data[i + j + half] = u - v >= 0 ? u - v : u - v + Util._m;
                        w = w * wlen % Util._m;
                    }
                }
            }

            if (invert) {
                long revLength = Util.inv(length);
                for (int i = 0; i < length; ++i)
                    data[i] = data[i] * revLength % Util._m;
            }
        }

    }

    static class MyScan {
        BufferedReader br;
        StringTokenizer st;

        MyScan(BufferedReader br) {
            this.br = br;
        }

        public MyScan(InputStream in) {
            this(new BufferedReader(new InputStreamReader(in)));
        }

        public void findToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public String next() {
            findToken();
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

