import java.math.BigDecimal;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner s = null;
		try {
			s = new Scanner(System.in);
			while (s.hasNextInt()) {
				BigDecimal a = s.nextBigDecimal();
				BigDecimal b = s.nextBigDecimal();
				BigDecimal c = s.nextBigDecimal();
				BigDecimal d = s.nextBigDecimal();
				BigDecimal e = s.nextBigDecimal();
				BigDecimal f = s.nextBigDecimal();

				BigDecimal y = ((c.multiply(d)).subtract((f.multiply(a))))
						.divide(((b.multiply(d)).subtract((f.multiply(a)))));
				BigDecimal x = (c.subtract(b.multiply(y))).divide(a);

				System.out.println(x.setScale(3, BigDecimal.ROUND_DOWN)
						.toPlainString()
						+ " "
						+ y.setScale(3, BigDecimal.ROUND_DOWN).toPlainString());
			}
		} finally {
			s.close();
		}
	}
}