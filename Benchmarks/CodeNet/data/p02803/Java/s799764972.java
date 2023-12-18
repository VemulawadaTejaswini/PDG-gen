import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.Point;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		// 迷路を受け取る
		String[][] map = new String[h][w];
		String[][] copy = new String[h][w];
		for (int i = 0; i < map.length; i++) {
			map[i] = in.next().split("");
			copy[i] = Arrays.copyOf(map[i], map[i].length);
		}
		// スタートを決める
		int max = 0;
		for (int l = 0; l < w; l++) {
			for (int m = 0; m < h; m++) {
				Point start = new Point(l, m);
				int move = bfs(h, w, start, map);
				if (max < move) {
					max = move;
				}
				for (int i = 0; i < map.length; i++) {
					map[i] = Arrays.copyOf(copy[i], copy[i].length);
				}
			}
		}
		System.out.println(max);
	}

	static int bfs(int h, int w, Point start, String[][] map) {
		// Queueを用意し、スタート地点を入れる
		ArrayDeque<Point> dq = new ArrayDeque<>();
		dq.add(start);
		// 各地点のスタート地点からの距離を記録する二次元配列
		int[][] moves = new int[h][w];

		if(map[(int) start.getY()][(int) start.getX()].equals("#")){
			return -1;
		}
		// スタート地点を"#"で埋めて、探索済みにする
		map[(int) start.getY()][(int) start.getX()] = "#";

		// 4方向
		Point[] D4 = { new Point(0, -1), new Point(1, 0), new Point(0, 1), new Point(-1, 0) };

		int max = 0;
		// 幅優先探索
		while (dq.size() > 0) {
			Point p = dq.removeFirst();
			for (int i = 0; i < 4; i++) {
				int x = (int) p.getX() + (int) D4[i].getX();
				int y = (int) p.getY() + (int) D4[i].getY();

				if (x > -1 && x < w && y > -1 && y < h && map[y][x].equals(".")) {

					// "."であれば探索可能なので、Queueの末尾に追加する
					dq.addLast(new Point(x, y));

					// 探索が終わった座標を"#"で埋めて、次回以降探索しないようにする
					map[y][x] = "#";

					// 座標pからpの四方の座標への移動距離は、pまでの移動距離+1
					moves[y][x] = moves[(int) p.getY()][(int) p.getX()] + 1;
					if(max < moves[y][x]){
						max = moves[y][x];
					}
				}
			}
		}
		return max;
	}
}
