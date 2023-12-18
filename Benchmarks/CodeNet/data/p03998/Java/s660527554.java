import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sa = sc.next();
    String sb = sc.next();
    String sh = sc.next();

    System.out.println(solve('a', sa, sb, sh));
  }

  static String solve(char next, String a, String b, String c) {
    if (next == 'a' && a.isEmpty()) {
      return "A";
    } else if (next == 'b' && b.isEmpty()) {
      return "B";
    } else if (next == 'c' && c.isEmpty()) {
      return "C";
    } else {
      if (next == 'a') {
        return solve(a.charAt(0), a.substring(1), b, c);
      } else if (next == 'b') {
        return solve(b.charAt(0), a, b.substring(1), c);
      } else if (next == 'c') {
        return solve(c.charAt(0), a, b, c.substring(1));
      } else {
        return "0";
      }
    }
  }
}
