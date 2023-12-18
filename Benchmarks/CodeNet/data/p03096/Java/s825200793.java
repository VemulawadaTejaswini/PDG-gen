import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        List<Integer> C = new ArrayList<>();
        int prev = -1;
        for (int i = 1; i <= N; i++) {
            int color = scan.nextInt();
            if (prev == color) {
                continue;
            }
            C.add(color);
            prev = color;
        }
        int len = C.size();
        long[] dp = new long[len+1];
        long[] sum_color = new long[200001];
        dp[0] = 1;
        for (int i = 1; i <= len; i++) {
            int color = C.get(i-1);
            sum_color[color] += dp[i-1];
            sum_color[color] %= MOD;
            dp[i] = sum_color[color];
            dp[i] %= MOD;
        }
        System.out.println(dp[len]);
    }
}
