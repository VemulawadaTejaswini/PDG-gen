import java.util.Scanner;

public class Main {
	int prime[];

	void eratosthenes(int max) {
		prime = new int[max + 1];
		for (int i = 0; i < max + 1; i++) {
			prime[i] = 1;
		}
		prime[0] = prime[1] = 0;
		for (int i = 2; i * i <= max; i++) {
			if (prime[i] == 1) {
				for (int j = i * i; j <= max; j += i) {
					prime[j] = 0;
				}
			}
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		eratosthenes(250000);

		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int ans = 0;
			for (int i = n + 1; i <= 2*n; i++) {
				if (prime[i] == 1) ans++;
			}

			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}