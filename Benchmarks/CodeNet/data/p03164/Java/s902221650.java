import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        int N = nextInt();
        int W = nextInt();
        int dp[][] = new int[2][100001];
        Arrays.fill(dp[0], 1000000001);
        Arrays.fill(dp[1], 1000000001);

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            int wi = nextInt();
            int vi = nextInt();
            for (int j = 0; j < 100001; j++) {
                if (i%2 == 1) {
                    if (j <= vi) {
                        dp[1][j] = Math.min(dp[0][j], wi);
                    } else {
                        dp[1][j] = Math.min(dp[0][j], dp[0][j-vi]+wi);
                    }

                    if (dp[1][j] <= W) {
                        ans = Math.max(ans, j);
                    } else {
                        break;
                    }
                } else {
                    if (j <= vi) {
                        dp[0][j] = Math.min(dp[1][j], wi);
                    } else {
                        dp[0][j] = Math.min(dp[1][j], dp[1][j-vi]+wi);
                    }

                    if (dp[0][j] <= W) {
                        ans = Math.max(ans, j);
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
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
