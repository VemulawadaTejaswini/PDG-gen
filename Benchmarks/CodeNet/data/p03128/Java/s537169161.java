import java.math.BigDecimal;
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
        int N = scanner.nextInt(), M = scanner.nextInt();
        scanner.nextLine();
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] available = new int[10];
        for (int i: n) {
            int use = 5;
            if (i == 1) {
                use = 2;
            }
            if (i == 4) {
                use = 4;
            }
            if (i == 6 || i == 9) {
                use = 6;
            }
            if (i == 7) {
                use = 3;
            }
            if (i == 8) {
                use = 7;
            }
            available[use] = Math.max(available[use], i);
        }

        BigDecimal[] dp = new BigDecimal[N + 1];
        Arrays.fill(dp, BigDecimal.valueOf(-1));
        dp[0] = BigDecimal.ZERO;
        for (int i = 1; i < N + 1; i++) {
            for (int j = 0; j < 10; j++) {
                if (available[j] > 0 && i >= j && dp[i - j].compareTo(BigDecimal.ZERO) >= 0) {
                    BigDecimal prev =  dp[i - j].multiply(BigDecimal.valueOf(10)).add(BigDecimal.valueOf(available[j]));
                    if (dp[i].compareTo(prev) < 0) {
                        dp[i] = prev;
                    }
                }
            }
        }
        System.out.println(dp[N]);
    }

}
