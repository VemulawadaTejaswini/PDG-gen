import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] height = new int[N];
    int[] beauty = new int[N];
    for (int i = 0; i < N; ++i) {
      height[i] = sc.nextInt();
    }
    for (int i = 0; i < N; ++i) {
      beauty[i] = sc.nextInt();
    }

    long maxBeauty = solve(height, beauty);
    System.out.println(maxBeauty);
  }

  private static long solve(int[] height, int[] beauty) {
    int base = 1;
    int n = height.length;
    while (base <= n) {
      base *= 2;
    }
    long[] tree = new long[2 * base];
    long[] dp = new long[n + 1];
    for (int flower = 0; flower < n; ++flower) {
      int x = height[flower] + base;
      long best = 0;
      while (x > 1) {
        if (x % 2 == 1) {
          best = Math.max(best, tree[x - 1]);
        }
        x /= 2;
      }
      dp[height[flower]] = best + beauty[flower];
      for (int i = base + height[flower]; i >= 1; i /= 2) {
        tree[i] = Math.max(tree[i], dp[height[flower]]);
      }
    }

    long answer = Integer.MIN_VALUE;
    for (int i = 0; i <= n; i++) {
      answer = Math.max(answer, dp[i]);
    }
    return answer;
  }
}
