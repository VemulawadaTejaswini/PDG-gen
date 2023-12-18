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

		int[] dx = {0, 0, -1, 1};
		int[] dy = {-1, 1, 0, 0};
		boolean[][] visit = new boolean[h][w];
		long ans = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (visit[i][j]) {
					continue;
				}
				long kuro = 0;
				long siro = 0;
				Queue<Integer> que = new ArrayDeque<Integer>();
				que.add(i * 1000 + j);
				visit[i][j] = true;
				while (!que.isEmpty()) {
					int cur = que.poll();
					int x = cur / 1000;
					int y = cur % 1000;
					if (s[x][y] == '#') {
						kuro++;
					} else {
						siro++;
					}
					for (int a = 0; a < 4; a++) {
						int xx = x + dx[a];
						int yy = y + dy[a];
						if (0 <= xx && xx < h && 0 <= yy && yy < w
								&& !visit[xx][yy] && s[x][y] != s[xx][yy]) {
							que.add(xx * 1000 + yy);
							visit[xx][yy] = true;
						}
					}
				}
				ans += kuro * siro;
			}
		}
		System.out.println(ans);
	}
}
