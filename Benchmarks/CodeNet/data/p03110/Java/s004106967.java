import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int count = scanner.nextInt();
			scanner.nextLine();
			BigDecimal rate = new BigDecimal("380000.0");
			BigDecimal sum = BigDecimal.ZERO;
			for (int i = 0; i < count; i++) {
				String amount = scanner.next();
				String currency = scanner.next();
				scanner.nextLine();
				if ("JPY".equals(currency)) {
					sum = sum.add(new BigDecimal(amount));
				} else {
					sum = sum.add((new BigDecimal(amount)).multiply(rate));
				}
			}
			System.out.println(sum);
		}
	}
}
