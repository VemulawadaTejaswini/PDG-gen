import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int ans = -1;
		int[] H = new int[N+1];
		int a = 0;
		int b = 0;
		int[][] x = new int[N+1][N+1];
		for (int i = 1; i < N+1; i++) {
			H[i] = scan.nextInt();
		}
		for (int i = 0; i < M; i++) {
			a = scan.nextInt();
			b = scan.nextInt();

			if (H[a] <= H[b]) {
				x[a][b]++;
			}
			if (H[a] >= H[b]) {
				x[b][a]++;
			}
		}

		for (int i = 0; i < N+1; i++) {
			for (int j = 0; j < N+1; j++) {
				if (x[i][j] != 0) break;
				if (j == N-1) ans++;
			}
		}

		System.out.println(ans);
	}

}