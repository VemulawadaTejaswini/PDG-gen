
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
			a = new int[10];
			while (n-- > 0) {
				int b = scanner.nextInt();
				a[b]++;
			}
			int sum = 0;
			for (int i = 1; i < 5; i++) {
				int c = Math.min(a[i], a[10 - i]);
				sum += c;
				a[i] -= c;
				a[10 - i] -= c;
			}
			sum += a[5] / 2;
			a[5] %= 2;

			ans = 0;
			dfs(1, 0, 0);
			System.out.println(sum + ans);

		}
	}

	private void dfs(int i, int sum, int now) {
		int rem = sum;
		for (int j = 1; j < 10; j++)
			rem += a[j] * j;
		if (now + rem / 10 <= ans)
			return;
		ans = Math.max(ans, now);
		if (sum == 10) {
			dfs(1, 0, now + 1);
			return;
		}
		if (i == 10)
			return;
		dfs(i + 1, sum, now);
		if (a[i] > 0 && i + sum <= 10) {
			a[i]--;
			dfs(i, sum + i, now);
			a[i]++;
		}
	}

	int ans;
	int[] a;
}