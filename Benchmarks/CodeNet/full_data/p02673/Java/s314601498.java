import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    long[] a;
    int[] b;
    int n;

    int f(int pos) {
        return pos % n;
    }

    double calc(int from, int dist, double curAv) {
        if (dist <= 1) {
            return 0.0;
        }
        double sumB = 0;
        for (int i = 1; i < dist; i++) {
            sumB += b[f(from + i)];
        }
        curAv -= sumB;
        double res = calc(from + 1, dist - 2, curAv);
        if (dist == 2) {
            return res + curAv;
        } else {
            return res + curAv * 2;
        }
    }

    long solveDp() {
        long[] dp = new long[n + 1];
        dp[0] = 0;
        for (int lastPos = 0; lastPos < n; lastPos++) {
            long sumB = 0;
            for (int nextPos = lastPos + 1; nextPos <= n; nextPos++) {
                long ncost = dp[lastPos] + a[nextPos] * 2;
                long avCost = a[lastPos] + a[nextPos];
                long curBsum = sumB;
                long totAdditionalCost = sumB;
                for (int from = lastPos + 1, to = nextPos -1; from <= to; from++,to--) {
                    long more = avCost - totAdditionalCost * 2;
                    if (from == to) {
                        ncost += more;
                    } else {
                        ncost += more * 2;
                    }
                    curBsum -= b[from];
                    curBsum -= b[to];
                    totAdditionalCost += curBsum;
                }
                dp[nextPos] = Math.max(dp[nextPos], ncost);
                sumB += b[nextPos];
            }
        }
        return dp[n];
    }

    void solve() {
        n = in.nextInt();
        a = new long[n];
        b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        int maxPos = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > a[maxPos]) {
                maxPos = i;
            }
        }
        long[] na = new long[n + 1];
        int[] nb = new int[n + 1];
        for (int i = 0; i < n; i++) {
            na[i] = a[f(i + maxPos)];
            nb[i] = b[f(i + maxPos)];
        }
        na[n] = na[0];
        nb[n] = nb[0];
        a = na;
        b = nb;
        out.println(solveDp() / 2.0 / n);
    }

    void solve22() {
        n = in.nextInt();
        a = new long[n];
        b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        double bestAns = 0;
        for (int mask = 1; mask < 1 << n; mask++) {
            double curAns = 0;
            List<Integer> pos = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (((1 << i) & mask) != 0) {
                    curAns += a[i];
                    pos.add(i);
                }
            }
            for (int i = 0; i < pos.size(); i++) {
                int from = pos.get(i), to = pos.get((i + 1) % pos.size());
                int dist = (to - from + n) % n;
                if (dist == 0) {
                    dist += n;
                }
                curAns += calc(from, dist, (a[from] + a[to]) / 2.0);
            }
            curAns /= n;
            bestAns = Math.max(bestAns, curAns);
        }
        out.println(bestAns);
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