import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    for (int i = 0; i < s.length(); i++) {
      if ((i % 2) == 0) {// odd
        if (s.charAt(i) == 'L') {
          System.out.println("No");
          return;
        }
      } else {
        if (s.charAt(i) == 'R') {
          System.out.println("No");
          return;
        }
      }
    }

    System.out.println("Yes");

  }
}