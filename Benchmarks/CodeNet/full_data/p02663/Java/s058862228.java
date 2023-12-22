import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

// Solution
public class Main {
  static Scanner in;
  static PrintWriter out;
  static String INPUT = "";

  static void solve() {
    int h1 = ni();
    int m1 = ni();
    int h2 = ni();
    int m2 = ni();
    int k = ni();

    System.out.println((h2 * 60 + m2) - (h1 * 60 + m1) - k);
  }

  public static void main(String[] args) throws Exception {
    long S = System.currentTimeMillis();
    in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
    out = new PrintWriter(System.out);

    solve();
    out.flush();
    long G = System.currentTimeMillis();
    tr(G - S + "ms");
  }

  static int ni() {
    return Integer.parseInt(in.next());
  }

  static void tr(Object... o) {
    if (!INPUT.isEmpty()) System.out.println(Arrays.deepToString(o));
  }
}
