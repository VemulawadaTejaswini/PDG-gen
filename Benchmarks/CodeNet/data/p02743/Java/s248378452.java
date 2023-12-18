import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    sc.close();

    BigDecimal ra = BigDecimal.valueOf(Math.sqrt(a));
    BigDecimal rb = BigDecimal.valueOf(Math.sqrt(b));
    BigDecimal rc = BigDecimal.valueOf(Math.sqrt(c));

    boolean ans = ra.add(rb).compareTo(rc) < 0;
    System.out.println(ans ? "Yes" : "No");
  }
}
