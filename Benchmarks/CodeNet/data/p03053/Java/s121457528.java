import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		char[][] a = new char[H][W];
		String inputStr;
		// 初期状態の黒色のマス座標リスト
		ArrayList<Point033> firstBlackPoint = new ArrayList<Point033>();
		for(int i = 0; i < H; i++) {
			inputStr = scan.next();
			a[i] = inputStr.toCharArray();
		}
		scan.close();
		int[][] dist = new int[H][W];
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				dist[i][j] = -1;
				if(a[i][j] == '#') {
					firstBlackPoint.add(new Point033(j, i));
				}
			}
		}
		ArrayDeque<Point033> que = new ArrayDeque<Point033>();
		// スタート地点の登録（複数）
		for(Point033 p : firstBlackPoint) {
			que.add(p);
			dist[p.y][p.x] = 0;
		}
		int nextX, nextY;
		Point033 v;
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		int result = 0;
		while(!que.isEmpty()) {
			v = que.poll();
			for(int i = 0; i < 4; i++) {
				nextX = v.x + dx[i];
				nextY = v.y + dy[i];
				// 領域外である場合、スルー
				if(nextX < 0 || nextY < 0 || nextX >= W || nextY >= H) {
					continue;
				}
				// 黒色である場合、スルー
				if(a[nextY][nextX] =='#') {
					continue;
				}
				// 探索済みである場合、スルー
				if(dist[nextY][nextX] != -1) {
					continue;
				}
				que.add(new Point033(nextX, nextY));
				dist[nextY][nextX] = dist[v.y][v.x] + 1;
				if(dist[nextY][nextX] > result) {
					result = dist[nextY][nextX];
				}
			}
		}
		System.out.println(result);
	}

}
class Point033{
	int x;
	int y;
	Point033(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
