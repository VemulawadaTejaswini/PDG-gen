
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		int count = 0;
		while (m-- > 0) {
			int a = scanner.nextInt();
			int l = 0;
			int r = n - 1;
			while (l <= r) {
				int mid = (l + r) / 2;
				if (num[mid] > a) {
					r = mid - 1;
				} else if (num[mid] < a) {
					l = mid + 1;
				} else {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}