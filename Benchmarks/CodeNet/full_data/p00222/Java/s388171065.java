import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int prime[] = new int[10000000];
		int n;

		Arrays.fill(prime, 1);
		prime[0] = 0;
		prime[1] = 0;
		for (int i = 2; i < 10000000 / 2; i++) {
			if (prime[i] == 1) {
				for (int j = i * 2; j < 10000000; j += i) {
					prime[j] = 0;
				}
			}
		}

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			while (true) {
				if (prime[n] == 1 && prime[n - 2] == 1 && prime[n - 6] == 1 && prime[n - 8] == 1) {
					System.out.println(n);
					break;
				}
				n--;
			}
		}
	}
}