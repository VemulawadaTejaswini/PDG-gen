import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();

    if (s.length() != (t.length() - 1)) {
      System.out.println("No");
      return;
    }
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != t.charAt(i)) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}