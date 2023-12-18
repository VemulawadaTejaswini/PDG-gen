import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();

		double dd = Math.pow(x, 0.2);
		double ddd = Math.pow(x - 1, 0.2);
		double dddd = Math.pow(x + 1, 0.2);

		BigDecimal b1 = BigDecimal.valueOf(dd);
		BigDecimal b2 = BigDecimal.valueOf(ddd);
		BigDecimal b3 = BigDecimal.valueOf(dddd);
		if (b1.scale() == 1) {
			int i = (int) dd;
			System.out.println(i + " 0");
		} else if (b2.scale() == 1) {
			int i = (int) dd;
			System.out.println(i + " 1");
		} else if (b3.scale() == 1) {
			int i = (int) dd;
			System.out.println(i + " -1");
		}

		sc.close();

	}

}