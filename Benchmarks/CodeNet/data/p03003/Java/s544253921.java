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
    // long[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), M = scanner.nextInt();
        scanner.nextLine();
        int[] S = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] T = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long[][] dp = new long[N + 1][M + 1];
        long[][] sum = new long[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (S[i - 1] == T[j - 1]) {
                    dp[i][j] = sum[i - 1][j - 1] + 1;
                }
                sum[i][j] =
                        (sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1] + dp[i][j]) % MOD;
            }
        }

        long ans = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                ans = (ans + dp[i][j]) % MOD;
            }
        }

        System.out.println(ans);
    }

}
