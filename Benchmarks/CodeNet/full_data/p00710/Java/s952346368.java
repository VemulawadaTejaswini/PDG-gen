import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    while (true) {
      int n = ni();
      int r = ni();
      if ((n | r) == 0)
        break;

      LinkedList<Integer> list = new LinkedList<Integer>();
      for (int i = 0; i < n; ++i) {
        list.add(n - i);
      }

      for (int i = 0; i < r; ++i) {
        int p = ni();
        int c = ni();

        ListIterator<Integer> ite = list.listIterator(p - 1);
        LinkedList<Integer> dup = new LinkedList<Integer>();
        for (int j = 0; j < c; ++j) {
          int e = ite.next();
          dup.add(e);
          ite.previous();
          ite.remove();
        }

        list.addAll(0, dup);
      }

      System.out.println(list.getFirst());
    }
  }

  int ni() {
    return sc.nextInt();
  }

  Main() {
    sc = new Scanner(System.in);
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}