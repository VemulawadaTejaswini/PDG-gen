import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
 * 方針
 * 1. sをsrcに，aのコストでダイクストラ
 * 2. tをsrcに，bのコストでダイクストラ
 * 3. iの大きい淳に，s->i->tの中で一番小さいものを列挙する
 * 
 * @author "Haruhisa Ishida<haruhisa.ishida@gmail.com>"
 *
 */
public class Main {
	public static class Edge implements Comparable<Edge> {
		public int src, dst, cost;

		public Edge(int src, int dst, int cost) {
			this.src = src;
			this.dst = dst;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge arg0) {
			if (this.cost < arg0.cost) {
				return -1;
			} else if (this.cost > arg0.cost) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	int n, m, s, t;
	int[] u, v, a, b;
	int[][] aDist, bDist;
	int[] srcDistances, dstDistances;
	long[] score;

	public void showScore() {
		for (int i = 0; i < n; ++i) {
			System.out.println(score[i]);
		}
	}

	public void calcScore() {
		score = new long[n];
		score[n - 1] = 1000000000000000L - srcDistances[n - 1] - dstDistances[n - 1];
		for (int i = n - 2; i >= 0; --i) {
			if (score[i + 1] > 1000000000000000L - srcDistances[i] - dstDistances[i]) {
				score[i] = score[i + 1];
			} else {
				score[i] = 1000000000000000L - srcDistances[i] - dstDistances[i];
			}
		}
	}

	public void calcDistances() {
		srcDistances = new int[n];
		Arrays.fill(srcDistances, Integer.MAX_VALUE);
		srcDistances[s - 1] = 0;
		Set<Integer> calced = new HashSet<>();
		calced.add(s - 1);

		Queue<Edge> edges = new PriorityQueue<Edge>();
		for (int i = 0; i < n; ++i) {
			if (aDist[s - 1][i] > 0) {
				edges.add(new Edge(s - 1, i, aDist[s - 1][i]));
			}
		}

		while (!edges.isEmpty()) {
			Edge edge = edges.poll();
			if (srcDistances[edge.src] + edge.cost < srcDistances[edge.dst]) {
				srcDistances[edge.dst] = srcDistances[edge.src] + edge.cost;
				calced.add(edge.dst);
			}
			for (int i = 0; i < n; ++i) {
				if (aDist[edge.dst][i] > 0) {
					if (!calced.contains(i)) {
						edges.add(new Edge(edge.dst, i, aDist[edge.dst][i]));
					}
				}
			}
		}

		dstDistances = new int[n];
		Arrays.fill(dstDistances, Integer.MAX_VALUE);
		dstDistances[t - 1] = 0;
		calced.clear();
		calced.add(t - 1);

		edges.clear();
		for (int i = 0; i < n; ++i) {
			if (bDist[t - 1][i] > 0) {
				edges.add(new Edge(t - 1, i, bDist[t - 1][i]));
			}
		}

		while (!edges.isEmpty()) {
			Edge edge = edges.poll();
			if (dstDistances[edge.src] + edge.cost < dstDistances[edge.dst]) {
				dstDistances[edge.dst] = dstDistances[edge.src] + edge.cost;
				calced.add(edge.dst);
			}
			for (int i = 0; i < n; ++i) {
				if (bDist[edge.dst][i] > 0) {
					if (!calced.contains(i)) {
						edges.add(new Edge(edge.dst, i, bDist[edge.dst][i]));
					}
				}
			}
		}

	}

	public Main(Scanner in) {
		String[] tokens = in.nextLine().split(" ");
		n = Integer.parseInt(tokens[0]);
		m = Integer.parseInt(tokens[1]);
		s = Integer.parseInt(tokens[2]);
		t = Integer.parseInt(tokens[3]);

		u = new int[m];
		v = new int[m];
		a = new int[m];
		b = new int[m];
		for (int i = 0; i < m; ++i) {
			tokens = in.nextLine().split(" ");
			u[i] = Integer.parseInt(tokens[0]);
			v[i] = Integer.parseInt(tokens[1]);
			a[i] = Integer.parseInt(tokens[2]);
			b[i] = Integer.parseInt(tokens[3]);
		}

		aDist = new int[n][n];
		bDist = new int[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				aDist[i][j] = 0;
				bDist[i][j] = 0;
			}
		}
		for (int i = 0; i < m; ++i) {
			int src = u[i] - 1;
			int dst = v[i] - 1;
			int costA = a[i];
			int costB = b[i];
			aDist[src][dst] = costA;
			aDist[dst][src] = costA;
			bDist[src][dst] = costB;
			bDist[dst][src] = costB;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Main ins = new Main(in);
		ins.calcDistances();
		ins.calcScore();
		ins.showScore();
		in.close();
	}

}
