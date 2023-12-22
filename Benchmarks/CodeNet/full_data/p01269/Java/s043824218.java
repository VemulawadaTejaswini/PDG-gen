import java.util.*;

import static java.lang.Math.min;

/**
 * Problem C: Brave Princess Revisited
 */
public class Main {

	static final int INF = 1 << 29;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			int N, M, L;
			N = sc.nextInt();
			M = sc.nextInt();
			L = sc.nextInt();
			if ((N | M | L) == 0) break;

			Map<Integer, List<Edge>> G = new HashMap<>();

			for (int i = 0; i < M; i++) {
				int A, B, D, E;
				A = sc.nextInt();
				B = sc.nextInt();
				D = sc.nextInt();
				E = sc.nextInt();
				G.putIfAbsent(A, new ArrayList<>());
				G.putIfAbsent(B, new ArrayList<>());
				G.get(A).add(new Edge(B, D, E));
				G.get(B).add(new Edge(A, D, E));
			}

			int[][] D = new int[N + 1][L + 1];
			boolean[][] V = new boolean[N + 1][L + 1];

			for (int i = 0; i < D.length; i++) Arrays.fill(D[i], INF);
			D[1][L] = 0;

			while (true) {

				int s = -1, l = -1, min = INF;

				for (int i = 1; i <= N; i++) {
					for (int j = 0; j <= L; j++) {
						if (!V[i][j] && D[i][j] < min) {
							min = D[i][j]; s = i; l = j;
						}
					}
				}

				if (min == INF) break;
				V[s][l] = true;

				for (Edge e : G.get(s)) {
					for (int i = 0; i <= L; i++) {
						D[e.to][i] = min(D[e.to][i], D[s][i] + e.enemy);
						if (i >= e.distance) {
							D[e.to][i - e.distance] = min(D[e.to][i - e.distance], D[s][i]);
						}
					}
				}
			}

			int min = INF;

			for (int i = 0; i <= L; i++) {
				min = Math.min(min, D[N][i]);
			}

			System.out.println(min);
		}
	}
}

class Edge {

	int to, distance, enemy;

	public Edge(int to, int distance, int enemy) {
		this.to = to;
		this.distance = distance;
		this.enemy = enemy;
	}
}