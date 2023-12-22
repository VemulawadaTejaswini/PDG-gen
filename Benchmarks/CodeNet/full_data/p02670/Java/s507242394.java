import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

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

		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		int ans = 0;
		for (int i = 0; i < n2; i++) {
			int[][] d = new int[n][n];
			for (int j = 0; j < n; j++) {
				Arrays.fill(d[j], 512);
			}
			int x = p[i] / n;
			int y = p[i] % n;
			d[x][y] = 0;
			a[x][y] = 0;
			Deque<Integer> que = new ArrayDeque<>();
			que.add(p[i]);
			label:
			while (!que.isEmpty()) {
				int cur = que.poll();
				int cx = cur / n;
				int cy = cur % n;
				for (int k = 0; k < 4; k++) {
					int nx = cx + dx[k];
					int ny = cy + dy[k];
					if (0 <= nx && nx < n && 0 <= ny && ny < n) {
						int alt = d[cx][cy] + a[nx][ny];
						if (alt < d[nx][ny]) {
							if (alt == d[cx][cy]) {
								que.addFirst(nx * n + ny);
							} else {
								que.addLast(nx * n + ny);
							}
							d[nx][ny] = alt;
						}
					} else {
						ans += d[cx][cy];
						break label;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
