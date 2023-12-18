import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] stones = new int[N];
        for(int i = 0; i < N; i++) stones[i] = scanner.nextInt();

        int[] dp = new int[N];
        for(int i = 1; i < N; i++) {
            dp[i] = dp[i - 1] + Math.abs(stones[i] - stones[i - 1]);
            for(int j = Math.max(0, i - K); j < i - 1; j++) {
                dp[i] = Math.min(Math.abs(stones[i] - stones[j]) + dp[j], dp[i]);
            }
        }
        System.out.println(dp[N - 1]);
    }
}