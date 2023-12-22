import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Princess in Danger
 */
public class Main {

	static final int INF = 1 << 29;
	static final int EMPTY = -1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		StringTokenizer st;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			st = new StringTokenizer(line);

			int N, M, _L, K, A, H;
			boolean[] L;
			Map<Integer, List<Edge>> G;
			int[][] D;      //????????????: [????±???????][?????????????????????????????????]
			boolean[][] V;  //?¨??????????????????????

			N = parseInt(st.nextToken());   //N: ????????°
			M = parseInt(st.nextToken());   //M: ???????????????????????§?????¶?????????
			_L = parseInt(st.nextToken());  //_L: ??????????¨??????????????????°
			K = parseInt(st.nextToken());   //K: ?????¨????????´??\?????¶???????????°
			A = parseInt(st.nextToken());   //A: ??¬?????????????????¨?????????
			H = parseInt(st.nextToken());   //H: ????§??§??????¬?????????????????¢?????????????????????
			if ((N | M | _L | K | A | H) == 0) break;

			//
			L = new boolean[N];
			L[A] = L[H] = true;

			if (_L > 0) {
				st = new StringTokenizer(br.readLine());
				for (int i = 0; i < _L; i++) {
					L[parseInt(st.nextToken())] = true;
				}
			}

			//
			G = new HashMap<>();

			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				if (!st.hasMoreTokens()) {
					st = new StringTokenizer(br.readLine());
				}
				int X, Y, T;
				X = parseInt(st.nextToken());
				Y = parseInt(st.nextToken());
				T = parseInt(st.nextToken());
				G.putIfAbsent(X, new ArrayList<>());
				G.putIfAbsent(Y, new ArrayList<>());
				G.get(X).add(new Edge(Y, T));
				G.get(Y).add(new Edge(X, T));
			}

			//
			D = new int[N][M + 1];
			V = new boolean[N][M + 1];

			for (int i = 0; i < N; i++) Arrays.fill(D[i], INF);
			D[A][M] = 0;

			//
			while (true) {

				int min = INF;
				int v = -1, s = -1;

				for (int i = 0; i < N; i++) {
					for (int j = 0; j <= M; j++) {
						if (!V[i][j] && D[i][j] < min) {
							min = D[i][j];
							v = i;
							s = j;
						}
					}
				}

				if (v == H || v == -1) break;
				V[v][s] = true;

				if (G.containsKey(v)) {
					for (Edge e : G.get(v)) {
						if (M >= e.time) {
							int m = (L[v] ? M - s : 0);
							for (int i = 0; i <= m; i++) {
								if ((s + i) - e.time >= 0
										&& D[e.to][(s + i) - e.time] > D[v][s] + e.time + i) {
									D[e.to][(s + i) - e.time] = D[v][s] + e.time + i;
								}
							}
						}
					}
				}
			}

			//
			int ans = INF;

			for (int i = 0; i <= M; i++) ans = Math.min(ans, D[H][i]);

			System.out.println(ans != INF ? ans : "Help!");
		}
	}
}

class Edge {

	int to, time;

	public Edge(int to, int time) {
		this.to = to;
		this.time = time;
	}
}