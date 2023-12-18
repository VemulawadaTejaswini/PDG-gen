import java.util.*;

public class Main {
  private static int EVENTS = 3;

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[][] days = new int[EVENTS][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < EVENTS; j++) {
        days[j][i] = scan.nextInt();
      }
    }
    scan.close();

    System.out.println(maxHappy(days, n));
  }

  private static int maxHappy(int[][] days, int n) {
    if (n == 0)
      return 0;

    int[][] dp = new int[EVENTS][n];
    for (int i = 0; i < EVENTS; i++) {
      dp[i][0] = days[i][0];
    }
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < EVENTS; j++) {
        int currentDayValue = days[j][i];
        for (int k = 0; k < EVENTS; k++) {
          if (k == j) continue;
          int previousDayOfAnotherType = dp[k][i - 1];
          dp[j][i] = Math.max(dp[j][i], currentDayValue + previousDayOfAnotherType);
        }
      }
    }

    int max = 0;
    int last = n - 1;
    for (int i = 0; i < EVENTS; i++)
      max = Math.max(max, dp[i][last]);
    return max;
  }
}
