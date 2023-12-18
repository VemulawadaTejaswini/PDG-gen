import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        int N = nextInt();
        int W = nextInt();
        long dp[][] = new long[N+1][W+1];
        for (int i = 1; i <= N; i++) {
            int wi = nextInt();
            int vi = nextInt();
            for (int j = 1; j <= W; j++) {
                if (j >= wi) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-wi]+vi);
                }
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j]);
            }
        }
        System.out.println(dp[N][W]);
    }

    public static String nextString() throws Exception {
        String res = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            res += (char)c;
        }
        return res;
    }

    public static int nextInt() throws Exception {
        return Integer.parseInt(nextString());
    }

    public static long nextLong() throws Exception {
        return Long.parseLong(nextString());
    }
}
