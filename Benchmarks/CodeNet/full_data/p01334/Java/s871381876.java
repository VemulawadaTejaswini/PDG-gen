import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[][] R, C;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			R = new int[N][N];
			C = new int[N][N];
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					C[i][j] = sc.nextInt();
					R[i][j] = sc.nextInt();
				}
			}
			int[][] visited = new int[N][N];
			int ans = 0;
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					if (visited[i][j] == 2) continue;
					int cr = i;
					int cc = j;
					boolean loop = false;
					while (true) {
						if (visited[cr][cc] == 2) break;
						if (visited[cr][cc] == 1) {
							loop = true;
							break;
						}
						visited[cr][cc] = 1;
						int nr = R[cr][cc];
						int nc = C[cr][cc];
						cr = nr;
						cc = nc;
					}
					if (loop) ++ans;
					cr = i;
					cc = j;
					while (visited[cr][cc] == 1) {
						visited[cr][cc] = 2;
						int nr = R[cr][cc];
						int nc = C[cr][cc];
						cr = nr;
						cc = nc;
					}
				}
			}
			System.out.println(ans);
		}
	}

}