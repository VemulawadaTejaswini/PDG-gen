import java.util.*;

public class Main {
  public static void main(String[] arg) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int Z = scanner.nextInt();
    int W = scanner.nextInt();
    a = new int[N + 2];
    a[0] = Z;
    a[1] = W;
    for (int i = 0; i < N; i++) {
      a[2 + i] = scanner.nextInt();
    }
    System.out.println(maxPlayer(0, 1, Integer.MAX_VALUE));
  }

  final static int MAX_N = 2048;

  static int[] a;
  static Integer[][] memo = new Integer[MAX_N][MAX_N];

  /**
   * それぞれ z 枚目, w 枚目を持っている局面での最適解。
   * beta以上が確定したらやめる。
   */
  static int maxPlayer(int z, int w, int beta) {
    int n = w + 1;  // 取り終わっている枚数
    if (n == a.length) return Math.abs(a[z] - a[w]);
    if (memo[z][w] != null) return memo[z][w];

    int m = 0;
    for (int i = n; i < a.length; i++) {
      m = Math.max(m, minPlayer(i, w, m));
      if (m >= beta) return m;
    }
    memo[z][w] = m;
    return m;
  }

  /** alpha以下が確定したらやめる */
  static int minPlayer(int z, int w, int alpha) {
    int n = z + 1;  // 取り終わっている枚数
    if (n == a.length) return Math.abs(a[z] - a[w]);
    if (memo[z][w] != null) return memo[z][w];

    int m = Integer.MAX_VALUE;
    for (int i = n; i < a.length; i++) {
      m = Math.min(m, maxPlayer(z, i, m));
      if (m <= alpha) return m;
    }
    memo[z][w] = m;
    return m;
  }
}
