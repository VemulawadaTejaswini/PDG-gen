import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    int n = ni();
    int k = ni();
    int x = ni();
    int y = ni();
    int d2 = Math.max(0, n - k);
    int d1 = n - d2;
    debug(d1, d2);
    System.out.println(d1 * x + d2 * y);
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}