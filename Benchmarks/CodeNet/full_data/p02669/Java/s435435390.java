import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
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
        APayToWin solver = new APayToWin();
        solver.solve(1, in, out);
        out.close();
    }

    static class APayToWin {
        Map<Long, Long> memo;
        int[] cost;
        int[] mod = new int[]{2, 3, 5};

        long go(long n) {
//        System.err.println(n);
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return cost[3];
            }
            if (memo.containsKey(n)) {
                return memo.get(n);
            }
            long ans = Long.MAX_VALUE;
            if (n * 1.0 * cost[3] < 1e18) {
                ans = n * cost[3];
            }
            for (int t = 0; t < 3; t++) {
                long rem = n % mod[t];
                ans = Math.min(ans, go(n / mod[t]) + cost[t] + rem * cost[3]);
                if (n / mod[t] + 1 < n) {
                    ans = Math.min(ans, go(n / mod[t] + 1) + cost[t] + (mod[t] - rem) * cost[3]);
                }
            }
            memo.put(n, ans);
            return ans;
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int t = in.nextInt();
            while (t-- > 0) {
                long n = in.nextLong();
                cost = in.nextIntArray(4);
                memo = new HashMap<>();
                out.println(go(n));
            }
        }

    }

    static class FastScanner {
        public BufferedReader br;
        public StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int[] nextIntArray(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

    }
}

