import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
      int n, r;
      n = ni();
      r = ni();
      if (n == 0) {
        break;
      }
      ArrayList<Integer> list = new ArrayList<>();
      for (int i = 0; i < n; ++i) {
        list.add(n - i);
      }
      for (int i = 0; i < r; ++i) {
        int p, c;
        p = ni();
        c = ni();
        ArrayList<Integer> sub = new ArrayList<>();
        Iterator<Integer> ite = list.listIterator(p - 1);
        for (int j = 0; j < c; ++j) {
          int val = ite.next();
          sub.add(val);
          ite.remove();
        }
        list.addAll(0, sub);
      }

      System.out.println(list.get(0));
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}