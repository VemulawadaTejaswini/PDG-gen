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
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            out.println(f(i));
        }
    }

    private static int f(int n) {
        int ret = 0;
        int max = (int) Math.ceil(Math.sqrt(n));
        for (int x = 1; x <= max; x++) {
            for (int y = 1; y <= max; y++) {
                // integer root of z^2 + bz + c = 0
                int b = x + y;
                int c = x * x + y * y + x * y - n;
                if (b * b - 4 * c < 0) continue;
                double d = Math.sqrt(b * b - 4 * c);
                int r1 = (int) Math.round((-b + d) / 2);
                int r2 = (int) Math.round((-b - d) / 2);

                if (r1 >= 1 && ok(x, y, r1, n)) {
                    ret++;
                }
                if (r2 >= 1 && ok(x, y, r2, n)) {
                    ret++;
                }
            }
        }
        return ret;
    }

    private static boolean ok(int x, int y, int z, int n) {
        return x * x + y * y + z * z + x * y + y * z + z * x == n;
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
