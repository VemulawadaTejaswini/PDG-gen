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
    String s = sc.next();

    String[] words = {"dream", "dreamer", "erase", "eraser"};

    if (dfs(s, words)) {
      os.println("YES");
    } else {
      os.println("NO");
    }
  }

  private static boolean dfs(String s, String[] words) {
    if (s.isEmpty()) return true;
    boolean res = false;
    for (String w : words) {
      if (s.startsWith(w)) {
        res |= dfs(s.substring(w.length()), words);
      }
    }
    return res;
 }
}
