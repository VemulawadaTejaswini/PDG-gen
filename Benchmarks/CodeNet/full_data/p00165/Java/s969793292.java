
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 1000000;
		boolean[] p = new boolean[N + 1];
		int[] map = new int[N + 1];
		for (int i = 2; i <= N; i++) {
			map[i] = map[i - 1];
			if (!p[i]) {
				map[i]++;
				for (int j = i * 2; j <= N; j += i) {
					p[j] = true;
				}
			}
		}

		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int c = Math.max(a - b, 2);
				int d = Math.min(a + b, 1000000);
				sum += map[d] - map[c - 1];
			}
			System.out.println(sum - n);
		}
	}
}