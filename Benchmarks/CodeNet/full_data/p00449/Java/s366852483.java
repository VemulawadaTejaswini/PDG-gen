import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static int[][] d;
	static final int INF = Integer.MAX_VALUE/2;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		while (true) {

			int n = Integer.parseInt(scan.next());
			int k = Integer.parseInt(scan.next());
			if(n==0) break;
			d = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					d[i][j] = i == j ? 0 : INF;
				}
			}

			for (int i = 0; i < k; i++) {
				int f = Integer.parseInt(scan.next());
				if (f == 0) {
					int a = Integer.parseInt(scan.next()) - 1, b = Integer
							.parseInt(scan.next()) - 1;
					out.println(d[a][b] == INF ? -1 : d[a][b]);
				} else {
					int a = Integer.parseInt(scan.next()) - 1, b = Integer
							.parseInt(scan.next()) - 1, cost = Integer
							.parseInt(scan.next());
					d[a][b] = d[b][a] = Math.min(d[a][b], cost);

					for (int j2 = 0; j2 < n; j2++) {
						for (int l = 0; l < n; l++) {
							d[j2][l] = Math.min(d[j2][l], d[j2][a] + d[a][l]);
							d[j2][l] = Math.min(d[j2][l], d[j2][b] + d[b][l]);
						}
					}

				}
			}
		}
		out.flush();
	}
}