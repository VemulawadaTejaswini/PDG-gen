import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s = sc.next();

    String a = s.substring(0, n / 2);
    String b = s.substring(n / 2, n);

    if (a.equals(b)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
