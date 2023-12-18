import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = sc.nextInt();
			int full = a * a * b;
			if(x < full/2) {
				BigDecimal h = new BigDecimal(x * 2).divide(new BigDecimal(a * b), 8, BigDecimal.ROUND_DOWN);
				double rad = Math.atan2(b, h.doubleValue());
				System.out.print(Math.toDegrees(rad));
				return;
			}
			if(x == full) {
				System.out.print(0);
				return;
			}
			BigDecimal h = new BigDecimal((full - x) * 2).divide(new BigDecimal(a * a), 8, BigDecimal.ROUND_DOWN);
			double rad = Math.atan2(h.doubleValue(), a);
			System.out.print(Math.toDegrees(rad));
			return;
		}
	}
}
