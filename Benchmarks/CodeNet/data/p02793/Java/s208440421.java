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
			long lcm = an.get(0);
			for (int i = 1; i < an.size(); i++) {
				lcm = lcm(lcm, an.get(i));
			}
			long result = 0;
			for (int i = 0; i < an.size(); i++) {
				long wkResult = lcm / an.get(i);
				wkResult = wkResult % 1000000007l;
				result = result + (lcm / an.get(i));
				result = result % 1000000007l;
			}
			System.out.println(result);
		}
	}

	/**
	 * 最小公倍数
	 */
	static long lcm(long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return c / b;
	}
}
