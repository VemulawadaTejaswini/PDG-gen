import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if ((c == 'L' && i % 2 == 0) || (c == 'R' && i % 2 == 1)) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}
