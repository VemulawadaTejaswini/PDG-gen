import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        final int INF = 1<<29;
        int[] dp = new int[n];
        Arrays.fill(dp,INF);

        dp[0] = 0;
        for(int i=0; i<n; i++){
            for(int j=1; j<=k && i+j<n; j++){
                dp[i+j] = Math.min(dp[i+j], dp[i] + Math.abs(h[i] - h[i+j]));
            }
        }
        System.out.println(dp[n-1]);
    }
}