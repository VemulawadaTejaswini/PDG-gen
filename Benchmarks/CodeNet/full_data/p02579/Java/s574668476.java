import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.nextLine();
		int ch = sc.nextInt() -1;
		int  cw = sc.nextInt() -1;
		sc.nextLine();
		int dh = sc.nextInt() -1;
		int dw = sc.nextInt() -1;
		Point start = new Point(cw, ch);
		Point goal = new Point(dw, dh);
		// 迷路
		char[][] area = new char[h][w];
		for (int i = 0; i < h; i++) {
			sc.nextLine();
			char[] tmp = sc.next().toCharArray();
			for (int j = 0; j < tmp.length; j++) {
				area[i][j] = tmp[j];
			}
		}
		// キューを用意し、スタート地点をセット
		ArrayDeque<Point> dq = new ArrayDeque<>();
		dq.add(start);
		Point[] D5 = {new Point(0, 0), new Point(0, 1), new Point(-1, 0), new Point(0, -1), new Point(1, 0)};
		Point[] J25 = {new Point(0, 0), new Point(0, 1), new Point(-1, 0), new Point(0, -1), new Point(1, 0)
								, new Point(1, 1), new Point(-1, 1), new Point(1, -1), new Point(1, -1)
								, new Point(2, -2), new Point(2, -1), new Point(2, 0), new Point(2, 1)
								, new Point(2, 2), new Point(1, -2), new Point(1, 2), new Point(0, -2)
								, new Point(0, 2), new Point(-1, -2), new Point(-1, 2), new Point(-2, -2)
								, new Point(-2, -1), new Point(-2, 0), new Point(-2, 1), new Point(-2, 2)};
		ArrayDeque<Point> zeroDq = new ArrayDeque<>();
		zeroDq.add(start);
		
		int  cost = 0;
		//幅優先探索
		outer : while (true) {
			while (dq.size() > 0) {
				// コスト0で移動できる範囲をzeroDqに格納していく
				// 先頭キューを現在位置とする
				Point p = dq.removeFirst();
				for (int i = 0; i < 5; i++) {
					// 上下左右を確認・動けるマスをキューに追加
					int x = (int)(p.getX() + D5[i].getX());
					if (x > w - 1 || x < 0) continue;
					int y = (int)(p.getY()+D5[i].getY());
					if (y > h - 1 || y < 0) continue;
					if (area[y][x] == '.') {
						dq.addLast(new Point(x, y));
						if (!zeroDq.contains(new Point(x, y))) {
							zeroDq.add(new Point(x, y));
						}
						if (zeroDq.contains(goal)) {
							break outer;
						}
						// 到達可能マスは壁に
						area[y][x] = '#';
					}
				}
			}
			cost = cost + 1;
			// 移動B到達範囲を探索
			ArrayDeque<Point> newZeroDq = new ArrayDeque<>();
			while (zeroDq.size() > 0) {
				Point p = zeroDq.removeFirst();
				for (int i = 0; i < 25; i++) {
					// 上下左右を確認・動ける未踏マスをキューに追加
					int x = (int)(p.getX() + J25[i].getX());
					if (x > w - 1 || x < 0) continue;
					int y = (int)(p.getY()+J25[i].getY());
					if (y > h - 1 || y < 0) continue;
					if (area[y][x] == '.') {
						dq.addLast(new Point(x, y));
						newZeroDq.add(new Point(x, y));
					}
				}
			}
			if (dq.contains(goal)) break;
			if (dq.isEmpty()) {
				// 到達不能
				cost = -1;
				break outer;
			}
			zeroDq = newZeroDq;
		}
		System.out.println(cost);
	}
	
}
