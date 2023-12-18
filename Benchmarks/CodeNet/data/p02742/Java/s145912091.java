import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long h = sc.nextLong();
		long w = sc.nextLong();

		BigDecimal total = new BigDecimal(h*w);

		System.out.println(total.divide(new BigDecimal(2), 0, BigDecimal.ROUND_UP));

	}
}
