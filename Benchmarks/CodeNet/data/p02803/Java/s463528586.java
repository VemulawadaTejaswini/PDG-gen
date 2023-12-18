import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		char[][] s = new char[h][w];
		for (int i = 0; i < h; i++) {
			s[i] = br.readLine().toCharArray();
		}
		br.close();

		int ans = 0;
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j] == '#') {
					continue;
				}
				int max = 0;
				int[][] d = new int[h][w];
				boolean[][] v = new boolean[h][w];
				Queue<Integer> que = new ArrayDeque<>();
				que.add(i * 100 + j);
				v[i][j] = true;
				while (!que.isEmpty()) {
					int cur = que.poll();
					int cx = cur / 100;
					int cy = cur % 100;
					for (int k = 0; k < 4; k++) {
						int nx = cx + dx[k];
						int ny = cy + dy[k];
						if (0 <= nx && nx < h && 0 <= ny && ny < w && !v[nx][ny] && s[nx][ny] == '.') {
							que.add(nx * 100 + ny);
							d[nx][ny] = d[cx][cy] + 1;
							v[nx][ny] = true;
							max = Math.max(max, d[nx][ny]);
						}
					}
				}
				ans = Math.max(ans, max);
			}
		}
		System.out.println(ans);
	}
}
