import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char[] c = new char[n];

    for (int i = 0; i < n; i++) {
      c[i] = sc.next().charAt(0);
    }

    LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();

    for (int i = 0; i < n; i++) {
      lhs.add(c[i]);
    }

    Object[] newc = lhs.toArray();

    if (newc.length == 3) {
      System.out.println("Three");
    } else {
      System.out.println("Four");
    }

  }
}