import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * A Reward for a Carpenter
 */
public class Main {

	static Main main = new Main();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Integer.parseInt(line);
			int m = Integer.parseInt(br.readLine());
			Graph graph = main.new Graph(n);

			for (int i = 0; i < m; ++i) {
				graph.addEdges(br.readLine());
			}

			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
			int s = Integer.parseInt(st.nextToken());// start
			int g = Integer.parseInt(st.nextToken());// goal
			int b = Integer.parseInt(st.nextToken());// budget
			int p = Integer.parseInt(st.nextToken());// pillar

			//
			int way, back;
			way = graph.dijkstra(s, g);
			back = graph.dijkstra(g, s);

			System.out.println(b - p - way - back);

		}
	}

	class Graph {

		int length;
		int[][] adjacency;

		Graph(int n) {
			length = n + 1;
			adjacency = new int[length][length];
			for (int i = 1; i < length; ++i) {
				for (int j = 1; j < length; ++j) {
					adjacency[i][j] = -1;
				}
			}
		}

		void addEdges(String info) {
			StringTokenizer st = new StringTokenizer(info, ",");
			int a, b, c, d;
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());

			adjacency[a][b] = c;
			adjacency[b][a] = d;

		}

		int dijkstra(int start, int goal) {

			boolean[] checked = new boolean[length];
			int[] total = new int[length];
			int next;

			for (int i = 1; i < length; ++i) {
				total[i] = Integer.MAX_VALUE;
			}

			total[start] = 0;
			next = start;
			while (next != -1) {

				int s = next;
				checked[s] = true;

				for (int g = 1; g < length; ++g) {
					if (adjacency[s][g] != -1) {
						if (total[g] > total[s] + adjacency[s][g]) {
							total[g] = total[s] + adjacency[s][g];
						}
					}
				}

				int min = Integer.MAX_VALUE, idx = -1;
				for (int g = 1; g < length; ++g) {
					if (!checked[g] && min > total[g]) {
						min = total[g];
						idx = g;
					}
				}

				next = idx;
			}

			return total[goal];
		}
	}
}