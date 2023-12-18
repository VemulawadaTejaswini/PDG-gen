import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			sc.next();
			BigDecimal btcJpy = new BigDecimal(380000.0);
			BigDecimal revenue = BigDecimal.ZERO;
			while (sc.hasNextLine()) {
				String num = sc.next();
				String currency = sc.next();
				if (currency.equals("JPY")) {
					revenue = revenue.add(new BigDecimal(num));
				} else if (currency.equals("BTC")) {
					revenue = revenue.add(new BigDecimal(num).multiply(btcJpy));
				}
			}
			System.out.println(revenue.intValue());
		}
	}
}