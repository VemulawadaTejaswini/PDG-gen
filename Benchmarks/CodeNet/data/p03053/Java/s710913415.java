
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main{
	
	static int h,w;
	static Deque <Point> que;
	static char [][]map;
	static int d[][];
	static boolean [][]visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		h = Integer.parseInt(sc.next());
		w = Integer.parseInt(sc.next());
		
		map = new char [h][w];
		d = new int [h][w];
		visit = new boolean [h][w];
		
		for(int i = 0 ; i < h ;i++) {
			String s = sc.next();
			for(int j = 0 ; j < w ;j++) {
				map[i][j] = s.charAt(j);
				d[i][j] = 1000000000;
			}
		}
		
		
		que = new ArrayDeque<Point>();
		
		for(int i = 0 ; i < h ;i++) {
			for(int j = 0 ; j < w ;j++) {
				if(map[i][j] == '#') {
					que.addLast(new Point(i,j));
					d[i][j] = 0;
					visit[i][j] = true;
				}
			}
		}
		BFS(que.poll());
		int max = 0;
		
		for(int i = 0 ; i < h ;i++) {
			for(int j = 0 ; j < w ;j++) {
				max = Math.max(d[i][j], max);
			}
		}
		
		System.out.println(max);
	}
	
	static void BFS(Point e) {
		
		int x = e.getX();  int y = e.getY();
		
		int []dx = {1,0,-1,0};
		int []dy = {0,1,0,-1};
		
		for(int i = 0 ; i < 4 ;i++) {
			if(dy[i] + y < 0 || dy[i] + y >= h) {
				continue;
			}
			if(dx[i] + x < 0 || dx[i] + x >= w) {
				continue;
			}
			int py = dy[i] + y;
			int px = dx[i] + x;
			if(visit[py][px]) {
				continue;
			}
			d[py][px] = d[y][x] + 1;
			visit[py][px] = true;
			que.addLast(new Point(py,px));
		}
		
		if(que.size() == 0) {
			return;
		}
		
		BFS(que.poll());
		
	}
}
class Point {
	private int y;
	private int x;
	
	public Point(int y , int x) {
		this.y = y;
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public int getX() {
		return x;
		}
	}

