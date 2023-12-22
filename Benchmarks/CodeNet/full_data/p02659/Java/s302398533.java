
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    double b = sc.nextDouble() * 100;
    sc.close();

    long x = (long)(a * b) / 100;

    System.out.println(BigDecimal.valueOf(x).toPlainString());
  }

}
