import java.util.Arrays;
import java.util.Scanner;

public class Main {

  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  static int[] list;
  static int[] dpa;
  static int[] dpb;

  static {
    list = new int[1000];
    for (int i = 0; i < 1000; ++i) {
      list[i] = ((i + 1) * (i + 2) * (i + 3)) / 6;
    }
    dpa = new int[1000000];
    Arrays.fill(dpa, 1 << 28);
    dpa[0] = 0;
    for (int i = 0; i < 1000; ++i) {
      for (int j = 0; j < 1000000; ++j) {
        if (j + list[i] >= 1000000) {
          break;
        }
        dpa[j + list[i]] = Math.min(dpa[j + list[i]], dpa[j] + 1);
      }
    }

    dpb = new int[1000000];
    Arrays.fill(dpb, 1 << 28);
    dpb[0] = 0;
    for (int i = 0; i < 1000; ++i) {
      if (list[i] % 2 != 1) {
        continue;
      }
      for (int j = 0; j < 1000000; ++j) {
        if (j + list[i] >= 1000000) {
          break;
        }
        dpb[j + list[i]] = Math.min(dpb[j + list[i]], dpb[j] + 1);
      }
    }
  }

  void run() {
    for (; ; ) {
      int n = ni();
      if (n == 0) {
        break;
      }

      System.out.println(dpa[n] + " " + dpb[n]);
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}