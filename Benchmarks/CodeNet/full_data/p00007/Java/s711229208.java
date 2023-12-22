import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
	
	public static BigDecimal INTEREST_RATE = new BigDecimal("0.05");
	
	public static void main(String... args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			BigDecimal baseDebt = new BigDecimal(100000);
			BigDecimal debt = calc(baseDebt, n);
			System.out.println(debt.intValue());
		} finally {
			scanner.close();
		}
	}
	
	public static BigDecimal calc(BigDecimal debt, int n) {
		if (n <= 0) {
			return debt;
		}
		BigDecimal interest = debt.multiply(INTEREST_RATE);
		BigDecimal afterDebt = debt.add(interest).setScale(-3, RoundingMode.UP);
		return calc(afterDebt, --n);
	}
}