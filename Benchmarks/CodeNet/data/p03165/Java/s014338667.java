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
        char[] a = nextString().toCharArray();
        char[] b = nextString().toCharArray();
        int[][] dp = new int[1 + a.length][1 + b.length];
        // 0: left, 1: up, 2: left-up
        int[][] prev = new int[1 + a.length][1 + b.length];
        for (int i = 1; i <= a.length; i++) {
            for (int j = 1; j <= b.length; j++) {
                if (a[i - 1] == b[j - 1]) {
                    if (dp[i][j] < 1 + dp[i - 1][j - 1]) {
                        dp[i][j] = Math.max(dp[i][j], 1 + dp[i - 1][j - 1]);
                        prev[i][j] = 2;
                    }
                }
                if (dp[i][j] < dp[i][j - 1]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][j - 1]);
                    prev[i][j] = 0;
                }
                if (dp[i][j] < dp[i - 1][j]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                    prev[i][j] = 1;
                }
            }
        }
        StringBuilder res = new StringBuilder();
        int startA = a.length;
        int startB = b.length;
        while (startA >= 1 && startB >= 1) {
            if (prev[startA][startB] == 0) {
                startB--;
            } else if (prev[startA][startB] == 1) {
                startA--;
            } else if (prev[startA][startB] == 2) {
                res.append(a[startA - 1]);
                startA--;
                startB--;
            }
        }
        outln(res.reverse().toString());
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
