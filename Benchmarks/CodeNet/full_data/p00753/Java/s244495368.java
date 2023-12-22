import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Main().run();
	}

	void run() {
		int MAX = 123456 * 2;
		boolean isPrime[] = new boolean[MAX + 1];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i * i <= MAX; i++) {
			if (isPrime[i]) {
				for (int j = i + i; j <= MAX; j += i) {
					isPrime[j] = false;
				}
			}
		}
		int sum[] = new int[MAX + 1];
		sum[0] = 0;
		for (int i = 1; i <= MAX; i++) {
			sum[i] = sum[i - 1];
			if (isPrime[i]) {
				sum[i] += 1;
			}
		}
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			System.out.println(sum[2 * n] - sum[n]);
		}
	}
}