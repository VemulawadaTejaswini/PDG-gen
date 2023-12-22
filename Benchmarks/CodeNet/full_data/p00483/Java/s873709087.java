import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int M = sc.nextInt();
		int N = sc.nextInt();
		int K = sc.nextInt();
		char[][] map = new char[M][];
		for (int i = 0; i < M; ++i) {
			map[i] = sc.next().toCharArray();
		}
		int[][] J = new int[M + 1][N + 1];
		int[][] O = new int[M + 1][N + 1];
		for (int i = 0; i < M; ++i) {
			for (int j = 0; j < N; ++j) {
				J[i + 1][j + 1] = J[i][j + 1] + J[i + 1][j] - J[i][j] + (map[i][j] == 'J' ? 1 : 0);
				O[i + 1][j + 1] = O[i][j + 1] + O[i + 1][j] - O[i][j] + (map[i][j] == 'O' ? 1 : 0);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < K; ++i) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			int c = Integer.parseInt(sc.next());
			int d = Integer.parseInt(sc.next());
			int jc = J[c][d] - J[a - 1][d] - J[c][b - 1] + J[a - 1][b - 1];
			int oc = O[c][d] - O[a - 1][d] - O[c][b - 1] + O[a - 1][b - 1];
			int ic = (d - b + 1) * (c - a + 1) - jc - oc;
			sb.append(jc + " " + oc + " " + ic + "\n");
		}
		System.out.print(sb);
	}
}