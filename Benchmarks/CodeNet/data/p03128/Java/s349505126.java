import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int[] num = {-1, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] a = IntStream.range(0, m).mapToObj(i -> scanner.nextInt()).sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 1, n + 1, -1);
        IntStream.rangeClosed(1, n)
                .forEach(i -> Arrays.stream(a)
                        .filter(j -> i >= num[j])
                        .forEach(j -> dp[i] = Math.max(dp[i], dp[i - num[j]] + 1)));
        while (n > 0) {
            for (int j : a) {
                if (n >= num[j] && dp[n - num[j]] == dp[n] - 1) {
                    System.out.print(j);
                    n -= num[j];
                    break;
                }
            }
        }

        System.out.println();
    }
}