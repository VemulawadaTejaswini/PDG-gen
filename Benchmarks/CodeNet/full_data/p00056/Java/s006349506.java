import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		boolean[] notPrime = new boolean[50001];
		notPrime[0] = true;
		notPrime[1] = true;
		final int limit = (int) Math.sqrt(50000);
		for (int i = 2; i <= limit; i++) {
			if (!notPrime[i]) {
				for (int j = i + i; j <= 50000; j = j + i) {
					notPrime[j] = true;
				}
			}
		}
		int primeCount = 1;
		for (int i = 3; i <= 50000; i += 2) {
			if (!notPrime[i]) {
				primeCount++;
			}
		}

		int[] primes = new int[primeCount];
		primes[0] = 2;
		int index = 1;
		for (int i = 3; i <= 50000; i += 2) {
			if (!notPrime[i]) {
				primes[index++] = i;
			}
		}
		int[] gbc = new int[50001];
		for (int i = 0; i < primes.length; i++) {
			for (int j = i; j < primes.length; j++) {
				int val = primes[i] + primes[j];
				if (val > 50000) {
					break;
				}
				gbc[val]++;
			}
		}

		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n != 0) {
				System.out.println(gbc[n]);
			}
		}

	}
}