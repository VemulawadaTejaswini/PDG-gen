import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long a = sc.nextInt();
    long b = sc.nextInt();
    long c = sc.nextInt();
    long d = sc.nextInt();

    if (a >= 0 && b >= 0 && c >= 0 && d >= 0) {
      System.out.println(b * d);
      return;
    }
    
    if ((b < 0 && d < 0) || (b >= 0 && d >= 0)) {
      System.out.println(b * d);
      return;
    }
    
    if (a >= 0 && b >= 0 && c < 0 && d < 0) {
      System.out.println(b * Math.max(c, d));
      return;
    }

    if (a < 0 && b < 0 && c >= 0 && d >= 0) {
      System.out.println(d * Math.max(a, b));
      return;
    }
  }
}