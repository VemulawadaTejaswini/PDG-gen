import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int t = 1;
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int[][] ans = new int[N][N];
			int ord = 1;
			for (int i = 0; i < N; ++i) {
				int r = (i % 2 == 0 ? i : 0);
				int c = (i % 2 == 0 ? 0 : i);
				int dr = (i % 2 == 0 ? -1 : 1);
				int dc = (i % 2 == 0 ? 1 : -1);
				for (int j = 0; j <= i; ++j) {
					ans[r][c] = ord;
					++ord;
					r += dr;
					c += dc;
				}
			}
			System.out.println("Case " + t + ":");
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					System.out.printf("%3d", i + j < N ? ans[i][j] : N * N + 1 - ans[N - 1 - i][N - 1 - j]);
				}
				System.out.println();
			}
			++t;
		}
	}
}