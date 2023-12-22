import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		boolean[] notPrime = new boolean[50022];
		notPrime[0] = true;
		notPrime[1] = true;
		final int limit = (int) Math.sqrt(50021);
		for (int i = 2; i <= limit; i++) {
			if (!notPrime[i]) {
				for (int j = i + i; j <= 50021; j = j + i) {
					notPrime[j] = true;
				}
			}
		}
		int primeCount = 1;
		for (int i = 3; i <= 50021; i += 2) {
			if (!notPrime[i]) {
				primeCount++;
			}
		}

		int[] primes = new int[primeCount];
		primes[0] = 2;
		int index = 1;
		for (int i = 3; i <= 50021; i += 2) {
			if (!notPrime[i]) {
				primes[index++] = i;
			}
		}
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int low = 2;
			int tg = in.nextInt();
			for (int i = 0; i < primes.length; i++) {
				if (primes[i] < tg) {
					low = primes[i];
				} else if (primes[i] > tg) {
					System.out.println(low + " " + primes[i]);
					break;
				}
			}
		}
	}

}