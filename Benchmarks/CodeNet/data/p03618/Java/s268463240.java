import java.io.*;
import java.util.*;

public class Main {
    private FastScanner in;
    private PrintWriter out;

    class Rat {
        long a, b;

        public Rat(long a, long b) {
            this.a = a;
            this.b = b;
            good();
        }

        Rat add(Rat an) {
            return new Rat(an.a * b + a * an.b, an.b * b);
        }

        Rat mul(Rat o) {
            return new Rat(a * o.a, b * o.b);
        }

        void good() {
            long g = gcd(a, b);
            a /= g;
            b /= g;
        }

        @Override
        public String toString() {
            String res = a + "/" + b;
            while (res.length() < 10) {
                res += " ";
            }
            return res;
        }
    }

    long gcd(long x, long y) {
        return x == 0 ? y : gcd(y % x, x);
    }

    void solve() {
        String s = in.next();
        int n = s.length();
        long res = n * 1L * (n - 1) / 2 + 1;
        int[] sum = new int[256];
        for (char c : s.toCharArray()) {
            res -= sum[c];
            sum[c]++;
        }
        out.println(res);
    }

    private void solve123() {

        final int n = 10;
        Rat[][] dp = new Rat[n][n];
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[0][i] = new Rat(i, 1);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (i <= j) {
                    Rat left = new Rat(j, i + j + 0).mul(new Rat(1, 1).add(dp[i][j - 1]));
                    Rat right = new Rat(i, (i + j)).mul(dp[i - 1][j]);
                    dp[i][j] = left.add(right);
                } else {
                    dp[i][j] = dp[j][i];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.err.printf(dp[i][j] + " ");
            }
            System.err.println("");
        }
        System.err.println(dp[3][4]);
    }

    private void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void runIO() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    private class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        FastScanner(InputStream f) {
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