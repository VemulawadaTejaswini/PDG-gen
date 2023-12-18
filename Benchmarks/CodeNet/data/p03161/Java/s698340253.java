import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int[] h = new int[N];
        int[] dp = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = s.nextInt();
            dp[i] = 10_000;
        }

        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            for (int k = i + 1; k <= i + K; k++) {
                if (k < N) {
                    dp[k] = Math.min(dp[k], dp[i] + Math.abs(h[i] - h[k]));
                }
            }
        }
        System.out.println(dp[N - 1]);
    }
}
