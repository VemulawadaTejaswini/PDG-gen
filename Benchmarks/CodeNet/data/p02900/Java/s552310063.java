
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	private static Set<Long> primeSet = new HashSet<Long>();
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long a = sc.nextLong();
			long b = sc.nextLong();

			long tmp = getGcd(a, b);
			makePrimeSet(tmp);

			Set<Long> resultSet = new HashSet<Long>();
			resultSet.add(1l);
			// 偶数なら2を入れとく
			if (tmp % 2 == 0) {
				resultSet.add(2l);
			}
			while(tmp % 2 == 0) {
				tmp /= 2;
			}

			long div = 3;
			while (tmp != 1) {
				if (tmp % div == 0) {
					resultSet.add(div);
					tmp /= div;
				} else {
					div += 2;
				}
			}
			System.out.println(resultSet.size());
		}
	}

	static long getGcd (long a, long b) {
		long temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}

	private static void makePrimeSet(long max) {
		if (max < 2) {
			return;
		}
		primeSet.add(2l);
		for (long i = 3; i <= max; i += 2) {
			if (isPrime(i)) {
				primeSet.add(i);
			}
		}
		return ;
	}

	private static boolean isPrime(long n) {
		for (long i : primeSet) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
