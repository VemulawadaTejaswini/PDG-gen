import java.util.Arrays;
import java.util.Scanner;

class B {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int K = sc.nextInt();
        final int[] h = new int[N];
        for (int i = 0; i < N; i++)
            h[i] = sc.nextInt();
        final int[] dp = new int[N];
        Arrays.setAll(dp, i -> i > 0 ? Integer.MAX_VALUE : 0);
        for (int i = 0; i < N; i++)
            for (int j = 1; j <= K && i + j < N; j++)
                dp[i + j] = Math.min(dp[i + j], dp[i] + Math.abs(h[i + j] - h[i]));
        System.out.println(dp[N - 1]);
    }
}
public class Main {
    public static void main(String... args) {
        B.main();
    }
}
