import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve();
	}

	void solve() {
		Scanner sc =  new Scanner(System.in);

		//上下左右
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};

		int H = sc.nextInt();
		int W = sc.nextInt();
		System.out.println(H +" " + W);

		char[][] charMap = new char[H][W];
		boolean[][] map = new boolean[H][W];

		Queue<Place> que = new ArrayDeque<Place>();

		// 入力文字列の抽出
		for (int i = 0; i < H; i++) {
			String s =  sc.next();
			charMap[i] = s.toCharArray();
			for (int j = 0; j < W; j++) {
				if (charMap[i][j] == '#') {
					que.add(new Place(i, j, 0));
					map[i][j] = true;
				}
			}
		}
		int max = 0;
		while (que.size() != 0){
			Place place = que.remove();

			for (int i = 0; i < 4; i++) {
				int x = place.getX() + dx[i];
				int y = place.getY() + dy[i];
				if (x < 0 || x >= H || y < 0 || y >= W) {
					continue;
				}
				if (! map[x][y]) {
					que.add(new Place(x,y, place.getCount() + 1));
					map[x][y] = true;
					max = place.getCount() + 1;
				}
			}
		}
		System.out.println(max);
	}

	// 場所を記憶
	class Place {
		private int x;
		private int y;
		private int count;

		public Place(int x, int y, int count) {
			this.x = x;
			this.y = y;
			this.count = count;
		}
		public int getX() {
			return this.x;
		}

		public int getY() {
			return this.y;
		}
		public int getCount() {
			return this.count;
		}
	}
}
