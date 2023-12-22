

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			double c = sc.nextInt();
			double d = sc.nextInt();
			double e = sc.nextInt();
			double f = sc.nextInt();

			double x = (b * f - c * e) / (b * d - a * e);
			double y = (c * d - a * f) / (b * d - a * e);
			
			BigDecimal ax = new BigDecimal(x);
			BigDecimal ay = new BigDecimal(y);
			
			ax = ax.setScale(3, BigDecimal.ROUND_HALF_UP);
			ay = ay.setScale(3, BigDecimal.ROUND_HALF_UP);
			
			System.out.println(ax + " " + ay);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}