import java.util.*;
import java.math.BigDecimal;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal X = sc.nextBigDecimal();
        BigDecimal a = new BigDecimal("100");
        BigDecimal b = new BigDecimal("1.01");
        int i = 0;
        while (true) {
          a = a.multiply(b);
          a = a.setScale(0,BigDecimal.ROUND_DOWN);
          i++;
          if (a.compareTo(X) >= 0) {
            System.out.println(i);
            break;
            }
        }
	}
}