
import java.io.*;
import java.util.*;

public class Main {
    private static final long INF = Long.MAX_VALUE;
    private static final int MOD = 1000000007;

    private long pow(long a, long n) {
        long ret = 1;
        long base = a;
        while (n > 0) {
            if ((n & 1) > 0) {
                ret = (ret * base) % MOD;
            }
            base = (base * base) % MOD;
            n >>= 1;
        }
        return ret;
    }

    private void add(Map<Double, int[]> cnt, double key, int i) {
        int[] v = cnt.computeIfAbsent(key, k -> new int[]{0, 0});
        ++v[i];
    }

    private void solve() {
        int n = sc.nextInt();
        Map<Double, int[]> cnt = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) {
                continue;
            }
            if (a == 0L) {
                add(cnt, 0.0, 0);
            } else if (b == 0L) {
                add(cnt, 0.0, 1);
            } else {
                if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
                    add(cnt,1.0 * a / b, 0);
                } else {
                    add(cnt, -1.0 * b / a, 1);
                }
            }
        }

        long ans = 1;
        for (int[] v : cnt.values()) {
            ans = (ans * ((pow(2, v[0]) + pow(2, v[1]) - 1 + MOD) % MOD)) % MOD;
        }

        ans = (ans - 1 + MOD) % MOD;
        out.println(ans);
    }

    private static PrintWriter out;
    private static MyScanner sc;

    private static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        private MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        sc = new MyScanner();
        new Main().solve();
        out.close();
    }
}
