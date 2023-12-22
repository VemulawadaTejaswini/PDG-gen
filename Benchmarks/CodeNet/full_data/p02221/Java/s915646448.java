import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = 1 << N;
		char[] cs = sc.next().toCharArray();
		boolean[] winBig = new boolean[M - 1];
		for (int i = 0; i < M - 1; i++) {
			winBig[i] = cs[i] == '1';
		}
		int[][] winner = new int[N + 1][M];
		int[] P = new int[M];
		for (int i = 0; i < M; i++) {
			P[i] = Integer.parseInt(sc.next());
			winner[0][i] = P[i];
		}
		int len = 1;
		for (int i = 0; i < N; i++, len *= 2) {
			for (int j = 0; j < M; j++) {
				int p1 = winner[i][j];
				int p2 = winner[i][(j + len) % M];
				int hi = Math.max(p1, p2);
				int lo = Math.min(p1, p2);
				winner[i + 1][j] = winBig[hi - lo - 1] ? hi : lo;
			}
		}
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < M; i++) {
			writer.println(winner[N][i]);
		}
		writer.flush();
	}

}

