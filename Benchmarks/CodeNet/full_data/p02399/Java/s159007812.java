import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
  private static int a, b;
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    a = stdIn.nextInt();
    b = stdIn.nextInt();

    System.out.println(a / b + " " + a % b + " " + BigDecimal.valueOf((float)a/(float)b));
  }
}