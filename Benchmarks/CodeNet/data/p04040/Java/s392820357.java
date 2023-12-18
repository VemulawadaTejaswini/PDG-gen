import java.util.*;


public class Main {
  static int H, W, A, B;
  static int[][] dp;

  public static boolean isAllowed(int y, int x) {
    return (0 <= y && y < H && 0 <= x && x < W) && !(H - A <= y && x < B);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    H = sc.nextInt();
    W = sc.nextInt();
    A = sc.nextInt();
    B = sc.nextInt();

    dp = new int[H][W];
    dp[0][0] = 1;
    for(int i = 0; i < H; i++) {
      for(int j = 0; j < W; j++) {
        if(isAllowed(i, j)) {
          dp[i][j] += (isAllowed(i - 1, j) ? dp[i - 1][j] : 0) + (isAllowed(i, j - 1) ? dp[i][j - 1] : 0);
          dp[i][j] %= 10^9 + 7;
        }
      }
    }

    System.out.println(dp[H - 1][W - 1]);
  }
}
