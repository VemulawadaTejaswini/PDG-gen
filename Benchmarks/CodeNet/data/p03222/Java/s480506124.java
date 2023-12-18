import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }


    // int N = Integer.parseInt(scanner.nextLine());
    // int N = scanner.nextInt(), M = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int H = n[0] - 1, W = n[1] - 1, K = n[2] - 1;
        if (W == 0) {
            System.out.println(1);
            return;
        }

        long[][] dp = new long[H + 2][W + 1];
        dp[0][0] = 1;
        for (int i = 1; i < H + 2; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (j > 0)
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % 1_000_000_007;
                if (j < W)
                    dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % 1_000_000_007;
                int other = (j == 0 || j == W) ? W : W - 1;
                dp[i][j] = (dp[i][j] + ((dp[i - 1][j] * other) % 1_000_000_007)) % 1_000_000_007;
            }
        }

        System.out.println(dp[H + 1][K]);
    }

}
