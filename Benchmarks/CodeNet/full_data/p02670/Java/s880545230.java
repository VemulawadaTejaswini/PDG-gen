import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int n2 = n * n;
		int[] p = new int[n2];
		sa = br.readLine().split(" ");
		for (int i = 0; i < n2; i++) {
			p[i] = Integer.parseInt(sa[i]) - 1;
		}
		br.close();

		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(a[i], 1);
		}
		int[][] b = new int[n][n];
		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				int ni = n - 1 - i;
				int nj = n - 1 - j;
				b[i][j] = Math.min(i, j);
				b[i][j] = Math.min(b[i][j], ni);
				b[i][j] = Math.min(b[i][j], nj);
			}
		}

		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		int ans = 0;
		for (int i = 0; i < n2; i++) {
//			System.out.println(p[i]);
//			for (int j = 0; j < n; j++) {
//				for (int j2 = 0; j2 < n; j2++) {
//					System.out.print(b[j][j2] + "\t");
//				}
//				System.out.println();
//			}

			int x = p[i] / n;
			int y = p[i] % n;
			ans += b[x][y];
			a[x][y] = 0;
			Queue<Integer> que = new ArrayDeque<>();
			que.add(p[i]);
			while (!que.isEmpty()) {
				int cur = que.poll();
				int cx = cur / n;
				int cy = cur % n;
				for (int k = 0; k < 4; k++) {
					int nx = cx + dx[k];
					int ny = cy + dy[k];
					int alt = b[cx][cy] + a[cx][cy];
					if (0 <= nx && nx < n && 0 <= ny && ny < n
							&& alt < b[nx][ny]) {
						que.add(nx * n + ny);
						b[nx][ny] = alt;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
