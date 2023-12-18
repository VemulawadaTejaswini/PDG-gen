import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int N;
	long[][] A, dist;
	long result = 0;

	static class Edge {
		int src, dst;
		long length;

		Edge(int src, int dst, long length) {
			this.src = src;
			this.dst = dst;
			this.length = length;
		}
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		A = new long[N][N];
		dist = new long[N][N];
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.readLine().split(" ");
			for (int j = 0; j < N; ++j) {
				A[i][j] = Long.parseLong(tokens[j]);
				dist[i][j] = A[i][j];
			}
		}
	}

	/**
	 * ワーシャルフロイドで最短距離を求める
	 */
	void calcDist() {
		for (int k = 0; k < N; ++k) {
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
	}

	boolean isNecessary(Edge edge) {
		boolean necessary = true;
		for (int i = 0; i < N; ++i) {
			if (i == edge.src || i == edge.dst) {
				continue;
			} else if (edge.length == dist[edge.src][i] + dist[i][edge.dst]) {
				necessary = false;
				break;
			}
		}
		return necessary;
	}

	void calc() {
		calcDist();
		Queue<Edge> que = new PriorityQueue<>(new Comparator<Edge>() {
			@Override
			public int compare(Edge o1, Edge o2) {
				return Long.compare(o1.length, o2.length);
			}
		});
		for (int i = 0; i + 1 < N; ++i) {
			for (int j = i + 1; j < N; ++j) {
				que.add(new Edge(i, j, A[i][j]));
			}
		}
		while (!que.isEmpty()) {
			Edge edge = que.poll();
			if (dist[edge.src][edge.dst] == edge.length) {
				if (isNecessary(edge)) {
					result += edge.length;
				}
			} else {
				result = -1;
				break;
			}
		}
	}

	void showResult() {
		System.out.println(result);
	}
}