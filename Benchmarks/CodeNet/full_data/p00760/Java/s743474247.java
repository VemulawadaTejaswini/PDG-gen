import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  int f(int y, int m, int d) {
    return (y - 1) * (19 * 5 + 20 * 5) + ((y - 1) / 3) * (1 * 5) + (m - 1) * 20 - (y % 3 != 0 ? (m - 1) / 2 : 0) + d;
  }

  void run() {
    int n = ni();
    for ( int i = 0; i < n; ++i ) {
      int y = ni();
      int m = ni();
      int d = ni();

      System.out.println(f(1000, 1, 1) - f(y, m, d));
    }
  }

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}