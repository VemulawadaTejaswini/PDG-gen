import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    sc.close();
    BigDecimal a = new BigDecimal(l);
    a = a.divide(new BigDecimal(3));
    BigDecimal ans = a.multiply(a).multiply(a);
    System.out.println(ans.toString());
  }
}