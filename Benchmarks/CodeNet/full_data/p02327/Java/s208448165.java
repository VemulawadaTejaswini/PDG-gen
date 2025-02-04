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
		int[][] cum = new int[2][w];
		int ans = 0;
		for (int i = 0; i < h; ++i) {
			if(i%100==0)
			System.gc();
			for (int j = 0; j < w; ++j) {
				int c = sc.nextInt();
				if (c == 0) {
					cum[i % 2][j] = (i > 0 ? cum[(i - 1) % 2][j] : 0) + 1;
				} else {
					cum[i % 2][j] = 0;
				}
			}
			ans = Math.max(ans, solve(cum[i % 2], w));
			
		}

		System.out.println(ans);

	}

	int solve(int[] cum, int w) {
		int ans = 0;
		ArrayDeque<List<Integer>> stack = new ArrayDeque<>();
		for (int j = 0; j < w; ++j) {
			ans = Math.max(ans, cum[j]);
			int d = j;
			while (!stack.isEmpty() && (cum[j] == 0 || stack.peekLast().get(0) > cum[j])) {
				List<Integer> pair = stack.pollLast();
				ans = Math.max(ans, pair.get(0) * (j - pair.get(1)));
				d = Math.min(d, pair.get(1));
			}
			if (cum[j] == 0)
				continue;
			stack.addLast(Arrays.asList(cum[j], d));
		}
		while (!stack.isEmpty()) {
			List<Integer> pair = stack.pollLast();
			ans = Math.max(ans, pair.get(0) * (w - pair.get(1)));
		}
		return ans;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}