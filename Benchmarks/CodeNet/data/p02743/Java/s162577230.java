import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextInt();
    long c = sc.nextInt();

    BigDecimal ma = new BigDecimal(Math.sqrt(a));
    BigDecimal mb = new BigDecimal(Math.sqrt(b));
    BigDecimal mc = new BigDecimal(Math.sqrt(c));
    BigDecimal sum = ma.add(mb);
    if (sum.compareTo(mc) < 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}