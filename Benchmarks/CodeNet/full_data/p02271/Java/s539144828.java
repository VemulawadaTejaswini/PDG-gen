
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
		while (m-- > 0) {
			boolean flag = false;
			int a = scanner.nextInt();
			for (int i = 0; i < 1 << n; i++) {
				int sum = 0;
				for (int j = 0; j < n; j++) {
					if (((i >> j) & 1) == 1) {
						sum += num[j];
					}
				}
				if (a == sum) {
					flag = true;
					break;
				}
			}
			System.out.println(flag ? "yes" : "no");
		}

	}
}