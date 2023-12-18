import java.util.Scanner;

//AtCoder Grand Contest 043
//A	Range Flip Find Route
public class Main {
	static char[][] g;
	static boolean[][] seen;
	static int H;
	static int W;
	static final int dx[] = { 1, 0 };
	static final int dy[] = { 0, 1 };

	static int maxMove = 0;
	static int maxSeenH = 0;
	static int maxSeenW = 0;
	static void dfs(int h, int w, int move, char wall) {
		seen[h][w] = true;
		if (move >= maxMove) {
			maxSeenH = h;
			maxSeenW = w;
			maxMove = move;
		}

		for (int dir = 0; dir < 2; dir++) {
			int nh = h + dx[dir];
			int nw = w + dy[dir];

			if (nh >= H || nw >= W) continue;
			if (g[nh][nw] == wall) continue;
			if (seen[nh][nw]) continue;

			dfs(nh, nw, move+1, wall);
		}
	}

	static void change(int sh, int sw, int eh, int ew) {
		for (int i = sh; i <= eh; i++) {
			for (int j = sw; j <= ew; j++) {
				if (g[i][j] == '.')
					g[i][j] = '#';
				else
					g[i][j] = '.';
			}
		}
		ans++;
	}

	static int ans = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = Integer.parseInt(sc.next());
		W = Integer.parseInt(sc.next());
		g = new char[H][W];
		for (int i = 0; i < H; i++) {
			String s = sc.next();
			for (int j = 0; j < W; j++) {
				g[i][j] = s.charAt(j);
			}
		}
		sc.close();

		if (g[0][0] == '#') {
			seen = new boolean[H][W]; maxSeenH = 0; maxSeenW = 0; maxMove = 0;
			dfs(0, 0, 0, '.');
			change(0, 0, maxSeenH, maxSeenW);
		}

		seen = new boolean[H][W]; maxSeenH = 0; maxSeenW = 0; maxMove = 0;
		dfs(0, 0, 0, '#');
		while (!seen[H - 1][W - 1]) {
			int h = maxSeenH;
			int w = maxSeenW;
			if (h < H) {
				h++;
			} else {
				w++;
			}
			seen = new boolean[H][W]; maxSeenH = 0; maxSeenW = 0; maxMove = 0;
			dfs(h, w, 0, '.');
			change(h, w, maxSeenH, maxSeenW);

			seen = new boolean[H][W]; maxSeenH = 0; maxSeenW = 0; maxMove = 0;
			dfs(0, 0, 0, '#');
		}
		System.out.println(ans);
	}
}
