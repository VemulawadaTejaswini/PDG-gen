import java.util.*;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int n = scanner.nextInt();
      int x = scanner.nextInt();
      int[] m = IntStream.range(0, n).map(i -> scanner.nextInt()).sorted().toArray();

      int ans = solve(n, x, m);
      System.out.println(ans);
    } finally {
      scanner.close();
    }
  }

  private static int solve(int n, int x, int[] m) {
    // 少なくとも1つ作らなくてはならないので、各1個づつの量を合計して引く
    // 個数はn個
    int sum = Arrays.stream(m).sum();
    int ans = n;
    x -= sum;

    // あらかじめ昇順にソートしてあるので、m[0]が一番少ない材料のお菓子
    // これを作れるだけ作るのが最大値
    int mini = m[0];
    ans += x / mini;

    return ans;
  }
}
