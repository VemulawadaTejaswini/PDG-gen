import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		long n = gcd(a,b);

		int size = factorize(n).size();

		System.out.println(size+1);

	}

	static long gcd(long x, long y) {
		if (y == 0)
			return x;
		return gcd(y, x % y);
	}

	static HashMap<Long, Integer> factorize(long n) {
		HashMap<Long, Integer> res = new HashMap<>();
		for (long i = 2; i <= n; i++) {
			while (n % i == 0) {
				if (!res.containsKey(i)) {
					res.put(i, 1);
				} else {
					res.put(i, res.get(i) + 1);
				}
				n /= i;
			}
		}
		return res;
	}
}