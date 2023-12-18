import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int T = scanner.nextInt();
    Meal[] meals = new Meal[N + 1];
    meals[0] = new Meal(0, 0);
    for (int i = 1; i <= N; i++) meals[i] = new Meal(scanner.nextInt(), scanner.nextInt());
    Arrays.sort(meals, Comparator.comparingInt(m -> m.a));

    int[][] dp = new int[N + 1][T];
    for (int i = 1; i <= N; i++) {
      for (int j = 0; j < T; j++) {
        dp[i][j] = dp[i - 1][j];
        if (j >= meals[i].a) dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - meals[i].a] + meals[i].b);
      }
    }

    int max = 0;
    for (int i = 1; i <= N; i++) {
      max = Math.max(max, dp[i - 1][T - 1] + meals[i].b);
    }
    System.out.println(max);
  }

  private static class Meal {
    private final int a;
    private final int b;

    private Meal(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }
}
