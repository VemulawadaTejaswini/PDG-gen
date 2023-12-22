import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int H, W, N;
	static char[][] f;
	static int r, c;
	static int[][] pos;
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };

	static int dist(int rs, int cs, int rg, int cg) {
		boolean[][] visited = new boolean[H][W];
		ArrayList<Integer> cur = new ArrayList<Integer>();
		visited[rs][cs] = true;
		cur.add((rs << 10) + cs);
		int turn = 1;
		while (true) {
			ArrayList<Integer> next = new ArrayList<Integer>();
			for (int p : cur) {
				int r = p / 1024;
				int c = p % 1024;
				for (int i = 0; i < 4; ++i) {
					int nr = r + DR[i];
					int nc = c + DC[i];
					if (nr < 0 || H <= nr || nc < 0 || W <= nc) continue;
					if (visited[nr][nc] || f[nr][nc] == 'X') continue;
					if (rg == nr && cg == nc) return turn;
					visited[nr][nc] = true;
					next.add((nr << 10) + nc);
				}
			}
			++turn;
			cur = next;
		}
	}

	public static void main(String[] args) {
		H = sc.nextInt();
		W = sc.nextInt();
		N = sc.nextInt();
		f = new char[H][W];
		pos = new int[N + 1][2];
		for (int i = 0; i < H; ++i) {
			f[i] = sc.next().toCharArray();
			for (int j = 0; j < W; ++j) {
				char ch = f[i][j];
				if (ch == 'S') {
					pos[0][0] = i;
					pos[0][1] = j;
				} else if ('0' <= ch && ch <= '9') {
					pos[ch - '0'][0] = i;
					pos[ch - '0'][1] = j;
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < N; ++i) {
			ans += dist(pos[i][0], pos[i][1], pos[i + 1][0], pos[i + 1][1]);
		}
		System.out.println(ans);
	}

}