import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] a = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			Arrays.sort(a);
			sum -= a[0];
			sum -= a[n - 1];
			System.out.println(sum / (n - 2));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}