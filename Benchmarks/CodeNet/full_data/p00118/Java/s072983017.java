import java.util.Scanner;

public class Main {
	static final int CHECK = 0;
	static final int RINGO = 1;
	static final int KAKI  = 2;
	static final int MIKAN = 3;
	
	int[][] field;
	int h, w;
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			h = scan.nextInt();
			w = scan.nextInt();
			if (h + w == 0)
				break;
			field = new int[h][];
			for (int i = 0; i < h; i++) {
				field[i] = new int[w];
				char[] fruit = scan.next().toCharArray();
				for (int j = 0; j < w; j++) {
					if (fruit[j] == '@')
						field[i][j] = RINGO;
					else if (fruit[j] == '#')
						field[i][j] = KAKI;
					else
						field[i][j] = MIKAN;
				}
			}
			int ans = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (field[i][j] != CHECK) {
						ans++;
						bfs(i, j, field[i][j]);
					}
				}
			}
			System.out.println(ans);
		}
	}

	void bfs(int y, int x, int f) {
		field[y][x] = CHECK;
		int[] dy = { 1, 0, -1,  0 };
		int[] dx = { 0, 1,  0, -1 };
		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny < 0 || nx < 0 || ny >= h || nx >= w)
				continue;
			if (field[ny][nx] != f)
				continue;
			bfs(y + dy[i], x + dx[i], f);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}