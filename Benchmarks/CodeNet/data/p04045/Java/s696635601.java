import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  boolean[] list = new boolean[10];

  int n;

  int dfs(String str) {
    int d = Integer.parseInt(str);
    if (d >= n) {
      return d;
    }
    if (str.length() > 6) {
      return 1 << 28;
    }
    int min = 1 << 28;
    for (int i = 0; i < 10; ++i) {
      if (list[i]) continue;
      min = Math.min(min, dfs(str + i));
    }
    return min;
  }

  void run() {
    n = ni();
    int k = ni();
    for (int i = 0; i < k; ++i) {
      int d = ni();
      list[d] = true;
    }
    System.out.println(dfs("0"));
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}