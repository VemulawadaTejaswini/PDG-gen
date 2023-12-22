import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		HashMap<Long, Item> set = new HashMap<>();
		Item[] items = new Item[K];
		for (int i = 0; i < K; i++) {
			items[i] = new Item(sc.nextInt(), sc.nextInt(), sc.nextInt());
			set.put(1L * items[i].x * 3001 + items[i].y, items[i]);
		}
		Arrays.sort(items, (a, b) -> a.x != b.x ? a.x - b.x : a.y - b.y);
		items = Arrays.copyOf(items, 2 * K + R + 1);
		int N = K;
		for (int i = 0; i < K; i++) {
			long pos = 1L * (items[i].x + 1) * 3001 + items[i].y;
			Item below = set.get(pos);
			if (below == null) {
				items[N] = new Item(items[i].x + 1, items[i].y, 0);
				items[i].below = items[N++];
			} else {
				items[i].below = below;
			}
		}
		Item prev = null;
		for (int i = 1; i <= R + 1; i++) {
			items[N] = new Item(i, C + 1, 0);
			if (prev != null) {
				prev.below = items[N];
			}
			prev = items[N++];
		}
		items = Arrays.copyOf(items, N);
		Arrays.sort(items, (a, b) -> a.x != b.x ? a.x - b.x : a.y - b.y);
		for (int i = 0; i < N; i++) {
			items[i].index = i;
		}
		long[][] dp = new long[N][4];
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < 4; j++) {
				// pick item i
				if (j < 3) {
					if (items[i+1].x == items[i].x) {
						dp[i+1][j+1] = Math.max(dp[i+1][j+1], dp[i][j] + items[i].w);
					}
					if (items[i].below != null) {
						dp[items[i].below.index][0] = Math.max(dp[items[i].below.index][0], dp[i][j] + items[i].w);
					}
				}
				
				// dont pick item i
				if (items[i+1].x == items[i].x) {
					dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j]);
				}
				if (items[i].below != null) {
					dp[items[i].below.index][0] = Math.max(dp[items[i].below.index][0], dp[i][j]);
				}
			}
		}
		long ans = 0;
		for (int i = 0; i < 4; i++)
			ans = Math.max(ans, dp[N-1][i]);
		System.out.println(ans);
	}
	static class Item {
		int index;
		int x, y;
		long w;
		Item below;
		Item(int x, int y, long w) {
			this.x = x;
			this.y = y;
			this.w = w;
		}
		
		@Override
		public String toString() {
			return x + " " + y + " " + w;
		}
	}
}
