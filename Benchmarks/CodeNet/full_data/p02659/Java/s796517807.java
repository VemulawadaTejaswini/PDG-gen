import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    float b = sc.nextFloat();

    int b2 = Math.round(b * 100);

    long total = a * b2 / 100;

    String result = BigDecimal.valueOf(total).toPlainString();

    System.out.println(result);

  }
}
