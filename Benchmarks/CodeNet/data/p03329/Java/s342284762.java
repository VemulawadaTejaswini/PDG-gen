import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 1; i < n + 1; i++) {
            dp[i] = 1 + dp[i - 1];
            int j = 6;
            while (j <= i) {
                int tmp = 1 + dp[i - j];
                j *= 6;
                dp[i] = Math.min(dp[i], tmp);
            }
            j = 9;
            while (j <= i) {
                int tmp = 1 + dp[i - j];
                j *= 9;
                dp[i] = Math.min(dp[i], tmp);
            }
        }
        System.out.println(dp[n]);

    }
}