import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		double r = Double.parseDouble(line);
		double m = r * r * 3.14159275;
		double s = 2 * r * 3.14159275;

		BigDecimal v = new BigDecimal(m);
		BigDecimal v2 = new BigDecimal(s);

		v.setScale(7, BigDecimal.ROUND_DOWN);
		v2.setScale(7, BigDecimal.ROUND_DOWN);
		System.out.println(v.toPlainString() + " " + v2.toPlainString());
	}
}