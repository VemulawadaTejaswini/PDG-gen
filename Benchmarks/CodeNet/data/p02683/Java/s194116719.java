import java.util.*;

public class Main {
  static int N, M, X;
  static int ans;
  static int[] prices;
  static int[][] books;

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    N = in.nextInt();
    M = in.nextInt();
    X = in.nextInt();
    ans = -1;

    prices = new int[N];
    books = new int[N][M];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        prices[i] = in.nextInt();
        books[i][j] = in.nextInt();
      }
    }

    boolean[] use = new boolean[N];
    sol(use, 0);
    System.out.println(ans);
  }

  public static void sol(boolean[] use, int index) {
    if (index == N) {
      // Compute the understanding score.
      int[] understandings = new int[M];
      int p = 0;

      for (int i = 0; i < N; i++) {
        if (use[i]) {
          p += prices[i];
          for (int j = 0; j < M; j++) {
            understandings[j] = books[i][j];
          }
        }
      }

      for (int i = 0; i < M; i++) {
        if (understandings[i] < X) {
          return;
        }
      }

      if (ans == -1) {
        ans = p;
      } else {
        ans = Math.min(ans, p);
      }

      return;
    } else {
      sol(use, index + 1);
      use[index] = true;
      sol(use, index + 1);
    }
  }
}
