import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int[] dp = new int[n + 10];
            dp[0] = 1;
            for (int i = 0; i < n + 1; i++) {
                dp[i + 1] += dp[i];
                dp[i + 2] += dp[i];
                dp[i + 3] += dp[i];
            }
            dp[n] /= 10;
            System.out.println(dp[n] / 365 + 1);
        }
    }

}