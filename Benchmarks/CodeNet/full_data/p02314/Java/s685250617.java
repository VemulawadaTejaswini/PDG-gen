import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static final int INF = Integer.MAX_VALUE / 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] c = new int[M];
        for (int i = 0; i < M; i++) {
            c[i] = scanner.nextInt();
        }
        int[] dp = new int[N + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < M; j++) {
                if (c[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - c[j]] + 1);
                }
            }
        }
        System.out.println(dp[N]);
    }
}
