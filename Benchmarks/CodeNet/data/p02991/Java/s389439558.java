import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		ArrayList<ArrayList<Integer>> edge = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			edge.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			int u = Integer.parseInt(str[0]) - 1;
			int v = Integer.parseInt(str[1]) - 1;

			edge.get(u).add(v);
		}

		str = br.readLine().split(" ");
		int s = Integer.parseInt(str[0]) - 1;
		int t = Integer.parseInt(str[1]) - 1;

		int dist[][] = new int[n][3];
		Queue<Integer> queueV = new ArrayDeque<>();
		Queue<Integer> queueK = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		}

		dist[s][0] = 0;
		queueV.add(s);
		queueK.add(0);

		while (!queueV.isEmpty() || !queueK.isEmpty()) {
			int v = queueV.poll();
			int k = queueK.poll();

			for (int u : edge.get(v)) {
				int nextk = (k + 1) % 3;
				if (dist[u][nextk] != Integer.MAX_VALUE)
					continue;
				dist[u][nextk] = dist[v][k] + 1;
				queueV.add(u);
				queueK.add(nextk);
			}
		}

		int ans = dist[t][0];
		if (ans == Integer.MAX_VALUE)
			ans = -1;
		else
			ans /= 3;
		System.out.println(ans);
	}
}
