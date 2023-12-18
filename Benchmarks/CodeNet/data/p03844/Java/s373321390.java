import java.util.Scanner;

public class Abc050A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String o = sc.next();
    int b = sc.nextInt();

    if (o.equals("+")) {
      System.out.println(a + b);
    } else {
      System.out.println(a - b);
    }
  }
}
