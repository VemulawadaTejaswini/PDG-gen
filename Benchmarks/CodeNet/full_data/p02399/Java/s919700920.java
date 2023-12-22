import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    int y = in.nextInt();
    System.out.print(x / y + " "+ x % y);
    System.out.printf(" %5.8f\n", (double) x / y);
  }
}