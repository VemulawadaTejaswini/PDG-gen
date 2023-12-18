import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        int N = nextInt(r);
        int h[] = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = nextInt(r);
        }

        int dp[] = new int[N];
        dp[1] = Math.abs(h[1]-h[0]);
        for (int i = 2; i < N; i++) {
            int abs2 = Math.abs(h[i]-h[i-2]);
            int abs1 = Math.abs(h[i]-h[i-1]);
            dp[i] = dp[i-2]+abs2 < dp[i-1]+abs1 ? dp[i-2]+abs2 : dp[i-1]+abs1;
        }
        System.out.println(dp[N-1]);
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
