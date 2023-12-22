
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();

			if (n == 1) {
				System.out.println(0);
				return;
			}

			Map<Integer, Integer> a = getPrimeFactorization(n);
			int result = 0;
			for(int i : a.keySet()) {
				int tmp = a.get(i);
				for(int j = 1; ; j++) {
					tmp -= j;
					if (0 <= tmp) {
						result++;
					} else {
						break;
					}
				}
			}
			if (result == 0) {
				System.out.println(1);
			} else {
				System.out.println(result);
			}
		}
	}

	/*
	 * 素因数分解
	 */
	private static Map<Integer, Integer> getPrimeFactorization(long num) {
		Map<Integer, Integer> result = new HashMap<>();
		long tmp = num;

		while(tmp % 2 == 0) {
			if (result.containsKey(2)) {
				result.put(2, result.get(2) + 1);
			} else {
				result.put(2, 1);
			}
			tmp /= 2;
		}

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (tmp < i) {
				break;
			}
			while(tmp % i == 0) {
				if (result.containsKey(i)) {
					result.put(i, result.get(i) + 1);
				} else {
					result.put(i, 1);
				}
				tmp /= i;
			}
		}

		return result;
	}
}
