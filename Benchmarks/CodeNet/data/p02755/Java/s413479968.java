import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    BigDecimal eight = new BigDecimal("0.08");
    BigDecimal ten = new BigDecimal("0.1");

    BigDecimal aB = new BigDecimal(a);
    BigDecimal bB = new BigDecimal(b);

    int o8 = aB.divide(eight, RoundingMode.DOWN).intValue();

    BigDecimal temp = new BigDecimal(o8);
    if (temp.multiply(ten).intValue() == b) {
      int o10 = bB.divide(ten, RoundingMode.DOWN).intValue();
      System.out.println(Math.min(o8, o10));
    } else {
      System.out.println(-1);
    }
  }
}
