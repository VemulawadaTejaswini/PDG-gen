import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long T1 = scanner.nextLong();
    long T2 = scanner.nextLong();
    long A1 = scanner.nextLong();
    long A2 = scanner.nextLong();
    long B1 = scanner.nextLong();
    long B2 = scanner.nextLong();
    long c1 = A1 * T1 - B1 * T1;
    long c2 = A2 * T2 - B2 * T2;
    if (c1 + c2 == 0) {
      System.out.println("infinity");
      return;
    }
    if ((c1 > 0 && c1 + c2 > 0) || (c1 < 0 && c1 + c2 < 0)) {
      System.out.println(0);
      return;
    }
    long d1 = Math.abs(c1);
    long d2 = Math.abs(c1 + c2);
    long r = d1 / d2 * 2 + 1;
    if (d1 % d2 == 0) r--;
    System.out.println(r);
  }
}
