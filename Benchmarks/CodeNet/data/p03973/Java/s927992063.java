import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    int n = ni();
    int[] a = new int[n];
    for (int i = 0; i < n; ++i) {
      a[i] = ni();
    }
    int max = 1;
    int cnt = a[0] - 1;
    for (int i = 1; i < n; ++i) {
      if (a[i] == max + 1) {
        ++max;
        continue;
      }
      int v = (a[i] - 1) / (max + 1);
      max = Math.max(max, 1);
      cnt += v;
    }
    System.out.println(cnt);
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}