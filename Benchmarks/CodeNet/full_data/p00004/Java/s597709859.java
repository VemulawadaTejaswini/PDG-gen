import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double a, b, c, d, e, f;
		double x, y;

		Scanner scan = new Scanner(System.in);


		while ((scan.hasNext())) {

			a = Double.parseDouble(scan.next());
			b = Double.parseDouble(scan.next());
			c = Double.parseDouble(scan.next());
			d = Double.parseDouble(scan.next());
			e = Double.parseDouble(scan.next());
			f = Double.parseDouble(scan.next());

			y = (a * f - c * d) / (a * e - b * d);
			x = (c - b * y) / a;

			BigDecimal xb = new BigDecimal(String.valueOf(x));
			BigDecimal yb = new BigDecimal(String.valueOf(y));


			System.out.println(xb.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue()
					+ " " + yb.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue());
		}
	}

}