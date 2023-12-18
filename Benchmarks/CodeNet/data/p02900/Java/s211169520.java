import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private Set<Long> divisors(long x) {
		Set<Long> result = new HashSet<>();

		for (int i = 1; i <= Math.sqrt(x) + 1; i++) {
			if (x % i == 0) {
				result.add((long) i);
				result.add(x / i);
			}
		}

		return result;
	}

	// 最大公約数
	private static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	private boolean isPrime(long x) {
		if (x < 2)
			return false;
		else if (x == 2)
			return true;
		else if (x % 2 == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(x); i += 2) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	private List<Long> prime(List<Long> x) {
		List<Long> result = new ArrayList<>();
		result.add((long) 1);
		for (long n : x) {
			if (isPrime(n)) {
				result.add(n);
			}
		}
		return result;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long A = sc.nextLong();
		long B = sc.nextLong();

		sc.close();

		Set<Long> cd = divisors(A);
		cd.retainAll(divisors(B));

		List<Long> arr = new ArrayList<>(cd);

		arr = prime(arr);

		out.println(arr.size());

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
