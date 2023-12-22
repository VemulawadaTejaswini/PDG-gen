import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Stellar Performance of the Debunkey Family (Prim)
 */
public class Main {

	static Main main = new Main();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0 0")) {

			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int m = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			Graph graph = main.new Graph(n);

			for (int i = 0; i < m; ++i) {
				graph.addEdge(br.readLine());
			}
			System.out.println(graph.prim());

		}

	}

	class Graph {

		final int INFINITY = Integer.MAX_VALUE;
		final int UNREACHABLE = -1;

		int length;
		int[][] adjacency;

		Graph(int n) {

			length = n;
			adjacency = new int[length][length];
			for (int i = 0; i < length; ++i) {
				for (int j = 0; j < length; ++j) {
					adjacency[i][j] = INFINITY;
				}
			}

		}

		void addEdge(String info) {

			StringTokenizer st = new StringTokenizer(info);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			adjacency[a][b] = c;
			adjacency[b][a] = c;

		}

		int prim() {

			boolean[] checked = new boolean[length];
			int total, next;

			next = 0;
			total = 0;
			checked[next] = true;

			while (next != UNREACHABLE) {

				next = -1;
				int min = INFINITY;
				for (int i = 0; i < length; ++i) {
					if (checked[i]) {
						for (int j = 0; j < length; ++j) {
							if (!checked[j] && min > adjacency[i][j]) {
								min = adjacency[i][j];
								next = j;
							}
						}
					}
				}
				if (next != UNREACHABLE) {
					total += min;
					checked[next] = true;
				}
			}
			return total;
		}

	}

}