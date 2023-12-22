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

  void run() {
    for (; ; ) {
      int N = ni();
      int M = ni();
      if ((N | M) == 0) {
        break;
      }
      int r = ni();
      int[][] imos = new int[1261][M + 1];
      for (int i = 0; i < r; ++i) {
        int t = ni();
        int n = ni();
        int m = ni();
        int s = ni();
        imos[t][m] += 2 * s - 1;
      }
      int q = ni();
      for (int i = 0; i < q; ++i) {
        int ts = ni();
        int te = ni();
        int m = ni();
        int use = 0;
        int time = 0;
        for (int t = 0; t < te; ++t) {
          use += imos[t][m];
          if (t >= ts && use > 0) {
            ++time;
          }
        }
        System.out.println(time);
      }
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}