import java.util.ArrayDeque;
import java.util.Scanner;

class Pos{
	int h, w;
	public Pos(int _h, int _w) {
		h = _h; w = _w;
	}
}
class Main{
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt();
		char[][] map = new char[H][W];
		for(int i = 0; i < H; i++) {
			String S = sc.next();
			for(int j = 0; j < W; j++) map[i][j] = S.charAt(j);
		}
		boolean check = true;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(map[i][j] == '.') continue;
				ArrayDeque<Pos> que = new ArrayDeque<Pos>();
				int cnt = 0;
				que.add(new Pos(i, j));
				map[i][j] = '.';
				while(!que.isEmpty()) {
					Pos now = que.poll();
					cnt++;
					for(int k = 0; k < 4; k++) {
						if(now.h + dx[k] < 0 || now.w + dy[k] < 0 || now.h + dx[k] >= H || now.w + dy[k] >= W) continue;
						if(map[now.h + dx[k]][now.w + dy[k]] == '#') {
							map[now.h + dx[k]][now.w + dy[k]] = '.';
							que.add(new Pos(now.h + dx[k], now.w + dy[k]));
						}
					}
				}
				if(cnt == 1) check = false;
			}
		}
		System.out.println(check ? "Yes" : "No");
	}
}