import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    long d;
    long[] cost = new long[3];
    int[] divs = new int[]{2, 3, 5};

    Map<Long, Long> cache;

    long get(long n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        if (n == 1) {
            return d;
        }
        long res = Long.MAX_VALUE;
        if (n * 1.0 * d < 1e17) {
            res = n * d;
        }
        for (int it = 0; it < divs.length; it++) {
            int div = divs[it];
            for (long next = n - div + 1; next < n + div; next++) {
                if (next > 1 && next % div == 0) {
                    long curRes = Math.abs(next - n) * d + get(next / div) + cost[it];
                    res = Math.min(res, curRes);
                }
            }
        }
        cache.put(n, res);
        return res;
    }

    void solve() {
        int tc = in.nextInt();
        for (int t = 0; t < tc; t++) {
            long n = in.nextLong();
            cost[0] = in.nextLong();
            cost[1] = in.nextLong();
            cost[2] = in.nextLong();
            d = in.nextLong();
            cache = new HashMap<>();
            out.println(get(n));
        }
    }

    final int mod = 988244353;

    int mul(int x, int y) {
        return (int) ((x * 1L * y) % mod);
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