import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
            int pow = 1;
            while (pow <= i) {
                dp[i] = Math.min(dp[i], dp[i - pow] +1);
                pow *= 6;
            }
            pow = 1;
            while (pow <= i) {
                dp[i] = Math.min(dp[i], dp[i - pow] +1);
                pow *= 9;
            }
        }
        System.out.println(dp[n]);
    }
}