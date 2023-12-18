import java.util.*;

public class Main {
  private static String[] KEYWORDS = new String[]{
    "dream",
    "dreamer",
    "erase",
    "eraser",
  };

  private static boolean isReachable(String str) {
    boolean[] reachable = new boolean[str.length() + 1];
    reachable[str.length()] = true;
    for (int i = str.length() - 1; i >= 0; i--) {
      for (String keyword : KEYWORDS) {
        if (i + keyword.length() <= str.length() &&
            reachable[i + keyword.length()] &&
            str.substring(i).startsWith(keyword)) {
          reachable[i] = true;
          break;
        }
      }
    }
    return reachable[0];
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.next();
    System.out.println(isReachable(str) ? "YES" : "NO");
  }
}
