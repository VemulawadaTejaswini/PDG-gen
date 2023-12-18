
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Integer n = sc.nextInt();
		Integer t = sc.nextInt();
		Integer a = sc.nextInt();

		int place = 0;
		int neartemp = 0;
		for (int i = 0; i < n; i++) {
			final int temp = (t - sc.nextInt() * 6) / 1000;
			if (i == 0) {
				place = i + 1;
				neartemp = temp;
				continue;
			}
			if (Math.abs(a - neartemp) > Math.abs(a - temp)) {
				place = i + 1;
				neartemp = temp;
			}
		}

		System.out.println(place);

	}

}
