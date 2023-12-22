import java.io.*;
public class Main {

	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static int[][] map;
	static int n, m;

	public static void main(String[] args) throws IOException {
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		while (true) {
			m = Integer.valueOf(s.readLine());
			n = Integer.valueOf(s.readLine());
			if (m == 0 && n == 0) break;
			map = new int[n][m];
			for (int i = 0 ; i < n ; i++) {
				String[] data = s.readLine().split(" ");
				for (int j = 0 ; j < m ; j++)
					map[i][j] = Integer.valueOf(data[j]);
			}
			int max = 0;
			for (int i = 0 ; i < n ; i++) {
				for (int j = 0 ; j < m ; j++) {
					if (map[i][j] == 1) {
						boolean[][] broken = new boolean[n][m];
						max = Math.max(max, dfs(i, j, broken));
					}
				}
			}
			out.println(max);
		}
		out.flush();
	}

	private static int dfs(int y, int x, boolean[][] brk) {
		int ret = 0;
		for (int d = 0 ; d < 4 ; d++) {
			int tx = x + dx[d];
			int ty = y + dy[d];
			if (tx < 0 || ty < 0 || tx >= m || ty >= n || map[ty][tx] == 0 || brk[ty][tx]) {
				continue;
			}
			brk[ty][tx] = true;
			ret = Math.max(ret, 1 + dfs(ty, tx, brk));
			brk[ty][tx] = false;
		}
		return ret;
	}
}