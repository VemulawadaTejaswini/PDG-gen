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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EXORPartitioning solver = new EXORPartitioning();
        solver.solve(1, in, out);
        out.close();
    }

    static class EXORPartitioning {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.ni();
            int[] a = in.na(N);
            int[] pref = new int[N + 1];
            for (int i = 0; i < N; i++) {
                pref[i + 1] = pref[i] ^ a[i];
            }
            long mod = (int) 1e9 + 7;
            int s = pref[N];
            if (s != 0) {
                long dp0 = 1;
                long dpS = 0;
                for (int i = 0; i <= N; i++) {
                    if (pref[i] == 0) {
                        dp0 = (dp0 + dpS) % mod;
                    } else if (pref[i] == s) {
                        dpS = (dpS + dp0) % mod;
                    }
                }
                out.println(dp0);
            } else {
                int MAX = 1 << 20;
                int[] cnt0 = new int[N + 1];
                for (int i = 0; i < N; i++) {
                    cnt0[i + 1] = cnt0[i] + (pref[i + 1] == 0 ? 1 : 0);
                }
                int[] idx = new int[MAX + 1];
                Arrays.fill(idx, -1);
                long[] dps = new long[MAX + 1];
                long[] dp0 = new long[MAX + 1];
                Arrays.fill(dp0, 1);
                int tot0 = 0;
                for (int i = 1; i < N; i++) {
                    int p = pref[i];
                    if (p == 0) {
                        tot0++;
                        continue;
                    }
                    if (idx[p] == -1) {
                        dps[p] = 1;
                    } else {
                        dp0[p] = (dp0[p] + dps[p] * (cnt0[i] - cnt0[idx[p]])) % mod;
                        dps[p] = (dps[p] + dp0[p]) % mod;
                    }
                    idx[p] = i;
                }
                long ans = 0;
                if (tot0 > 0) {
                    ans = (IntegerUtils.pow(2, tot0, mod) + mod - 1) % mod;
                }
                for (int i = 0; i <= MAX; i++) {
                    if (dps[i] > 0) {
                        ans = (ans + dps[i]) % mod;
                    }
                }
                out.println((ans + 1) % mod);
            }
//        System.out.println("Arrays.toString(pref) = " + Arrays.toString(pref));


        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String ns() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int ni() {
            return Integer.parseInt(ns());
        }

        public int[] na(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = ni();
            return a;
        }

    }

    static class IntegerUtils {
        public static long pow(long a, long p, long mod) {
            if (p == 0) {
                return 1;
            }
            long t = pow(a, p / 2, mod);

            if (p % 2 != 0) {
                return (((t * t) % mod) * a) % mod;
            } else {
                return (t * t) % mod;
            }
        }

    }
}

