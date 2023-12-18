import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
			Map<Long, Long> map = new HashMap<>();
			for (long l : an) {
				Long c = map.get(l);
				if (c == null) {
					c = 0l;
				}
				map.put(l, c + 1);
			}
			for (long l : an) {
				Map<Long, Long> newmap = new HashMap<>(map);
				newmap.put(l, map.get(l) - 1);
				long result = 0;
				for (Long val : newmap.values()) {
					result = result + (val * (val - 1) / 2);
				}
				System.out.println(result);
			}

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

	/**
	 * 最大公約数
	 */
	static long gcd(long a, long b) {
		long temp;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return b;
	}
}