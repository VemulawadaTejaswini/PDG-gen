import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            int t = scan.nextInt();
            D[i] = Math.min(t, 24-t);
        }
        Arrays.sort(D);
        int[][][] dp = new int[N+1][24+1][24+1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= 24; j++) {
                Arrays.fill(dp[i][j], Integer.MAX_VALUE);
            }
        }
        dp[0][0][24] = 24;
        for (int i = 1; i <= N; i++) {
            for (int right = 0; right < 24; right ++) {
                for (int left = 24; right <= left; left--) {
                    if (dp[i-1][right][left] == Integer.MAX_VALUE) {
                        continue;
                    }
                    dp[i][D[i-1]][left] = Math.min(dp[i-1][D[i-1]][left], Math.min(Math.abs(left-D[i-1]),Math.abs(D[i-1]-right)));
                    dp[i][right][24-D[i-1]] = Math.min(dp[i-1][right][24-D[i-1]], Math.min(Math.abs(left-(24-D[i-1])), Math.abs(24-D[i-1]-right)));
                }
            }
        }
        int ans = 0;
        for (int right = 0; right < 24; right++) {
            for (int left = 24; right <= left; left--) {
                if (dp[N][right][left] == Integer.MAX_VALUE) {
                    continue;
                }
                ans = Math.max(ans, dp[N][right][left]);
            }
        }
        System.out.println(ans);
    }
}
