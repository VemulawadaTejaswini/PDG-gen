import java.util.*;

class Main {
	public static int map[][];
	public static int t, n;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			t = sc.nextInt();
			n = sc.nextInt();
			if (t == 0 && n ==0) {
				break;
			}
			map = new int[100][100];
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					map[i][j] = 1 << 30;
				}
			}
			for (int i = 0; i < n; i++) {
				map[sc.nextInt() + 50][sc.nextInt() + 50] = -1;
			}
			saiki(sc.nextInt() + 50, sc.nextInt() + 50, 0);
			int ans = 0;
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					if (map[i][j] >= 0 && map[i][j] != 1 << 30) {
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}

	public static int dx[] = {0,1,1,0,-1,-1};
	public static int dy[] = {1,1,0,-1,-1,0};
	
	public static void saiki(int x, int y, int turn){
		if (t < turn) {
			return;
		}
		map[x][y] = turn;
		for (int i = 0; i < 6; i++) {
			if (map[x + dx[i]][y + dy[i]] > turn) {
				saiki(x + dx[i], y + dy[i], turn + 1);
			}
		}
		return;
	}
}