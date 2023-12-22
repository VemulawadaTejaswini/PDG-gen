import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, p;
		int k[] = new int[1000000];
		final int max = 10000000;

		int prime[] = new int[max];
		Arrays.fill(prime, 1);
		prime[0] = 0;
		prime[1] = 0;
		for (int i = 2; i < max / 2; i++) {
			for (int j = i * 2; j < max; j += i) {
				prime[j] = 0;
			}
		}

		while (true) {
			n = sc.nextInt();
			p = sc.nextInt();
			if (n == -1 && p == -1) {
				break;
			}
			Arrays.fill(k, Integer.MAX_VALUE);
			int id = 0;
			for (int i = n + 1; i < n + 10 * p; i++) {
				for (int j = i; j < n + 10 * p; j++) {
					if (prime[i] == 1 && prime[j] == 1) {
						k[id++] = i + j;
					}
				}
			}

			Arrays.sort(k);
			System.out.println(k[p - 1]);
		}
	}
}