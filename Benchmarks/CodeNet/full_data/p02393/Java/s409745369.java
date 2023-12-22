import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String aa = scan.next();
    String bb = scan.next();
    String cc = scan.next();
    int a = Integer.parseInt(aa);
    int b = Integer.parseInt(bb);
    int c = Integer.parseInt(cc);
    if (a < b && b < c) {
      System.out.println(a + " " + b + " " + c);
    } else if (a < c && c < b) {
      System.out.println(a + " " + c + " " + b);
    } else if (c < b && b < a) {
      System.out.println(c + " " + b + " " + a);
    } else if (c < a && a < b) {
      System.out.println(c + " " + a + " " + b);
    } else if (b < a && a < c) {
      System.out.println(b + " " + a + " " + c);
    } else {
      System.out.println(b + " " + c + " " + a);
    }
  }
}