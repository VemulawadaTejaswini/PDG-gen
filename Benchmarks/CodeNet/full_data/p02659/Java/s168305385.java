import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] str) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			BigDecimal a = cin.nextBigDecimal();
			BigDecimal b = cin.nextBigDecimal();
			b = BigDecimal.valueOf(1).divide(b, 20, BigDecimal.ROUND_HALF_UP);
			System.out.println(a.divide(b, 0, BigDecimal.ROUND_DOWN));
		}
	}
}