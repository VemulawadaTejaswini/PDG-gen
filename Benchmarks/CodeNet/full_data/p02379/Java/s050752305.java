import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;

public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double x1 = sc.nextDouble();
      double y1 = sc.nextDouble();      
      double x2 = sc.nextDouble();
      double y2 = sc.nextDouble();
      double x = x1 - x2;
      double xx = x * x;
      double y = y1 - y2;
      double yy = y * y;
      double kai2 = xx + yy;
      double kai = Math.sqrt(kai2);
      System.out.println(kai);
    }
}
