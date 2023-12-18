import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = 1000000007L;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int x = in.nextInt();
        int y = in.nextInt();

        if ((2 * y - x) % 3 != 0 || (2 * x - y) % 3 != 0) {
            out.println(0);
            return;
        }

        int i = (2 * y - x) / 3;
        int j = (2 * x - y) / 3;

        if (i < 0 || j < 0) {
            out.println(0);
            return;
        }

        // ans == combination (i+j) C i mod MOD
        initFact(i+j);
        out.println(combinationMod(i+j, i));
    }

    private static long[] factMod;
    private static long[] iFactMod;

    private static void initFact(long n) {
        factMod = new long[(int)n+1];
        iFactMod = new long[(int)n+1];
        factMod[0] = 1;
        iFactMod[0] = 1;
        for (int i = 0; i < n; i++) {
            factMod[i+1] = factMod[i] * ((long) (i+1)) % MOD;
            iFactMod[i+1] = iFactMod[i] * modInv(i+1) % MOD;
        }
    }

    private static long modInv(long x) {
        return modPow(x, MOD-2);
    }

    private static long modPow(long x, long n) { //x^n(mod M) ←普通にpow(x,n)では溢れてしまうため，随時mod計算
        long ans = 1;
        while (n != 0) {
            if ((n & 1) == 1L) ans = ans * x % MOD;
            x = x * x % MOD;
            n = n >> 1;
        }
        return ans;
    }

    private static long combinationMod(int a, int b) {
        if(a == 0 && b == 0)return 1;
        if(a < b || a < 0)return 0;
        long tmp = iFactMod[a-b]* iFactMod[b] % MOD;
        return tmp * factMod[a] % MOD;
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
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

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
