import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    double A = Double.parseDouble(a);
    double B = Double.parseDouble(b);

    String result = BigDecimal.valueOf(Math.round(A*B)).toPlainString();

    System.out.println(result);
  }
}
