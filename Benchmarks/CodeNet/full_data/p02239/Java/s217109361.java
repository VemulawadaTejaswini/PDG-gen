import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Main {

	static int n;

	static int[] v;

	static int[][] graph;

	static int time;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		graph = new int[n][n];

		v = new int[n];

		Arrays.fill(v, Integer.MAX_VALUE);

		for (int i = 0; i < n; i++) {
			String[] u_k_v = br.readLine().split(" ");

			int u = Integer.parseInt(u_k_v[0]);

			for (int k = 0; k < Integer.parseInt(u_k_v[1]); k++) {

				graph[u - 1][Integer.parseInt(u_k_v[2 + k]) - 1] = 1;

			}
		}

		Deque<Integer> q = new ArrayDeque<>();

		q.offer(0);

		v[0] = 0;

		while (!(q.isEmpty())) {
			int node = q.poll();

			for (int j = 0; j < n; j++) {

				if (graph[node][j] == 1 && v[j] > v[node] + 1) {

					v[j] = v[node] + 1;

					q.offer(j);

				}

			}

		}
		for (int i = 0; i < n; i++) {
			if (!(i == 0)) {
				System.out.println((i + 1) + " " + (v[i] == Integer.MAX_VALUE ? "-1" : v[i]));
			} else {
				System.out.println((i + 1) + " " + v[i]);
			}
		}

	}

}