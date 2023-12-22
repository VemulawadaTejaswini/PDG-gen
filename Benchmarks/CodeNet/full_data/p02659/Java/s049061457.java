import java.util.*;
import java.math.BigDecimal;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /*
    BigDecimal aActual = new BigDecimal(sc.next());
    BigDecimal bActual = new BigDecimal(sc.next());
    BigDecimal ansActual = aActual.multiply(bActual);
    BigDecimal ans = ansActual.setScale(0, BigDecimal.ROUND_DOWN);
    System.out.println(ans);
    */
    long a = sc.nextLong();
    Double tmp = sc.nextDouble();
    int b = (int) (tmp * 100);
    System.out.println(a * b / 100);
  }
}