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
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    boolean[] blocked = new boolean[n + 1];

    String s = sc.next();
    for (int i = 0; i < n; i++){
      if (s.charAt(i) == '#') blocked[i + 1] = true;
    }
    boolean check = move(a, c, blocked) && move(b, d, blocked);
    if (a < b && b < d && d < c) {
      // special case. A might be blocked by B
      check = check && canJumpOver(b, d, blocked);
    }
    if (check) {
      os.println("Yes");
    } else {
      os.println("No");
    }
  }

  private static boolean canJumpOver(int from, int to, boolean[] blocked) {
    for (int i = Math.max(1, from - 1); i < Math.min(to, blocked.length - 1) - 1; i++) {
      if (!blocked[i] && !blocked[i + 1] && !blocked[i + 2]) return true;
    }
    return false;
  }

  private static boolean move(int from, int to, boolean[] blocked) {

    boolean[] reachable = new boolean[to + 1];
    reachable[from] = true;

    for (int i = from; i < to; i++) {
      if (reachable[i]) {
        if (i + 1 <= to && !blocked[i + 1]) {
          reachable[i + 1] = true;
        }
        if (i + 2 <= to && !blocked[i + 2]) {
          reachable[i + 2] = true;
        }
      }
    }
    return reachable[to];

//    boolean[] reachable = new boolean[to - from + 1];
//
//    reachable[0] = true;
//    for (int i = 0; i < to - from + 1; i++) {
//      if (reachable[i]) {
//        if (from + i + 1 < to - from + 1 && !blocked[from + i + 1]) {
//          reachable[i + 1] = true;
//        }
//        if (from + i + 2 < to - from + 1 && !blocked[from + i + 2]) {
//          reachable[i + 2] = true;
//        }
//      }
//    }
//    return reachable[to - from];
  }
}