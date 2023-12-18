import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] h = new int[N];
        int[] dp = new int[N];
        for(int i = 0; i < N; i++) {
            h[i] = scanner.nextInt();
            dp[i] = Integer.MAX_VALUE;
        }

//        // もらうDP
//        dp[1] = Math.abs(h[0] - h[1]);
//        for(int i = 2; i < N; i++) {
//            dp[i] = Math.min(Math.abs(h[i] - h[i-1]) + dp[i-1], Math.abs(h[i] - h[i-2]) + dp[i-2]);
//        }
        // 配るDP
        dp[0] = 0;
        for(int i = 0; i < N-2; i++) {
            dp[i+1] = Math.min(Math.abs(h[i] - h[i+1]) + dp[i], dp[i+1]);
            dp[i+2] = Math.min(Math.abs(h[i] - h[i+2]) + dp[i], dp[i+2]);
        }
        dp[N-1] = Math.min(Math.abs(h[N-2] - h[N-1]) + dp[N-2], dp[N-1]);

        System.out.println(dp[N-1]);
    }
}
