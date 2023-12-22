import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			double a = sc.nextDouble(); // a
			double b = sc.nextDouble(); // b
			double c = sc.nextDouble(); // c
			double d = sc.nextDouble(); // d
			double e = sc.nextDouble(); // e
			double f = sc.nextDouble(); // f

			double x = (c * e - b * f) / (a * e - b * d);
			double y = (f * a - c * d) / (a * e - d * b);

			BigDecimal xx = new BigDecimal(x);
			BigDecimal yy = new BigDecimal(y);
			BigDecimal solutionX = xx.setScale(3, BigDecimal.ROUND_HALF_UP);
			BigDecimal solutionY = yy.setScale(3, BigDecimal.ROUND_HALF_UP);

			System.out.println(solutionX + " " + solutionY);
		}
	}
}