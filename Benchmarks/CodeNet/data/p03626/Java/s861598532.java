import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	private static final long MOD = 1_000_000_007L;

	private static final int[][] counts = { { 3, 2, 1 }, { 6, 2, 3 } };

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			char[] s1 = scanner.next().toCharArray();
			char[] s2 = scanner.next().toCharArray();
			int i = 0, prev = 0;
			long result = 1L;
			while (i < n) {
				if (s1[i] == s2[i]) {
					// 縦の並び
					result = result * counts[0][prev] % MOD;
					prev = 1;
					i++;
				} else {
					// 横の並び
					result = result * counts[1][prev] % MOD;
					prev = 2;
					i += 2;
				}
			}
			System.out.println(result);
		}
	}

	/**
	 * @param pathLists ノード間の連結パス一覧の配列
	 * @param src       開始ノード
	 * @param n         ノードの数
	 * @return 開始ノードからの距離の配列
	 */
	private static long[] dijkstra(List<Path>[] pathLists, int src, int n) {
		long[] distances = new long[n];
		Arrays.fill(distances, Long.MAX_VALUE);
		// 最短距離が確定したかどうか
		boolean[] fixed = new boolean[n];
		Arrays.fill(fixed, false);
		// 出発地点までの距離を0とする
		distances[src] = 0L;
		Queue<Path> queue = new PriorityQueue<>();
		queue.add(new Path(src, src, 0));
		while (!queue.isEmpty()) {
			int now = queue.poll().to;
			if (!fixed[now]) {
				fixed[now] = true;
				for (Path path : pathLists[now]) {
					if (!fixed[path.to] && distances[path.to] > distances[now] + path.cost) {
						distances[path.to] = distances[now] + path.cost;
						queue.add(new Path(path.to, path.to, distances[path.to]));
					}
				}
			}
		}
		return distances;
	}

	/**
	 * ノード間の一つのパスを表すクラス
	 */
	private static class Path implements Comparable<Path> {
		/** 開始ノード */
		@SuppressWarnings("unused")
		int from;
		/** 終了ノード */
		int to;
		/** 移動コスト */
		long cost;

		Path(int from, int to, long cost) {
			super();
			this.from = from;
			this.to = to;
			this.cost = cost;
		}

		@Override
		public int compareTo(Path path) {
			if (this.cost > path.cost) {
				return 1;
			} else if (this.cost == path.cost) {
				return 0;
			} else {
				return -1;
			}
		}
	}
}
