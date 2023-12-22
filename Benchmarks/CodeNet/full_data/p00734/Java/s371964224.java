import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    while (true) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      if ((n | m) == 0) {
        break;
      }

      int[] ta = new int[n];
      int[] ha = new int[m];

      int ts = 0;
      for (int i = 0; i < n; ++i) {
        ta[i] = sc.nextInt();
        ts += ta[i];
      }
      int hs = 0;
      for (int i = 0; i < m; ++i) {
        ha[i] = sc.nextInt();
        hs += ha[i];
      }

      boolean flag = false;
      for (int t = 0; t < n; ++t) {
        for (int h = 0; h < m; ++h) {
          if (!flag) {
            if (ts - ta[t] + ha[h] == hs + ta[t] - ha[h]) {
              flag = true;
              System.out.println(ta[t] + " " + ha[h]);
            }
          }
        }
      }

      if (!flag) {
        System.out.println(-1);
      }
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}