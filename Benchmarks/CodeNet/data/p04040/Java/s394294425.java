import java.util.*;


public class Main {
  static int H, W, A, B;
  static int[][] dp;
  static int previous, current;

  public static boolean isAllowed(int y, int x) {
    return (0 <= y && y < H && 0 <= x && x < W) && !(H - A <= y && x < B);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    H = sc.nextInt();
    W = sc.nextInt();
    A = sc.nextInt();
    B = sc.nextInt();

    dp = new int[2][W];
    previous = 0;
    current = 1;

    dp[current][0] = 1;

    for(int i = 0; i < H; i++) {
      for(int j = 0; j < W; j++) {
        if(isAllowed(i, j)) {
          dp[current][j] += (isAllowed(i - 1, j) ? dp[previous][j] : 0) + (isAllowed(i, j - 1) ? dp[current][j - 1] : 0);
          dp[current][j] %= 1000000007;
        }
      }
      previous = 1 - previous;
      current = 1 - current;
    }

    System.out.println(dp[previous][W - 1]);
  }
}
