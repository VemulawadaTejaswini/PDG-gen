import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static final int[] dx = {-1,0,1,0};
	public static final int[] dy = {0,1,0,-1};
	public static final int INF = 10000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if (w == 0) {
				return;
			}
			int w2 = w*2+1;
			int h2 = h*2+1;
			int[][] m = new int[h2][w2];
			int[][] d = new int[h2][w2];
			for(int i=0;i<h2;i++) {
				for(int j=0;j<w2;j++) {
					m[i][j] = 1;
					d[i][j] = INF;
				}
			}
			sc.nextLine();
			for(int i=0;i<h2-2;i++) {
				String s = sc.nextLine();
				if (i%2 == 0) {
					s += " ";
					s = s.replace(' ', '0');
				}else{
					s = s.replace(' ', '1');
				}
				for(int j=0;j<w2-2;j++) {
					m[i+1][j+1] = s.charAt(j) - '0';
				}
			}
			Deque<Point> q = new ArrayDeque<Point>();
			d[1][1] = 0;
			q.offer(new Point(1,1));
			while(!q.isEmpty()) {
				Point p = q.poll();
				for(int i=0;i<4;i++) {
					int nx = p.x + dx[i];
					int ny = p.y + dy[i];
					if (m[nx][ny] == 0 && d[p.x][p.y] + 1 < d[nx][ny]) {
						d[nx][ny] = d[p.x][p.y] + 1;
						q.offer(new Point(nx,ny));
					}
				}
			}
			int dist = d[h2-2][w2-2];
			if (dist == INF) {
				System.out.println(0);
			}else{
				System.out.println(dist/2+1);
			}
		}
	}
}