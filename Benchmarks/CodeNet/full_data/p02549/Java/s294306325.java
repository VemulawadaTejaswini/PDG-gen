import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static final long mod = 998244353;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			Pair[] pairs = new Pair[K];
			for (int i = 0; i < K; i++) {
				int from = sc.nextInt();
				int to = sc.nextInt();
				pairs[i] = new Pair(from, to);
			}
			Arrays.sort(pairs);
			int idx = K;
			long[] arr = new long[N + 1];
			long[] sum = new long[N + 1];
			arr[1] = 1;
			sum[1] = 1;
			for (int i = 2; i <= N; i++) {
				for (int j = 0; j < idx; j++) {
					if (pairs[j].x >= i) {
						continue;
					}
					int from = Math.max(0, i - pairs[j].y - 1);
					arr[i] += (sum[i - pairs[j].x] - sum[from]);
					arr[i] %= mod;
				}
				sum[i] = (sum[i - 1] + arr[i]) % mod;
			}
			System.out.println((arr[N] + mod) % mod);
		}
	}

	static class Pair implements Comparable {
		int x;
		int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int compareTo(Object x) {
			Pair other = (Pair) x;
			return this.x > other.x ? 1 : -1;
		}
	}
}