
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Tuple implements Comparable<Tuple> {
		int src, dst, cost;

		Tuple(int src, int dst, int cost) {
			this.src = src;
			this.dst = dst;
			this.cost = cost;
		}

		@Override
		public int compareTo(Tuple o) {
			return Integer.compare(this.cost, o.cost);
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int H = Integer.parseInt(tokens[0]);
		int W = Integer.parseInt(tokens[1]);
		Tuple[][] cost = new Tuple[10][10];
		for (int i = 0; i < 10; ++i) {
			tokens = in.readLine().split(" ");
			for (int j = 0; j < 10; ++j) {
				cost[i][j] = new Tuple(i, j, Integer.parseInt(tokens[j]));
			}
		}
		int[][] distMatrix = new int[10][10];
		for (int i = 0; i < 10; ++i) {
			Arrays.fill(distMatrix[i], Integer.MAX_VALUE / 2);
			distMatrix[i][i] = 0;
		}

		// 対角成分以外をqueueに入れる
		Queue<Tuple> que = new PriorityQueue<>();
		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				if (i == j)
					continue;
				que.add(cost[i][j]);
			}
		}

		// 順に評価する
		while (!que.isEmpty()) {
			Tuple tuple = que.poll();
			// まず直接つなぐ部分を評価
			if (distMatrix[tuple.src][tuple.dst] > tuple.cost) {
				distMatrix[tuple.src][tuple.dst] = tuple.cost;
			}
			// 次に経由する部分を評価
			for (int src = 0; src < 10; ++src) {
				if (tuple.src == src || tuple.dst == src) {
					continue;
				}
				if (distMatrix[src][tuple.src] + tuple.cost < distMatrix[src][tuple.dst]) {
					distMatrix[src][tuple.dst] = distMatrix[src][tuple.src] + tuple.cost;
				}
			}
			for (int dst = 0; dst < 10; ++dst) {
				if (tuple.src == dst || tuple.dst == dst) {
					continue;
				}
				if (tuple.cost + distMatrix[tuple.dst][dst] < distMatrix[tuple.src][dst]) {
					distMatrix[tuple.src][dst] = tuple.cost + distMatrix[tuple.dst][dst];
				}
			}
		}

		// これをもとに置き換える
		int[][] A = new int[H][W];
		for (int i = 0; i < H; ++i) {
			tokens = in.readLine().split(" ");
			for (int j = 0; j < W; ++j) {
				A[i][j] = Integer.parseInt(tokens[j]);
			}
		}
		int result = 0;
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				if (A[i][j] == 1 || A[i][j] == -1) {
					continue;
				}
				result += distMatrix[A[i][j]][1];
			}
		}
		System.out.println(result);
	}

}
