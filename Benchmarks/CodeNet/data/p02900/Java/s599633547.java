import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long A = in.nextLong();
		long B = in.nextLong();
		long gcd = gcd(A, B);
		System.out.println(primeFactors(gcd).size() + 1);
		in.close();
	}

	static long gcd(long x, long y) {
		if (x < y) {
			long tmp = y;
			y = x;
			x = tmp;
		}
		if (y == 0) {
			return x;
		}
		return gcd(x % y, y);
	}

	static Map<Long, Long> primeFactors(long n) {
		Map<Long, Long> res = new HashMap<>();
		for (long p = 2; p * p <= n; ++p) {
			if (n % p != 0) {
				continue;
			}
			long num = 0;
			while (n % p == 0) {
				++num;
				n /= p;
			}
			res.put(p, num);
		}
		if (n != 1)
			res.put(n, 1l);
		return res;
	}
}