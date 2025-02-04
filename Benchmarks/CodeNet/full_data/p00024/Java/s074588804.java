import java.math.BigDecimal;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNextBigDecimal()) {

				BigDecimal v = sc.nextBigDecimal();
				BigDecimal t = v.divide(new BigDecimal("9.8"), 2, BigDecimal.ROUND_DOWN);
				BigDecimal y = t.pow(2).multiply(new BigDecimal("4.9"));
				BigDecimal n = y.add(new BigDecimal(5)).divide(new BigDecimal(5), 0, BigDecimal.ROUND_UP);

				System.out.println(n.toPlainString());

			}
		}
	}

}