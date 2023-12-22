
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] num = new int[n];
			for (int i = 0; i < n; i++) {
				num[i] = scanner.nextInt();
			}
			int m = scanner.nextInt();
			int count = 0;
			int l = 0;
			int r = n - 1;
			while (l <= r) {
				count++;
				int mid = (r + l) / 2;
				if (num[mid] > m) {
					r = mid - 1;
				} else if (num[mid] < m) {
					l = mid + 1;
				} else {
					break;
				}

			}
			System.out.println(count);
		}

	}
}