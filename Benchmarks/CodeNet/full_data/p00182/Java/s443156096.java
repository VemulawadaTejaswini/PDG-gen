
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	boolean[] have;
	int[] num;

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			num = new int[n];
			for (int i = 0; i < n; i++) {
				num[i] = scanner.nextInt();
			}
			Arrays.sort(num);
			have = new boolean[n];
			have[0] = true;
			System.out.println(dfs(1, num[n - 1] - num[0]) ? "YES" : "NO");
		}

	}

	private boolean dfs(int k, int rest) {
		if (rest == 0) {
			boolean[] t = Arrays.copyOf(have, have.length);
			return greedy(t);
		}
		if (num[k] > rest)
			return false;
		have[k] = true;
		if (dfs(k + 1, rest - num[k]))
			return true;
		have[k] = false;
		return dfs(k + 1, rest);
	}

	private boolean greedy(boolean[] t) {
		for (int i = 0; i < have.length - 1; i++) {
			if (!t[i]) {
				if (!choice(i - 1, num[i], t)) {
					return false;
				}
				t[i] = true;
			}
		}
		return true;
	}

	private boolean choice(int k, int rest, boolean[] t) {
		if (rest == 0)
			return true;
		if (k < 0)
			return false;
		if (!t[k])
			return choice(k - 1, rest, t);
		if (num[k] <= rest) {
			t[k] = false;
			if (choice(k - 1, rest - num[k], t))
				return true;
			t[k] = true;
		}
		return choice(k - 1, rest, t);
	}
}