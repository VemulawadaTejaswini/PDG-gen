import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			Path[] paths = new Path[m];
			IntStream.range(0, m).forEach(
					// 最長距離を計算するため、距離をマイナスにする
					i -> paths[i] = new Path(scanner.nextInt() - 1, scanner.nextInt() - 1, -scanner.nextLong()));
			long[] distances = bellmanFord(paths, 0, n);
			if (Long.MIN_VALUE == distances[n - 1]) {
				System.out.println("inf");
			} else {
				System.out.println(-distances[n - 1]);
			}
		}
	}

	/**
	 * https://www.geeksforgeeks.org/bellman-ford-algorithm-dp-23/ を参考に作成
	 * 
	 * @param paths ノード間の連結パス一覧の配列
	 * @param src   開始ノード
	 * @param n     ノードの数
	 * @return 開始ノードからの距離の配列
	 */
	private static long[] bellmanFord(Path[] paths, int src, int n) {
		int m = paths.length;
		long[] distances = new long[n];
		Arrays.fill(distances, Long.MAX_VALUE);
		distances[src] = 0;

		IntStream.range(1, n).forEach(i -> IntStream.range(0, m).forEach(j -> {
			int from = paths[j].from, to = paths[j].to;
			long cost = paths[j].cost;
			if (distances[from] != Long.MAX_VALUE && distances[from] + cost < distances[to]) {
				distances[to] = distances[from] + cost;
			}
		}));

		for (int j = 0; j < m; ++j) {
			int from = paths[j].from;
			if (distances[from] != Long.MAX_VALUE && distances[from] + paths[j].cost < distances[paths[j].to]) {
				// マイナスのループを含まれている
				distances[n - 1] = Long.MIN_VALUE;
				break;
			}
		}
		return distances;
	}

	/**
	 * ノード間の一つのパスを表すクラス
	 */
	private static class Path implements Comparable<Path> {
		/** 開始ノード */
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
			long costDiff = this.cost - path.cost;
			return (costDiff > 0) ? 1 : (costDiff < 0) ? -1 : 0;
		}
	}
}
