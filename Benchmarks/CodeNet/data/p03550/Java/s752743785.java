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
    System.out.println(maxPlayer(0, 1));
  }

  static int[] a;
  static Map<Integer, Integer> memo = new TreeMap<Integer, Integer>();
  final static int MAX_N = 2048;

  static int pair(int z, int w) { return MAX_N * z + w; }

  /** それぞれ z 枚目, w 枚目を持っている局面での最適解 */
  static int maxPlayer(int z, int w) {
    int n = Math.max(z, w) + 1;  // 取り終わっている枚数
    if (n == a.length) return Math.abs(a[z] - a[w]);
    int pair = pair(z, w);
    if (memo.containsKey(pair)) return memo.get(pair);

    int m = 0;
    for (int i = n; i < a.length; i++) {
      m = Math.max(m, minPlayer(i, w));
    }
    memo.put(pair, m);
    return m;
  }

  static int minPlayer(int z, int w) {
    int n = Math.max(z, w) + 1;  // 取り終わっている枚数
    if (n == a.length) return Math.abs(a[z] - a[w]);
    int pair = pair(z, w);
    if (memo.containsKey(pair)) return memo.get(pair);

    int m = Integer.MAX_VALUE;
    for (int i = n; i < a.length; i++) {
      m = Math.min(m, maxPlayer(z, i));
    }
    memo.put(pair, m);
    return m;
  }
}
