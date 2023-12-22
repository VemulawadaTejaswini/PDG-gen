
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] num = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
			sum += num[i];
		}
		int r = sum;
		int l = r / m;
		while (r - l > 1) {
			int mid = (r + l) / 2;
			if (isTrue(mid, num, m, sum)) {
				r = mid;
			} else {
				l = mid;
			}
		}
		System.out.println(isTrue(l, num, m, sum) ? l : r);
	}

	private boolean isTrue(int mid, int[] num, int m, int sum) {
		int i = 0;
		int k = mid;
		while (true) {
			if (m == 0)
				return false;
			if (i == num.length)
				return true;
			if (k - num[i] >= 0) {
				k -= num[i];
				i++;
			} else {
				m--;
				k = mid;
			}
		}
	}
}