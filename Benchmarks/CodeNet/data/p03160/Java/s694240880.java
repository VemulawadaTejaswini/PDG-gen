import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h[] = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            h[i] = sc.nextInt();
        }
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = Math.abs(h[2] - h[1]);
        for (int i = 3; i < n + 1; i++) {
            dp[i] = Math.min(dp[i - 2] + Math.abs(h[i] - h[i - 2]), dp[i - 1] + Math.abs(h[i] - h[i - 1]));
        }
        System.out.println(dp[n]);
    }
}