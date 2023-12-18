import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] keywords = {"dream", "dreamer", "erase", "eraser"};
    Queue<String> queue = new ArrayDeque<String>();
    queue.add(s);
    while (!queue.isEmpty()) {
      s = queue.poll();
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
