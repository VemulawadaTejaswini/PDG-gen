import java.util.*;
import java.math.BigDecimal;

public class Main {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    
    String A = sc.next();
    String B = sc.next();
    BigDecimal b1 = new BigDecimal(A);
    BigDecimal b2 = new BigDecimal(B);
    BigDecimal b3 = b1.multiply(b2);
    BigDecimal bd1 = b3.setScale(0, BigDecimal.ROUND_DOWN);
    System.out.println(bd1);
  }
}