import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String s = scanner.next();
    if (possible(s)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

  private static boolean possible(String s) {
    for (int i = 0; i < s.length();) {
      if (s.substring(i).startsWith("dreamer")) {
        i += 5;
        if (!s.substring(i).startsWith("erase")) i += 2;
      } else if (s.substring(i).startsWith("dream")) {
        i += 5;
      } else if (s.substring(i).startsWith("eraser")) {
        i += 6;
      } else if (s.substring(i).startsWith("erase")) {
        i += 5;
      } else {
        return false;
      }
    }
    return true;
  }
}
