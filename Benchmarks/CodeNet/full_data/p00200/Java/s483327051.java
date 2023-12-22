import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Traveling Alone: One-way Ticket of Youth
 * 
 */
public class Main {

	static Main main = new Main();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0 0")) {

			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int m = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			Graph g = main.new Graph(m);

			for (int i = 0; i < n; ++i) {
				g.addEdge(br.readLine());
			}

			int k = Integer.parseInt(br.readLine());
			for (int i = 0; i < k; ++i) {
				System.out.println(g.getMinCost(br.readLine()));
			}
		}
	}

	class Graph {

		final int INFINITY = Integer.MAX_VALUE;
		final int NOT_EXIST = -1;

		Edge[][] matrix;

		Graph(int m) {
			matrix = new Edge[m + 1][m + 1];
		}

		void addEdge(String info) {

			int a, b, c, t;
			StringTokenizer st = new StringTokenizer(info);

			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			t = Integer.parseInt(st.nextToken());

			addEdge(a, b, c, t);
		}

		void addEdge(int a, int b, int cost, int time) {
			Edge e = new Edge(cost, time);
			matrix[a][b] = e;
			matrix[b][a] = e;
		}

		int getMinCost(String info) {
			int p, q, r;
			StringTokenizer st = new StringTokenizer(info);

			p = Integer.parseInt(st.nextToken());
			q = Integer.parseInt(st.nextToken());
			r = Integer.parseInt(st.nextToken());

			return getMinCost(p, q, r);
		}

		int getMinCost(int p, int q, int r) {

			boolean[] checked = new boolean[matrix.length];
			int[] total = new int[matrix.length];
			// ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
			int next;

			for (int i = 1; i < total.length; ++i) {
				total[i] = INFINITY;
			}
			total[p] = 0;

			//
			// queue.offer(p);
			next = p;
			while (next != NOT_EXIST) {

				int s = next;
				checked[s] = true;
				next = NOT_EXIST;

				int min = INFINITY;
				for (int g = 1; g < matrix.length; ++g) {
					if (matrix[s][g] != null && !checked[g]) {
						if (total[g] > total[s] + matrix[s][g].weight[r]) {
							total[g] = total[s] + matrix[s][g].weight[r];
						}
						if (total[g] < min) {
							min = total[g];
							next = g;
						}
					}
				}
				// if (next != NOT_EXIST) {
				// queue.offer(next);
				// }
			}

			return total[q];
		}
	}

	class Edge {
		int[] weight;

		Edge(int cost, int time) {
			weight = new int[] { cost, time };
		}
	}
}