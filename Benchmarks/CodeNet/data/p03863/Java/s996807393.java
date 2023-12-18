import java.io.*;
import java.util.*;

public class Main {
  private static boolean debug = false;
  private static boolean elapsed = false;

  private static PrintWriter _err = new PrintWriter(System.err);

  private int minLen = Integer.MAX_VALUE;
  private boolean isFirst = false;
  private void solve(Scanner sc, PrintWriter out) {
    String s = sc.nextLine();

    List<Character> list = new ArrayList<>(s.length());
    for (int i = 0; i < s.length(); ++i) {
      list.add(s.charAt(i));
    }

    search(false, list);

    out.println(isFirst ? "First" : "Second");
  }
  private void search(boolean first, List<Character> list) {
    boolean found = false;
    for (int i = 1; i < list.size() - 1; ++i) {
      if (list.get(i - 1) == list.get(i + 1)) {
        continue;
      }
      Character ch = list.remove(i);
      search(!first, list);
      list.add(i, ch);
      found = true;
    }
    if (!found) {
      if (minLen > list.size()) {
        minLen = list.size();
        isFirst = first;
      }
    }
  }
  private long P(long n, long r) {
    long res = 1;
    for (long i = n; i > n - r; --i) {
      res *= i;
    }
    return res;
  }
  /*
   * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
   * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
   */
  public static void main(String[] args) {
    long S = System.currentTimeMillis();

    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(sc, out);
    out.flush();

    long G = System.currentTimeMillis();
    if (elapsed) {
      _err.println((G - S) + "ms");
    }
    _err.flush();
  }
}