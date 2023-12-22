import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] cum = new int[h][w];
		for (int i = 0; i < h; ++i) {
			int[] c = new int[w];// c[i][j]==0???????????¨??????
			for (int j = 0; j < w; ++j) {
				c[j] = sc.nextInt();
				if (c[j] == 0) {
					if (i != 0) {
						cum[i][j] += cum[i - 1][j];
					}
					cum[i][j]++;
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < h; ++i) {
			ArrayDeque<List<Integer>> stack = new ArrayDeque<>();
			for (int j = 0; j < w; ++j) {
				ans = Math.max(ans, cum[i][j]);
				int d = j;
				while (!stack.isEmpty() && (cum[i][j] == 1 || stack.peekLast().get(0) > cum[i][j])) {
					List<Integer> pair = stack.pollLast();
					ans = Math.max(ans, pair.get(0) * (j - pair.get(1)));
					d = Math.min(d, pair.get(1));
				}
				if (cum[i][j] == 1)
					continue;
				stack.addLast(Arrays.asList(cum[i][j], d));
			}
			while (!stack.isEmpty()) {
				List<Integer> pair = stack.pollLast();
				ans = Math.max(ans, pair.get(0) * (w - pair.get(1)));
			}
		}
		System.out.println(ans);

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}