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
        }

        dp[1] = Math.abs(h[0] - h[1]);
        for(int i = 2; i < N; i++) {
            dp[i] = Math.min(Math.abs(h[i] - h[i-1]) + dp[i-1], Math.abs(h[i] - h[i-2]) + dp[i-2]);
        }
        System.out.println(dp[N-1]);
    }
}
