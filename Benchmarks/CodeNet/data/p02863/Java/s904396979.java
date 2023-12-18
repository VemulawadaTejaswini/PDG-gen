
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int t = scanner.nextInt();

        final List<Food> list = IntStream.range(0, n)
                .mapToObj(i -> new Food(scanner.nextInt(), scanner.nextInt()))
                .sorted(Comparator.comparingInt(f -> -f.deliciousness))
                .collect(Collectors.toList());

        final int[][] dp = new int[n - 1][t];
        for (final int[] array : dp) {
            Arrays.fill(array, -1);
        }
        if (list.get(1).time < t) {
            dp[0][list.get(1).time] = list.get(1).deliciousness;
        }
        dp[0][0] = 0;
        for (int i = 1; i < n - 1; i++) {
            System.arraycopy(dp[i - 1], 0, dp[i], 0, t);
            final Food food = list.get(i + 1);
            for (int j = 0; j < t - food.time; j++) {
                if (dp[i - 1][j] >= 0) {
                    dp[i][j + food.time] = Math.max(dp[i][j + food.time], dp[i - 1][j] + food.deliciousness);
                }
            }
        }

        int max = 0;
        for (final int i : dp[n - 2]) {
            max = Math.max(max, i);
        }

        System.out.println(max + list.get(0).deliciousness);
    }

    private static class Food {
        final int time;
        final int deliciousness;

        Food(final int time, final int deliciousness) {
            this.time = time;
            this.deliciousness = deliciousness;
        }
    }
}
