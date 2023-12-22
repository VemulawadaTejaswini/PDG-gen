
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			u = scanner.nextInt();
			if ((n | u) == 0)
				break;
			need = new int[n];
			int all = 0;
			unit = new int[n];
			for (int i = 0; i < n; i++) {
				unit[i] = scanner.nextInt();
				all += unit[i];
				int k = scanner.nextInt();
				for (int j = 0; j < k; j++) {
					int x = scanner.nextInt();
					need[i] |= (1 << x);
				}
			}
			if (all == u) {
				System.out.println(n);
				continue;
			}
			for (int i = 1; i < n; i++) {
				v = new boolean[1 << n];
				if (slove(0, 0, 0, i)) {
					System.out.println(i);
					break;
				}
			}
		}

	}

	private boolean slove(int bit, int one, int have, int depth) {
		if (u <= have)
			return true;
		if (one == depth)
			return false;
		for (int i = 0; i < n; i++) {
			int a = bit | (1 << i);
			if (v[a] || (bit | need[i]) != bit)
				continue;
			if (slove(a, one + 1, have + unit[i], depth))
				return true;
		}
		return false;
	}

	int n, u;
	int[] need, unit;
	int ans;
	boolean[] v;
}