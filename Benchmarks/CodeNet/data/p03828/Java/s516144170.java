import java.util.Scanner;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final long MOD = 1000000007;
		HashMap<Integer, Integer> primes = new HashMap<Integer, Integer>();

		for (int i = 2; i <= N; i++) {
			if (isPrime(i)) {
				primes.put(i, 0);
			}
		}
		for (int i=1; i<=N; i++) {
			int n = i;
			while (n>1) {
				for (Integer p: primes.keySet()) {
					if (n%p ==0) {
						primes.put(p, primes.get(p)+1);
						n /= p;
					}
				}
			}
		}
		
		long count = 1;
		for (Integer p: primes.keySet()) {
			count = (count * (1+primes.get(p))) % MOD;
		}
		System.out.println(count);
		sc.close();
	}

	private static boolean isPrime(int n) {
		if (n == 1 || n == 2) {
			return true;
		} else {
			for (int i = 2; i < Math.sqrt(n) + 1; i++) {
				if (n % i == 0)
					return false;
			}
		}
		return true;
	}
}
