import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] keywords = {"dream", "dreamer", "erase", "eraser"};
    List<String> queue = new ArrayList<String>();
    queue.add(s);
    while (queue.size() > 0) {
      s = queue.remove(queue.size() - 1);
      if (s.isEmpty()) {
        System.out.println("YES");
        return;
      }
      for (int i = 0; i < 4; i++) {
        String keyword = keywords[i];
        if (include(s, keyword)) queue.add(s.substring(keyword.length()));
      }
    }
    System.out.println("NO");
  }

  private static Boolean include(String t, String k) {
    for (int i = 0; i < k.length(); i++) {
      if (k.length() > t.length() || k.charAt(i) != t.charAt(i)) return false;
    }
    return true;
  }
}
