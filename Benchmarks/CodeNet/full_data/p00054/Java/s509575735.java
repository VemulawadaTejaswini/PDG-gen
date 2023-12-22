import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextBigDecimal()) {

				BigDecimal a = sc.nextBigDecimal();
				BigDecimal b = sc.nextBigDecimal();
				int n = sc.nextInt();

				// divide
				String s = String.valueOf(a.divide(b, n, RoundingMode.DOWN));

				// add
				char[] array = s.substring(s.indexOf(".") + 1).toCharArray();
				int result = 0;
				for (char c : array) {
					result += Integer.parseInt(String.valueOf(c));
				}

				System.out.println(result);
				result = 0;
			}
		} finally {
			sc.close();
		}
	}

}