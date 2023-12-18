import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int frog1(int N, int K, int[] h) {
        // subproblem:
        // f(j) = cost when standing on stone j (0 <= j < N)
        // f(N-1)

        // f(0) = 0
        // f(j) = min:
        //        f(j-1) + abs(h[j], h[j-1])
        //        f(j-2) + abs(h[j], h[j-2])
        //        ...
        //        f(j-K) + abs(h[j], h[j-K])

        int[] dp = new int[N];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int j = 1; j < N; j++) {
            for (int i = Math.max(0, j-K); i < j; i++) {
                dp[j] = Math.min(dp[j], dp[i] + Math.abs(h[j] - h[i]));
            }
        }
        return dp[N-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = scanner.nextInt();
        }
        int res = frog1(N, K, h);
        System.out.println(res);
    }
}
