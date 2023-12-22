
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
		int max = 0;
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
			sum += num[i];
			max = Math.max(max, num[i]);
		}
		int r = sum;
		int l = Math.max(max, r / m);
		while (l < r) {
			int mid = (r + l) / 2;
			if (isTrue(mid, num, m, sum)) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		System.out.println(isTrue(l, num, m, sum) ? l : l + 1);
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