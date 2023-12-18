import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] maze = new char[H][W];
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		int[][] d = new int[H][W];
		int count = 0;

		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				d[i][j] = -1;
			}
			maze[i] = sc.next().toCharArray();
		}

		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) if(maze[i][j] == '#') count++;
		}

		d[0][0] = 1;
		Queue<pair> que = new ArrayDeque<pair>();
		que.add(new pair(0, 0));

		while(!que.isEmpty()) {
			pair p = que.poll();
			if(p.x == (H-1) && p.y == (W-1)) break;
			for(int i = 0; i < 4; i++) {
				int cx = p.x + dx[i];
				int cy = p.y + dy[i];
				if(cx >= 0 && cx <= H-1 && cy >= 0 && cy <= W-1 && maze[cx][cy] == '.'  && d[cx][cy] == -1) {
					d[cx][cy] = d[p.x][p.y] + 1;
					que.add(new pair(cx, cy));
				}
			}
		}

		if(d[H-1][W-1] != -1) {
			System.out.println(H*W - count - d[H-1][W-1]);
		}else {
			System.out.println(-1);
		}
		sc.close();
	}

	private static class pair{
		int x; int y;
		pair(int x, int y){
			this.x = x; this.y = y;
		}
	}
}