import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    private static final long MODULO = (long) (1e9 + 7);
    private static final long INF = (long) 1e18;
    private static final int MAX_BIT = 50;
    static long[] a;
    static long target;

    public static void main(String[] args) {
        BufferedScanner scanner = new BufferedScanner();
        PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

        int t = 1;//scanner.nextInt();
        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            target = 0;
            for (int i = 2; i < n; i++) {
                target ^= a[i];
            }
            long max = dfs(0, 0, 0);
            if (max <= 0) {
                writer.println(-1);
            } else {
                writer.println(a[0] - max);
            }
        }

        scanner.close();
        writer.flush();
        writer.close();
    }

    private static long dfs(int which, long aa, long bb) {
        long mask = (1L << which) - 1;
        if (((aa + bb) & mask) != ((a[0] + a[1]) & mask)) {
            return -INF;
        }
        if ((aa ^ bb) != (target & mask)) {
            return -INF;
        }
        if (aa > a[0] || aa + bb > a[0] + a[1]) {
            return -INF;
        }
        if (which > MAX_BIT) {
            return aa > 0 && aa + bb == a[0] + a[1] ? 0 : -INF;
        }
        long ans = -INF;
        for (int aBit = 0; aBit < 2; aBit++) {
            for (int bBit = 0; bBit < 2; bBit++) {
                long ans1 = dfs(which + 1, aa + ((long) aBit << which), bb + ((long) bBit << which));
                if (ans1 < 0) {
                    continue;
                }
                ans = Math.max(ans, ans1 + ((long) aBit << which));
            }
        }
        return ans;
    }

    static class ListInt extends ArrayList<Integer> {}

    public static class BufferedScanner {
        BufferedReader br;
        StringTokenizer st;

        public BufferedScanner(Reader reader) {
            br = new BufferedReader(reader);
        }

        public BufferedScanner() {
            this(new InputStreamReader(System.in));
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        void close() {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    static long gcd(long a, long b) {
        if (a < b) {
            return gcd(b, a);
        }
        while (b > 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    static long inverse(long a, long m) {
        long[] ans = extgcd(a, m);
        return ans[0] == 1 ? (ans[1] + m) % m : -1;
    }

    private static long[] extgcd(long a, long m) {
        if (m == 0) {
            return new long[]{a, 1, 0};
        } else {
            long[] ans = extgcd(m, a % m);
            long tmp = ans[1];
            ans[1] = ans[2];
            ans[2] = tmp;
            ans[2] -= ans[1] * (a / m);
            return ans;
        }
    }

    static long add(long a, long b) {
        a += b;
        if (a >= MODULO) {
            a -= MODULO;
        }
        return a;
    }

    static long sub(long a, long b) {
        a -= b;
        if (a < 0) {
            a += MODULO;
        }
        return a;
    }

    static long mul(long a, long b) {
        return a * b % MODULO;
    }

    static long div(long a, long b) {
        return a * inverse(b, MODULO) % MODULO;
    }

    static class Comb {
        final long modulo;
        final long[] fac, fnv;

        Comb(int limit, long modulo) {
            fac = new long[limit + 1];
            fnv = new long[limit + 1];
            fac[0] = 1;
            fnv[0] = 1;
            for (int i = 1; i <= limit; i++) {
                fac[i] = mul(fac[i - 1], i);
                fnv[i] = div(fnv[i - 1], i);
            }
            this.modulo = modulo;
        }

        long c(int total, int choose) {
            if (total < choose) {
                return 0;
            }
            if (total == 0 || total == choose) {
                return 1;
            }
            return mul(mul(fac[total], fnv[choose]), fnv[total - choose]);
        }
    }

}
