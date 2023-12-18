import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		// √a + √b < √c
		// a + 2√ab + b < c
		// 0 < (c -a -b)^2 - 4ab
		BigDecimal result = new BigDecimal(c - a -b)
								.pow(2)
								.add(new BigDecimal(-4 * a * b));

		if (0 < result.doubleValue()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}