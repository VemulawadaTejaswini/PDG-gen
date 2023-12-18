import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        int N = nextInt();
        int W = nextInt();
        int dp[] = new int[100001];
        Arrays.fill(dp, 1000000001);

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            int wi = nextInt();
            int vi = nextInt();
            for (int j = 100000; j >= 0; j--) {
                if (j <= vi) {
                    dp[j] = Math.min(dp[j], wi);
                } else {
                    dp[j] = Math.min(dp[j], dp[j-vi]+wi);
                }

                if (dp[j] <= W) {
                    ans = Math.max(ans, j);
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
