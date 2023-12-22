
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    double b = sc.nextDouble();
    sc.close();

    double x = a * b;

    System.out.println(BigDecimal.valueOf((long)x).toPlainString());
  }

}
