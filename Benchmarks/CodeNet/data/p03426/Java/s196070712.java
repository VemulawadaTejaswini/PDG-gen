import java.util.Scanner;

public class abc089_d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), D = sc.nextInt();
		int row[] = new int[N * M], col[] = new int[N * M];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				int k = sc.nextInt() - 1;
				row[k] = i;
				col[k] = j;
			}
		}
		int O[][] = new int[D][N * M / D + 1];
		int P[][] = new int[D][N * M / D + 1];
		for (int r = 0; r < D; r++) {
			for (int k = 1; k * D + r < N * M; k++) {
				int f = (k - 1) * D + r;
				int s = k * D + r;
				O[r][k] = Math.abs(row[f] - row[s]) + Math.abs(col[f] - col[s]);
			}
		}
		for (int r = 0; r < D; r++) {
			for (int k = 1; k * D + r < N * M; k++) {
				P[r][k] = P[r][k - 1] + O[r][k];
			}
		}
		int Q = sc.nextInt();
		while (Q-- > 0) {
			int l = sc.nextInt() - 1, r = sc.nextInt() - 1;
			System.out.println(P[r % D][r / D] - P[l % D][l / D]);
		}
	}

}