
import java.util.*;

class B implements Runnable {
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		for (int N = sc.nextInt(); N > 0; N = sc.nextInt()) {
			Map<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < N; i++) {
				map.put(sc.next(), sc.nextInt() * 3000 + sc.nextInt());
			}
			Program[] ps = new Program[N];
			int P = sc.nextInt();
			int idx = 0;
			for (; idx < P; idx++)
				ps[idx] = new Program(map.remove(sc.next()), 1001);
			for (int k : map.values())
				ps[idx++] = new Program(k, 1);
			Arrays.sort(ps);

			int[] dp = new int[N + 1];
			for (int i = 0, j = 0; i < N; i++) {
				while (j < N && ps[j].key + 30 <= ps[i].key)
					j++;
				dp[i + 1] = Math.max(dp[i], dp[j] + ps[i].val);
			}
			if (dp[N] < 1000 * P)
				System.out.println(-1);
			else
				System.out.println(dp[N] % 1000);
		}
	}

	private int hm(int hm) {
		return hm / 100 * 60 + hm % 60;
	}

	private class Program implements Comparable<Program> {
		final int key, val;

		public Program(int key, int val) {
			this.key = key;
			this.val = val;
		}

		@Override
		public int compareTo(Program o) {
			return key - o.key;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		new B().run();
	}
}