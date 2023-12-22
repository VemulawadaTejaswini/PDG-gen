import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();

			double a = Double.parseDouble(data);

			BigDecimal b1 = new BigDecimal(String.valueOf(Math.pow(a, 1)));
			BigDecimal b2 = new BigDecimal(String.valueOf(Math.pow(a, 2)));
			BigDecimal b3 = new BigDecimal(String.valueOf(Math.pow(a, 3)));

			System.out.println(b1.add(b2).add(b3).longValue());
		}
	}
}