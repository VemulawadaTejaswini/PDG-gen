import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static long mod = 998244353;

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
			arr[1] = 1;
			for (int i = 1; i < N; i++) {
				if (i != 1 && arr[i] == 0) {
					continue;
				}

				for (int j = 0; j < idx; j++) {
					int from = pairs[j].x;
					if (i + from > N) {
						idx = j;
						break;
					}
					int to = pairs[j].y;
					for (int k = from; k <= to; k++) {
						if (i + k > N) {
							pairs[j].y = k - 1;
							break;
						} else {
							arr[i + k] = (arr[i] + arr[i + k]) % mod;
						}
					}
				}
			}
			System.out.println(arr[N]);
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