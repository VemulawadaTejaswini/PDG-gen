
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int pair = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				pair += a[i] / 2;
				a[i] = 0;
			} else {
				pair += a[i] / 2;
				a[i] -= a[i] / 2 * 2;
			}
		}

		for (int i = 0; i < n - 1; i++) {
			int sum = a[i] + a[i + 1];
			if (sum % 2 == 0) {
				pair += sum / 2;
				a[i] = 0;
				a[i + 1] = 0;
			}
		}

		System.out.println(pair);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
