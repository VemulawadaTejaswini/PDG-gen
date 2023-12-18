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
		BigDecimal subs = null;

		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 3; j <= length; j++) {
				temp = s.substring(i, j);

				bd = new BigDecimal(temp);

				if (divisor.compareTo(bd) == 1) {
					continue;
				}
				subs = bd.remainder(divisor);

				if (subs.compareTo(BigDecimal.ZERO) == 0) {
					cnt++;
				}

			}
		}

		System.out.println(cnt);

	}

}
