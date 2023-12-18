import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Dijkstra dj = new Dijkstra(n);

		for (int k = 0; k < n - 1; k++) {
			int i, j;
			i = sc.nextInt();
			j = sc.nextInt();

			dj.setE(i, j, sc.nextInt());
		}

		int q = sc.nextInt();
		int k = sc.nextInt();

		dj.dijkstra(k);
		long D[] = new long[n+1];
		for (int i = 0; i <= n; i++) {
			D[i] = dj.D[i];
		}

		for (int i = 0; i < q; i++) {
			System.out.println(dj.D[sc.nextInt()] + D[sc.nextInt()]);
		}

	}

	static class Dijkstra {
		int[][] e;
		boolean[] S;
		long D[];
		int n;
		int s;

		Dijkstra(int n) {
			this.n = n;
			e = new int[n+1][n+1];
			S = new boolean[n+1];
			D = new long[n+1];
		}

		void setE(int i, int j, int e) {
			this.e[i][j] = e;
			this.e[j][i] = e;
		}

		void dijkstra (int s) {
			this.s = s;
			for (int i = 1; i <= n; i++) {
				D[i] = Long.MAX_VALUE;
				S[i] = false;
			}
			D[s] = 0;
			for (int i = 1; i <= n; i++) {
				long min = Long.MAX_VALUE;
				int k = 0;
				for (int j = 1; j <= n; j++) {
					if (!S[j] && D[j] < min) {
						min = D[j];
						k = j;
					}
				}
				S[k] = true;
				for (int j = 1; j <= n; j++) {
					if (e[k][j] != 0 && !S[j]) {
						long temp = D[k] + e[k][j];
						D[j] = D[j] < temp ? D[j] : D[k] + e[k][j];
					}
				}
			}
		}
	}
}
