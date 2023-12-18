import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String s;
		int dots=0;
		char c[][] = new char[h + 2][w + 2];
		for (int i = 0; i <= w + 1; i++) {
			c[0][i] = '#';
			c[h + 1][i] = '#';
		}
		for (int i = 1; i <= h; i++) {
			c[i][0] = '#';
			c[i][w + 1] = '#';
			s = sc.next();
			for (int k = 1; k <= w; k++) {

				c[i][k] = s.charAt(k - 1);
				if(c[i][k]=='.'){
					dots++;
				}
			}
		}

		int nTown = (h+2) * (w+2); // 都市の数
		int nRoute = (h - 1) * (w - 1); // 道路の数
		int[][] map = new int[nTown][nTown]; // 都市の接続関係のマップ
		for (int i = 0; i < nTown; i++)
			// 接続マップを初期化する
			for (int j = 0; j < nTown; j++)
				map[i][j] = (i == j) ? 0 : -1;
		// [i][k]=(i-1)*w+k

		for (int i = 1; i <= h; i++) {
			for (int k = 1; k <= w; k++) {
				if (c[i][k] == '.') {
					for (int j = 1; j <= 4; j++) {
						if (j == 1) {
							if (c[i][k + 1] == '.') {
								map[(i - 1) * w + k][(i - 1) * w + k + 1] = map[(i - 1)
										* w + k + 1][(i - 1) * w + k] = 1;
							}
						}

						if (j == 2) {
							if (c[i][k - 1] == '.') {
								map[(i - 1) * w + k][(i - 1) * w + k - 1] = map[(i - 1)
										* w + k - 1][(i - 1) * w + k] = 1;
							}
						}

						if (j == 3) {
							if (c[i + 1][k] == '.') {
								map[(i - 1) * w + k][i * w + k] = map[i* w+ k][(i - 1) * w + k] = 1;
							}

							if (j == 4) {
								if (c[i - 1][k] == '.') {
									map[(i - 1) * w + k][(i - 2) * w + k] = map[(i - 2)
											* w + k][(i - 1) * w + k] = 1;
								}
							}

						}
					}

				}
			}
		}
		int src = 1; // 出発地点
		int dst = h * w; // 到着地点
		int[] distance = new int[nTown]; // 各都市までの最短距離
		dijkstra(map, src, distance);
		if (distance[dst] == Integer.MAX_VALUE) { // 解なし
			System.out.println(-1);
		} else {

			System.out.println(dots-distance[dst]-1);
		}

	}

	public static void dijkstra(int[][] map, int src, int[] distance) {
		int nTown = distance.length;
		boolean[] fixed = new boolean[nTown]; // 最短距離が確定したかどうか
		for (int i = 0; i < nTown; i++) { // 各都市について初期化する
			distance[i] = Integer.MAX_VALUE; // 最短距離の初期値は無限遠
			fixed[i] = false; // 最短距離はまだ確定していない
		}
		distance[src] = 0; // 出発地点までの距離を0とする
		while (true) {
			// 未確定の中で最も近い都市を求める
			int marked = minIndex(distance, fixed);
			if (marked < 0)
				return; // 全都市が確定した場合
			if (distance[marked] == Integer.MAX_VALUE)
				return; // 非連結グラフ
			fixed[marked] = true; // その都市までの最短距離は確定となる
			for (int j = 0; j < nTown; j++) { // 隣の都市(i)について
				if (map[marked][j] > 0 && !fixed[j]) { // 未確定ならば
					// 旗の都市を経由した距離を求める
					int newDistance = distance[marked] + map[marked][j];
					// 今までの距離よりも小さければ、それを覚える
					if (newDistance < distance[j])
						distance[j] = newDistance;
				}
			}
		}
	}

	// まだ距離が確定していない都市の中で、もっとも近いものを探す
	static int minIndex(int[] distance, boolean[] fixed) {
		int idx = 0;
		for (; idx < fixed.length; idx++)
			// 未確定の都市をどれか一つ探す
			if (!fixed[idx])
				break;
		if (idx == fixed.length)
			return -1; // 未確定の都市が存在しなければ-1
		for (int i = idx + 1; i < fixed.length; i++)
			// 距離が小さいものを探す
			if (!fixed[i] && distance[i] < distance[idx])
				idx = i;
		return idx;
	}
}