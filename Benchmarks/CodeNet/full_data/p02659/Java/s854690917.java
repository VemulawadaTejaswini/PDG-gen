import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] str) {
		Scanner cin = new Scanner(System.in);
		BigDecimal a = cin.nextBigDecimal();
		BigDecimal b = cin.nextBigDecimal();
		b = BigDecimal.valueOf(1).divide(b, 1000, BigDecimal.ROUND_HALF_UP);
		System.out.print(a.divide(b, 0, BigDecimal.ROUND_DOWN));
	}
}