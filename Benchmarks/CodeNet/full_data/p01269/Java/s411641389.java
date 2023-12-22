import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Problem C: Brave Princess Revisited
 */
public class Main {

	static final int INF = 1 << 29;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line);

			int N, M, L;
			N = parseInt(st.nextToken());
			M = parseInt(st.nextToken());
			L = parseInt(st.nextToken());
			if ((N | M | L) == 0) break;

			Map<Integer, List<Edge>> G = new HashMap<>();

			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int A, B, D, E;
				A = parseInt(st.nextToken());
				B = parseInt(st.nextToken());
				D = parseInt(st.nextToken());
				E = parseInt(st.nextToken());
				G.putIfAbsent(A, new ArrayList<>());
				G.putIfAbsent(B, new ArrayList<>());
				G.get(A).add(new Edge(B, D, E));
				G.get(B).add(new Edge(A, D, E));
			}

			//???????????¨ -> [?????´][????????????]
			int[][] D = new int[N + 1][L + 1];
			Queue<int[]> pq = new PriorityQueue<>((x, y) -> Integer.compare(x[2], y[2]));

			for (int i = 0; i < D.length; i++) Arrays.fill(D[i], INF);
			D[1][L] = 0;
			pq.offer(new int[]{1, L, 0});

			while (!pq.isEmpty()) {

				int s, l, min;
				s = pq.peek()[0];
				l = pq.peek()[1];
				min = pq.peek()[2];
				pq.poll();

				if (D[s][l] < min) continue;

				outer:
				for (Edge e : G.get(s)) {
					for (int i = 0; i <= L; i++) {
						if (D[e.to][i] > D[s][i] + e.enemy) {
							D[e.to][i] = D[s][i] + e.enemy;
							pq.offer(new int[]{e.to, i, D[e.to][i]});
						}
						if (i >= e.distance) {
							if (D[e.to][i - e.distance] > D[s][i]) {
								D[e.to][i - e.distance] = D[s][i];
								pq.offer(new int[]{e.to, i - e.distance, D[e.to][i - e.distance]});
							}
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