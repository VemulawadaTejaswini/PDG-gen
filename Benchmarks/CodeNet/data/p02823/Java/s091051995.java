import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		BigDecimal n_ = new BigDecimal(sc.next());
		BigDecimal a_ = new BigDecimal(sc.next());
		BigDecimal b_ = new BigDecimal(sc.next());

		BigDecimal n = n_.setScale(0, BigDecimal.ROUND_DOWN);
		BigDecimal a = a_.setScale(0, BigDecimal.ROUND_DOWN);
		BigDecimal b = b_.setScale(0, BigDecimal.ROUND_DOWN);

		if (a.subtract(BigDecimal.ONE).compareTo(n.subtract(b)) == -1) {
			exe(a, b, a.subtract(BigDecimal.ONE), n);
		} else if (a.subtract(BigDecimal.ONE).compareTo(n.subtract(b)) == 0) {
			if (n.remainder(new BigDecimal(2)).compareTo(BigDecimal.ZERO) == 0) {
				System.out.println(b);
			} else {
				System.out.println(b.subtract(a).divide(new BigDecimal(2)));
			}
		} else {
			exe(b, a, (n.subtract(b)).negate(), n);
		}

	}

	private static void exe(BigDecimal a, BigDecimal b, BigDecimal mg, BigDecimal n) {
		if ((b.subtract(a)).remainder(new BigDecimal(2)) != BigDecimal.ZERO) {
			System.out.println(b.subtract(a).add(mg).abs());
			return;
		}
		if (n.remainder(new BigDecimal(2)).compareTo(BigDecimal.ZERO) == 0) {
			System.out.println(n.subtract(a).abs());
		} else {
			System.out.println(b.subtract(a).divide(new BigDecimal(2).abs()));
		}
	}
}