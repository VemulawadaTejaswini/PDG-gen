import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    float b = sc.nextFloat();
    double b2 = b * 100;

    double total = a * b2 / 100;

    String result = BigDecimal.valueOf(total).toPlainString();

    System.out.println(result);
  }
}
