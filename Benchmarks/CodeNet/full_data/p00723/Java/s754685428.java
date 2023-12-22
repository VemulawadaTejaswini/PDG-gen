import java.util.Arrays;
import java.util.HashSet;
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

  String retro(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = str.length() - 1; 0 <= i; --i) {
      sb.append(str.charAt(i));
    }
    return sb.toString();
  }

  void run() {
    int n = ni();
    for (int i = 0; i < n; ++i) {
      String str = sc.next();
      HashSet<String> set = new HashSet<>();
      set.add(str);
      for (int l = 1; l <= str.length() - 1; ++l) {
        String left = str.substring(0, l);
        String right = str.substring(l, str.length());
        set.add(left + retro(right));
        set.add(retro(left) + retro(right));
        set.add(retro(left) + right);

        set.add(right + left);
        set.add(retro(right) + left);
        set.add(retro(right) + retro(left));
        set.add(right + retro(left));
      }
      System.out.println(set.size());
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}