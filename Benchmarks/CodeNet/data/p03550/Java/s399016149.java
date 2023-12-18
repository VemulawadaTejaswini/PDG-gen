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
    System.out.println(solve(0, 1, 0));
  }

  static int[] a;
  static Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
  final static int MAX_N = 2000;

  static int triple(int z, int w, int player) {
    return player + ((MAX_N * z + w) << 1);
  }

  /** それぞれ z 枚目, w 枚目を持っている局面での最適解 */
  static int solve(int z, int w, int player) {
    int n = Math.max(z, w) + 1;  // 取り終わっている枚数
    if (n == a.length) return Math.abs(a[z] - a[w]);
    int triple = triple(z, w, player);
    if (memo.containsKey(triple)) return memo.get(triple);

    int m = player == 0 ? 0 : Integer.MAX_VALUE;
    for (int i = n; i < a.length; i++) {
      int zz, ww;
      if (player == 0) { zz = i; ww = w; }
      else             { ww = i; zz = z; }
      int mx = solve(zz, ww, 1 - player);
      m = player == 0 ? Math.max(m, mx) : Math.min(m, mx);
    }
    memo.put(triple, m);
    return m;
  }
}
