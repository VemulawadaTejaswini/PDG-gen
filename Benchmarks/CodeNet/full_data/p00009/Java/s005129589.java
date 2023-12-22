

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	boolean[] prime;
	int[] sum;

	void run() {
		Scanner sc = new Scanner(System.in);

		era(1000);

		System.out.println(Arrays.toString(sum));
		while (sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(sum[n]);
		}

		sc.close();
	}

	public void era(int n) {
		prime = new boolean[n + 1];
		sum = new int[n + 1];

		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;

		int count = 0;

		for (int i = 2; i * i <= n; i++) {
			if (prime[i]) {
				count++;
				sum[i] += count;
				for (int j = i + i; j <= n; j += i) {
					prime[j] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}