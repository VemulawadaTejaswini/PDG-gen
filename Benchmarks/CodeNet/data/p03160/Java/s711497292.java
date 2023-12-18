import java.util.Scanner;

public class Main {
    int[] h;
    int[] dp;
    int N;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        h = new int[N];
        dp = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = scanner.nextInt();
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        dp[1] = Math.abs(h[0] - h[1]);

        for(int i = 2; i < N; i++) {
            dp[i] = Math.min(Math.abs(h[i] - h[i-1]) + dp[i-1], Math.abs(h[i] - h[i-2]) + dp[i-2]);
        }

        int ans = dp[N-1];
        System.out.println(ans);
    }
}