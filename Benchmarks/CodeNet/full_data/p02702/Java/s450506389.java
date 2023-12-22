import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		long cnt = 0;

		int length = s.length();

		String temp = null;

		BigDecimal divisor = new BigDecimal("2019");
		BigDecimal bd = null;
		BigDecimal div = null;
		BigDecimal rnd = null;
		BigDecimal subs = null;
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j <= length; j++) {
				temp = s.substring(i, j);

				bd = new BigDecimal(temp);

				if (divisor.compareTo(bd) == 1) {
					continue;
				}
//
//				div = bd.divide(divisor, 2, RoundingMode.HALF_UP);
//				rnd = div.setScale(0, RoundingMode.DOWN);
//				subs = div.subtract(rnd);

				subs = bd.remainder(divisor);

				if (subs.doubleValue() == 0) {
					cnt++;
				}

			}
		}

		System.out.println(cnt);

	}

}
