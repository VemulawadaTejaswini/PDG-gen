import java.util.*;
import java.io.*;

// Template for atcoder
public class Main {

    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;
    boolean eof;
    final long MOD = 1000L * 1000L * 1000L + 7;
    private static final int[] dx = {0, -1, 0, 1};
    private static final int[] dy = {1, 0, -1, 0};

    long[] dp;
    long[] takeAll;
    void solve() throws IOException {
        int n = nextInt();
        long[][] mat = new long[n][n];
        for (int i = 0; i < n; i++) {
            mat[i] = nextLongArr(n);
        }
        takeAll = new long[1 << n];
        for (int mask = 0; mask < (1 << n); mask++) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if ((mask & (1 << i)) != 0 && (mask & (1 << j)) != 0) {
                        takeAll[mask] += mat[i][j];
                    }
                }
            }
        }
        dp = new long[1 << n];
        Arrays.fill(dp, -1);
        long res = rec((1 << n) - 1);
        outln(res);
    }

    long rec(int mask) {
        if (mask == 0) {
            return 0;
        }
        if (dp[mask] != -1) {
            return dp[mask];
        }
        long res = Long.MIN_VALUE;
        for (int sub = mask; sub > 0; sub = (sub - 1) & mask) {
            res = Math.max(res, takeAll[sub] + rec(sub ^ mask));
        }
        dp[mask] = res;
        return res;
    }

    void shuffle(int[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            int tmp = a[i];
            a[i] = a[r];
            a[r] = tmp;
        }
    }
    private void outln(Object o) {
        out.println(o);
    }
    private void out(Object o) {
        out.print(o);
    }
    public Main() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }
    public static void main(String[] args) throws IOException {
        new Main();
    }

    public long[] nextLongArr(int n) throws IOException{
        long[] res = new long[n];
        for(int i = 0; i < n; i++)
            res[i] = nextLong();
        return res;
    }
    public int[] nextIntArr(int n) throws IOException {
        int[] res = new int[n];
        for(int i = 0; i < n; i++)
            res[i] = nextInt();
        return res;
    }
    public String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                eof = true;
                return null;
            }
        }
        return st.nextToken();
    }
    public String nextString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            eof = true;
            return null;
        }
    }
    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
    public long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
    public double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }
}
