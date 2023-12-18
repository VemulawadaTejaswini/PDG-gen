import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] h = new int[N];
        int[] dp = new int[N];

        for(int i = 0 ; i < N; i++) {
            h[i] = scanner.nextInt();
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;
        for(int i = 1; i < N; i++) {
            for(int j = 1; j <= K; j++) {
                if(i-j >= 0) dp[i] = Math.min(dp[i], Math.abs(h[i] - h[i-j]) + dp[i-j]);
            }
        }
        System.out.println(dp[N-1]);
    }
}