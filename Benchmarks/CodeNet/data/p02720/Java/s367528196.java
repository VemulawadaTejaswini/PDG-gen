import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int k = in.nextInt();

        int cumulative = 0;
        int p = 0, d = 0;
        init:
        for (int place = 0; place < 11; place++) {
            count(place, 0);
            for (int digit = 1; digit < 10; digit++) {
                int toAdd = count(place, digit);
                cumulative += toAdd;
                if (cumulative >= k) {
                    cumulative -= toAdd;
                    p = place;
                    d = digit;
                    break init;
                }
            }
        }

        // out.println("Init place " + p + " digit " + d);

        long ans = 0;
        while (p > 0) {
            ans += Math.pow(10, p) * d;

            p--;
            int oldDigit = d;
            for (d = Math.max(0, oldDigit - 1); d < Math.min(10, oldDigit + 2); d++) {
                int toAdd = count(p, d);
                cumulative += toAdd;
                if (cumulative >= k) {
                    cumulative -= toAdd;
                    break;
                }
            }
        }

        ans += d;
        out.println(ans);
    }

    private static int[][] counts = new int[11][10];

    static {
        for (int i = 0; i < 10; i++) {
            counts[0][i] = 1;
        }
    }

    private static int count(int place, int digit) {
        if (place == 0) {
            return 1;
        }

        int ret = 0;
        if (digit != 0) {
            ret += counts[place - 1][digit - 1];
        }
        ret += counts[place - 1][digit];
        if (digit != 9) {
            ret += counts[place - 1][digit + 1];
        }

        counts[place][digit] = ret;
        // out.println("Place " + place + " digit " + digit + ", count " + ret);
        return ret;
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
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
