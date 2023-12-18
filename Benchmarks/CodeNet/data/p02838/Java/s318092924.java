import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static long MOD = 1_000_000_000 + 7;

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
        int n = in.nextInt();
        long[] data = in.readAllLongs(n);
        int[][] sum = new int[n][70];
        long ans = 0;
        for (int i = n - 1, l = 0; i >= 0; i--, l++) {
            int[] d = getInts(data[i]);
            for (int j = d.length - 1, k = 0; j >= 0; j--, k++) {
                if (l > 0) {
                    int p = l - sum[i + 1][j];
                    if (d[j] == 1) {
                        ans += mod_pow(2, k) * p;
                    } else {
                        ans += mod_pow(2, k) * sum[i + 1][j];
                    }
                }
                ans %= MOD;
                sum[i][j] += d[j];
                if (i + 1 < n) {
                    sum[i][j] += sum[i + 1][j];
                }
            }
        }
        out.println(ans);
    }

    private static int[] getInts(long datum) {
        int[] temp = new int[64];
        int len = 63;
        while (datum > 0) {
            temp[len--] = (int) (datum % 2);
            datum /= 2;
        }
        return temp;
    }

    static String app(String v) {
        int target = 64 - v.length();
        StringBuilder p = new StringBuilder();
        for (int i = 0; i < target; i++) {
            p.append(0);
        }
        p.append(v);
        return p.toString();
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

    static long compute(int ind) {
        return mod_pow(2, ind);
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
                p[i] = in.nextLong();
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
