import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */

    int n = sc.nextInt();
    int[] a = new int[n];
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      queue.add(a[i]);
    }

    List<Integer> used = new ArrayList<>(n);
    int first = queue.remove();
    used.add(first);
    int second = queue.remove();
    used.add(second);

    while(!queue.isEmpty()) {
      int next = queue.remove();
      boolean ok = false;
      int i = 0;
      while (i < used.size() && !ok) {
        if (next == xor(used.get(i), used.get((i + 1) % used.size()))) {
          ok = true;
        }
        i++;
      }
      if (ok) {
        used.add(i + 1, next);
      } else {
        os.println("No");
        return;
      }
    }
    os.println("Yes");
  }

  private static int xor(int a, int b) {
    int res = 0;

    for (int i = 0; i < 32; i++) {
      int mask = 1 << i;
      res += (mask & a) ^ (mask & b);
    }
    return res;
  }
}