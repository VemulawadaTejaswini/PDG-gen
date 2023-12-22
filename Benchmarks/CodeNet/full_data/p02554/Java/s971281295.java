import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pradyumn Agrawal (coderbond007)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CUbiquity solver = new CUbiquity();
        solver.solve(1, in, out);
        out.close();
    }

    static class CUbiquity {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            long N = in.nextLong();
            long all = Modular.powerMod(10, N, Modular.MOD7);
            long remove = Modular.subtract(Modular.multiply(2L, Modular.powerMod(9, N, Modular.MOD7), Modular.MOD7), Modular.powerMod(8, N, Modular.MOD7), Modular.MOD7);
            out.println(Modular.subtract(all, remove, Modular.MOD7));
        }

    }

    static class Modular {
        public static final long MOD7 = (long) 1e9 + 7;

        public static long powerMod(long a, long n, long mod) {
            //    a %= mod;
            long ret = 1;
            int x = 63 - Long.numberOfLeadingZeros(n);
            for (; x >= 0; x--) {
                ret = ret * ret % mod;
                if (n << 63 - x < 0) ret = ret * a % mod;
            }
            return ret;
        }

        public static long multiply(long a, long b, long MODULO) {
            long res = 0;
            a %= MODULO;
            while (b != 0) {
                if ((b & 1) != 0) {
                    res = (res + a) % MODULO;
                }
                a = a * 2 % MODULO;
                b >>>= 1;
            }
            return res;
        }

        public static long subtract(long a, long b, long mod) {
            long ans = a - b;
            while (ans < mod) ans += mod;
            return ans % mod;
        }

    }

    static class FastScanner {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public FastScanner(InputStream inputStream) {
            reader = new BufferedReader(new InputStreamReader(inputStream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

