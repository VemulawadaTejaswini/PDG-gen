import java.util.Arrays;
import java.util.Scanner;

public class Eratosthenes {
	//途中
	
	int prime[];

	void eratosthenes(int max) {
		prime = new int[max + 1];
		Arrays.fill(prime, 1);
		prime[0] = prime[1] = 0;
		for (int i = 2; i * i <= max; i++) {
			if (prime[i] == 1) {
				for (int j = i * i; j <= max; j += i) {
					prime[j] = 0;
				}
			}
		}
	}

	void eratosthenes2(int max) {
		int end = max / 2 + 1;
		prime = new int[end];
		Arrays.fill(prime, 1);
		prime[0] = 0;
		for (int i = 0; (2 * i + 1) * (2 * i + 1) <= max; i++) {
			if (prime[i] == 1) {
				for (int j = 2 * i * (i + 1); j < end; j += 2 * i + 1) {
					prime[j] = 0;
				}
			}
		}
	}

	void eratosthenes3(int max) {
		int end = max / 6 + 1;
		prime = new int[end];
		Arrays.fill(prime, 1);
		prime[0] ^= 1;
		for (int i = 0; (6 * i + 5) * (6 * i + 5) <= max; i++) {

		}
	}

	boolean isPrime2(int n) {
		if (n == 2) return true;
		if (n % 2 == 0) return false;
		n = (n - 1) / 2;
		if (prime[n] == 1) return true;
		return false;
	}

	void run() {
		Scanner sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		new Eratosthenes().run();
	}
}