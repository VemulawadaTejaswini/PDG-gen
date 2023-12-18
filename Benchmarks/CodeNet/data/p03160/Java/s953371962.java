import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scan.nextInt();
        int[] h = new int[n+2];
        for (int i = 0; i < n; i++) {
            h[i] = scan.nextInt();
        }
        long[] dp = new long[n+2];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            dp[i+1] = Math.min(dp[i+1],dp[i] + Math.abs(h[i+1]-h[i]));
            dp[i+2] = Math.min(dp[i+2],dp[i] + Math.abs(h[i+2]-h[i]));
        }
        System.out.println(dp[n-1]);
    }
}
