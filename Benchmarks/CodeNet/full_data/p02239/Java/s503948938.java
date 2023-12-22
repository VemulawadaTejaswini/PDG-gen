import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		adjmatrix = new int[n+1][n+1];
		for (int i=0; i < n; i++) {
			String[] list = br.readLine().split(" ");

			int u = Integer.parseInt(list[0]);
			adjmatrix[u][0] = u;

			int k = Integer.parseInt(list[1]);
			for (int j=0; j < k; j++) {
				int vi = Integer.parseInt(list[2+j]);
				adjmatrix[u][vi] = 1;
			}
		}

		distance = new int[n+1];
		Arrays.fill(distance, -1);

		distance[1] = 0;
		deq.offer(adjmatrix[1]);

		while( ! deq.isEmpty() ) {
			int[] adjlist = deq.poll();
			int id = adjlist[0];
			for (int i = 1; i <= n; i++) {
				if (adjlist[i] == 1 && distance[i] == -1) {
					distance[i] = distance[id] + 1;
					deq.offer(adjmatrix[i]);
				}
			}
		}

		for (int id=1; id <= n; id++) {
			System.out.println(id + " " + distance[id]);
		}
	}

	static int[][] adjmatrix;

	static int[] distance;

	static ArrayDeque<int[]> deq = new ArrayDeque<>();

//	public static void search(int[][] adjmatrix, int i) {
//
//	}
}