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
        char[] arr = nextString().toCharArray();
        int d = nextInt();
        long[][][] dp = new long[2][2][d];
        dp[0][1][0] = 1;
        for (int p = 0; p < arr.length; p++) {
            char c = arr[p];
            long[][][] nxt = new long[2][2][d];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < d; k++) {
                        if (dp[i][j][k] == 0) {
                            continue;
                        }

                        if (i == 0) {
                            for (int digit = 0; digit <= c - '0'; digit++) {
                                int start = (j == 0 || digit != 0 || p == arr.length - 1) ? 0 : 1;
                                int equal = (digit == c - '0') ? 0 : 1;
                                nxt[equal][start][(k + digit) % d] += dp[i][j][k];
                                if (nxt[equal][start][(k + digit) % d] >= MOD) {
                                    nxt[equal][start][(k + digit) % d] -= MOD;
                                }
                            }
                        } else {
                            for (int digit = 0; digit < 10; digit++) {
                                int start = (j == 0 || digit != 0 || p == arr.length - 1) ? 0 : 1;
                                nxt[i][start][(k + digit) % d] += dp[i][j][k];
                                if (nxt[i][start][(k + digit) % d] >= MOD) {
                                    nxt[i][start][(k + digit) % d] -= MOD;
                                }
                            }
                        }
                    }
                }
            }

            dp = nxt;
        }

        long res = dp[0][0][0] + dp[1][0][0];
        if (res >= MOD) {
            res -= MOD;
        }
        outln(res - 1);
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
