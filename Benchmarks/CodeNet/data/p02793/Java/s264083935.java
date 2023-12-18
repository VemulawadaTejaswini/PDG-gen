import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// nがあり、nの数だけの整数の入力
			long n = sc.nextLong();
			List<Long> an = new ArrayList<>();
			for (long i = 0; i < n; i++) {
				an.add(sc.nextLong());
			}
			BigDecimal lcm = BigDecimal.valueOf(an.get(0));
			for (int i = 1; i < an.size(); i++) {
				lcm = lcm(lcm, BigDecimal.valueOf(an.get(i)));
			}
			BigDecimal result = BigDecimal.valueOf(0);
			for (int i = 0; i < an.size(); i++) {
				BigDecimal wkResult = lcm.divide(BigDecimal.valueOf(an.get(i)));
				wkResult = wkResult.remainder(BigDecimal.valueOf(1000000007l));
				result = result.add(wkResult);
				result = result.remainder(BigDecimal.valueOf(1000000007l));
			}
			System.out.println(result);
		}
	}

	/**
	 * 最小公倍数
	 */
	static BigDecimal lcm(BigDecimal a, BigDecimal b) {
		BigDecimal temp;
		BigDecimal c = a.multiply(b);
		while ((temp = a.remainder(b)) != BigDecimal.ZERO) {
			a = b;
			b = temp;
		}
		return c.divide(b);
	}
}