import java.io.*;
import java.util.*;
class Solution {
	final int SIZE = 20;
	int[] dr = { 0, 1, 0, -1 };
	int[] dc = { 1, 0, -1, 0 };
	int w;
	int h;
	int[][] graph = new int[SIZE][SIZE];
	int ans;
	int sr;
	int sc;
	void compute() {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		while (true) {
			w = scanner.nextInt();
			h = scanner.nextInt();
			if (w == 0 && h == 0) {
				break;
			}
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					graph[i][j] = scanner.nextInt();
					if (graph[i][j] == 2) {
						sr = i;
						sc = j;
					}
				}
			}
			ans = 11;
			dfs(sr, sc, 0);
			if (ans <= 10) {
				System.out.println(ans);
			} else {
				System.out.println(-1);
			}
		}
		scanner.close();
	}

	void dfs(int r, int c, int step) {
		if (step == 10) {
			return;
		}
		for (int direction = 0; direction < 4; direction++) {
			int nr = r;
			int nc = c;
			int cnt = 0;
			while (nr >= 0 && nr < h && nc >= 0 && nc < w && graph[nr][nc] != 1) {
				if (graph[nr][nc] == 3) {
					ans = Math.min(ans, step + 1);
					return;
				}
				nr += dr[direction];
				nc += dc[direction];
				cnt++;
			}
			if (nr >= 0 && nr < h && nc >= 0 && nc < w && graph[nr][nc] == 1 && cnt > 1) {
				graph[nr][nc] = 0;
				dfs(nr - dr[direction], nc - dc[direction], step + 1);
				graph[nr][nc] = 1;
			}
		}
	}
}
public class Main {
	public static void main(String args[]) {
		Solution solution = new Solution();
		solution.compute();
	}
}

