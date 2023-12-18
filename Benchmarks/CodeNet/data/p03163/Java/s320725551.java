import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) {
        final FastScanner sc = new FastScanner();
        final int n = sc.nextInt();
        final int W = sc.nextInt();
        final int v[] = new int[n];
        final int w[] = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        final long dp[][] = new long[n + 1][W + 1];
        for (final long i[] : dp) {
            Arrays.fill(i, -1);
        }
        final long ans = knapsack(0, 0, v, w, W, dp);
        System.out.println(ans);
    }

    private static long knapsack(final int i, final long sum, final int[] v, final int[] w, final int w2,final long[][] dp) {
        if (dp[i][w2] != -1)
            return dp[i][w2];
        if (w2 < 0)
            return 0;
        if(w2==0 || i == v.length)
            return dp[i][w2] = sum;
        if(w2-w[i] >=0)
            return dp[i][w2] = Math.max(knapsack(i + 1, sum + v[i], v, w, w2 - w[i],dp), knapsack(i+1, sum, v, w, w2,dp));
        else
            return dp[i][w2] = knapsack(i+1, sum, v, w, w2, dp);
    }

    private static long knapsack_brute(final int i, final long sum, final int[] v, final int[] w, final int w2) {
        if (w2 < 0)
            return 0;
        if (i == v.length || w2 == 0)
            return sum;

        return Math.max(knapsack_brute(i + 1, sum + v[i], v, w, w2 - w[i]), knapsack_brute(i + 1, sum, v, w, w2));
    }

    static final Random random = new Random();

    static void sort(final int[] a) {
        final int n = a.length;
        for (int i = 0; i < n; i++) {
            final int val = random.nextInt(n);
            final int cur = a[i];
            a[i] = a[val];
            a[val] = cur;
        }
        Arrays.sort(a);
    }

    static void sortl(final long[] a) {
        final int n = a.length;
        for (int i = 0; i < n; i++) {
            final int val = random.nextInt(n);
            final long cur = a[i];
            a[i] = a[val];
            a[val] = cur;
        }
        Arrays.sort(a);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (final IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (final IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(final int n) {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

}
