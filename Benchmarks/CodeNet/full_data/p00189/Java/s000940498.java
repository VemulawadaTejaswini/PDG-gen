import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final int MAX_CITY = 10;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			long[][] dist = new long[MAX_CITY][MAX_CITY];
			for (int i = 0; i < dist.length; i++) {
				for (int j = 0; j < dist[0].length; j++) {
					dist[i][j] = Integer.MAX_VALUE;
				}
			}
			for (int i = 0; i < MAX_CITY; i++) {
				dist[i][i] = 0;
			}
			int numEdge = sc.nextInt();
			if (numEdge == 0) break;
			int numCity = -1;
			for (int i = 0; i < numEdge; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				dist[a][b] = c;
				dist[b][a] = c;
				if (numCity < a)
					numCity = a;
				if (numCity < b)
					numCity = b;
			}
			numCity++;

			// フロイドワーシャル
			dist = floydwarshall(dist, numCity);

			// 全対最短経路情報をもとに解答を算出
			int home = -1;
			long sum = Integer.MAX_VALUE;
			for (int u = 0; u < numCity; u++) {
				long total = 0;
				for (int v = 0; v < numCity; v++) {
					total += dist[u][v];
				}
				if (total < sum) {
					sum = total;
					home = u;
				}
			}
			System.out.printf("%d %d\n", home, sum);
		}
		sc.close();
	}

	static long[][] floydwarshall(long[][] dist, int numCity) {
		for (int k = 0; k < numCity; k++) {
			for (int u = 0; u < numCity; u++) {
				if (dist[u][k] == Integer.MAX_VALUE)
					continue;
				for (int v = 0; v < numCity; v++) {
					long total = dist[u][k] + dist[k][v];
					if (total < dist[u][v])
						dist[u][v] = total;
				}
			}
		}
		return dist;
	}
}