import java.io.*;
import java.util.StringTokenizer;

public class Main {
    FastScanner in;
    PrintWriter out;

    void solve() {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        // (a, b) -> (c, d)
        int[][] dp = new int[c + 1][d + 1];
        for (int x = a; x <= c; x++) {
            int pref = 0;
            for (int y = b; y <= d; y++) {
                if (x == a) {
                    if (y == b) {
                        dp[x][y] = 1;
                    } else {
                        dp[x][y] = mul(dp[x][y - 1], x);
                    }
                } else {
                    dp[x][y] = add(dp[x][y], mul(y, dp[x - 1][y]));
                    if (y != b) {
                        pref = add(mul(pref, x), mul(y - 1, dp[x - 1][y - 1]));
                    }
                    dp[x][y] = add(dp[x][y], pref);

//                    int mul = 1;
//                    for (int sz = 0; y - sz >= b; sz++) {
//                        dp[x][y] = add(dp[x][y], mul(y - sz, mul(mul, dp[x - 1][y - sz])));
//                        if (sz != 0) {
//                            mul = mul(mul, x);
//                        }
//                    }
                }
            }
        }
        out.println(dp[c][d]);
    }

    final int mod = 998244353;

    int mul(int x, int y) {
        return (int) ((x * 1L * y) % mod);
    }

    int add(int x, int y) {
        x += y;
        return x >= mod ? (x - mod) : x;
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();
        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
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
        new Main().runIO();
    }
}