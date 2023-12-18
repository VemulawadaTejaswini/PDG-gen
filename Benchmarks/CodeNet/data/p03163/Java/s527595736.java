import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        int N = nextInt(r);
        int W = nextInt(r);
        long dp[][] = new long[N+1][W+1];
        for (int i = 1; i <= N; i++) {
            int wi = nextInt(r);
            int vi = nextInt(r);
            for (int j = 1; j <= W; j++) {
                if (j >= wi) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-wi]+vi);
                }
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j]);
            }
        }
        System.out.println(dp[N][W]);
    }

    public static String nextString(InputStreamReader r) throws Exception {
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

    public static int nextInt(InputStreamReader r) throws Exception {
        return Integer.parseInt(nextString(r));
    }

    public static long nextLong(InputStreamReader r) throws Exception {
        return Long.parseLong(nextString(r));
    }
}
