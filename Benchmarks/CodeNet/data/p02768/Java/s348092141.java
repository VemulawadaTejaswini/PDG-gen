import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static long MOD = 1_000_000_000 + 7;
    static long[] fact = new long[1];

    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime();
        int t = 1;
        while (t-- > 0) {
            solve();
        }
        long endTime = System.nanoTime();
        err.println("Execution Time : +" + (endTime - startTime) / 1000000 + " ms");
        exit(0);
    }

    static void solve() {
        long n = in.nextInt();
        long a = in.nextInt();
        long b = in.nextInt();
        long res = ModularArithmetic.mod_pow(2, n) - 1;
        long s1 = 1;
        long d1 = 1;
        long s2 = 1;
        long d2 = 1;
        for (long i = n, j = 1; j <= a; j++, i--) {
            s1 *= i;
            s1 %= MOD;
            d1 *= j;
            d1 %= MOD;
        }
        for (long i = n, j = 1; j <= b; j++, i--) {
            s2 *= i;
            s2 %= MOD;
            d2 *= j;
            d2 %= MOD;
        }
        long sub = ModularArithmetic.divide(s1, d1) + ModularArithmetic.divide(s2, d2);
        sub %= MOD;
        res -= sub;
        out.println(res);
    }

    static class ModularArithmetic {
        static long C(int n, int k) {
            return divide(fact[n], mul(fact[k], fact[n - k]));
        }

        static void precalc(int N) {
            fact = new long[N + 5];
            fact[0] = 1;
            for (int i = 1; i < N; i++)
                fact[i] = mul(fact[i - 1], i);
        }

        static long inv(long x) {
            return mod_pow(x, MOD - 2);
        }

        static long mul(long x, long y) {
            return (x * y) % MOD;
        }

        static long divide(long x, long y) {
            return mul(x, inv(y));
        }

        static long add(long x, long y) {
            x += y;
            while (x >= MOD)
                x -= MOD;
            while (x < 0)
                x += MOD;
            return x;
        }

        static long mod_pow(long x, long y) {
            if (y == 0) {
                return 1;
            }
            if (y == 1) {
                return x;
            }
            long v = mod_pow(x, y / 2);
            if ((y & 1) > 0) {
                return v * v % MOD * x % MOD;
            }
            return v * v % MOD;
        }
    }

    static void debug(Object... args) {
        for (Object a : args) {
            out.println(a);
        }
    }

    static void y() {
        out.println("YES");
    }

    static void n() {
        out.println("NO");
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readAllInts(int n) {
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public int[] readAllInts(int n, int s) {
            int[] p = new int[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n) {
            long[] p = new long[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n, int s) {
            long[] p = new long[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    static void exit(int a) {
        out.close();
        err.close();
        System.exit(a);
    }

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static OutputStream errStream = System.err;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);
    static PrintWriter err = new PrintWriter(errStream);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

}
