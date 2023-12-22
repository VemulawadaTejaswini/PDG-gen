import java.io.*;
public class Main {

	static int n, m;
	static int[] dx = {0,0,-1,1}, dy = {-1,1,0,0};
	static boolean[][] map,check;

	private static int dfs(int y, int x) {
		int ret = 0;
		for (int d = 0 ; d < 4 ; d++) {
			int tx = x + dx[d];
			int ty = y + dy[d];
			if (tx < 0 || ty < 0 || tx >= m || ty >= n || !map[ty][tx] || check[ty][tx]) {
				continue;
			}
			check[ty][tx] = true;
			ret = Math.max(ret, 1 + dfs(ty, tx));
			check[ty][tx] = false;
		}
		return ret;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		while (true) {
			m = Integer.valueOf(s.readLine());
			n = Integer.valueOf(s.readLine());
			if (m == 0 && n == 0) break;
			map = new boolean[n][m];
			for (int i = 0 ; i < n ; i++) {
				String[] data = s.readLine().split(" ");
				for (int j = 0 ; j < m ; j++)
					map[i][j] = data[i].equals("1");
			}
			int max = 0;
			for (int i = 0 ; i < n ; i++) {
				for (int j = 0 ; j < m ; j++) {
					if (map[i][j]) {
						check = new boolean[n][m];
						max = Math.max(max, dfs(i, j));
					}
				}
			}
			out.println(max);
		}
		out.flush();
	}
}