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

    void solve() throws IOException {
        int H = nextInt();
        int W = nextInt();
        long[][] dp = new long[H][W];
        char[][] mat = new char[H][W];
        for (int i = 0; i < H; i++) {
            mat[i] = nextString().toCharArray();
        }
        dp[0][0] = 1;
        for (int i = 1; i < H; i++) {
            if (mat[i][0] == '#') {
                break;
            } else {
                dp[i][0] = 1;
            }
        }
        for (int j = 1; j < W; j++) {
            if (mat[0][j] == '#') {
                break;
            } else {
                dp[0][j] = 1;
            }
        }

        for (int i = 1; i < H; i++) {
            for (int j = 1; j < W; j++) {
                if (mat[i][j] == '#') {
                    continue;
                }
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                dp[i][j] = dp[i][j] % MOD;
            }
        }

        outln(dp[H - 1][W - 1]);
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
