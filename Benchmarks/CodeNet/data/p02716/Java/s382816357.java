
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static final long INF = (long) 1e17;
    static int n, a[], maxskips;
    static Long memo[][];

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        a = sc.nextIntArray(n);
        maxskips = 1 + (n % 2);
        memo = new Long[3][n];
        long ans = dp(0, 0);
        out.println(ans);
        out.flush();
        out.close();
    }

    static long dp(int skip, int i) {
        if (skip > maxskips) return -INF;
        if (i >= n) return 0;
        if (memo[skip][i] != null) return memo[skip][i];
        long max = a[i] + dp(skip, i + 2);
        if (i != n - 1) max = Math.max(max, dp(skip + 1, i + 1));
        return memo[skip][i] = max;
    }


    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        boolean ready() throws IOException {
            return br.ready();
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        Scanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        int nextChar() throws IOException {
            return next().charAt(0);
        }

        int[] nextIntArray(int n) throws IOException {
            int[] ans = new int[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextInt();
            return ans;
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

    }
}
