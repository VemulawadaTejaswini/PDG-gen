
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static boolean primes[] = new boolean[1000001];

	static void sieve() {
		primes[1] = primes[0] = false;
		primes[2] = true;
		for (int i = 3; i < 1000001; i++)
			primes[i] = true;
		for (int i = 2; i <= 1001; i++)
			if (primes[i])
				for (int j = 2 * i; j < primes.length; j = j + i)
					primes[j] = false;
	}

	static ArrayList<Integer> primeFact(long n) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0 && primes[i])
				factors.add(i);
		return factors;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(), ans = 0;
		sieve();
		ArrayList<Integer> prime = primeFact(N);
		if (prime.size() > 0) {
			for (int i = 0; i < prime.size() && N > 0; i++) {
				int temp = prime.get(i);
				while (N % temp == 0) {
					N = N / temp;
					temp *= prime.get(i);
					++ans;
				}
			}
		} else {
			ans = 1;
		}
		System.out.println(ans);
		sc.close();
	}
}
