import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	/**
	 * Simultaneous Equation
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			BigDecimal a = scanner.nextBigDecimal();
			BigDecimal b = scanner.nextBigDecimal();
			BigDecimal c = scanner.nextBigDecimal();
			BigDecimal d = scanner.nextBigDecimal();
			BigDecimal e = scanner.nextBigDecimal();
			BigDecimal f = scanner.nextBigDecimal();

			System.out.print(calcX(a, b, c, d, e, f));
			System.out.print(" ");
			System.out.println(calcY(a, b, c, d, e, f));
		}
	}

	private static BigDecimal calcX(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal d, BigDecimal e, BigDecimal f) {
		return (c.multiply(e).subtract(b.multiply(f)))
				.divide((a.multiply(e).subtract(b.multiply(d))), 3, BigDecimal.ROUND_HALF_UP);
	}

	private static BigDecimal calcY(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal d, BigDecimal e, BigDecimal f) {
		return (c.multiply(d).subtract(a.multiply(f)))
				.divide((b.multiply(d).subtract(a.multiply(e))), 3, BigDecimal.ROUND_HALF_UP);
	}
}