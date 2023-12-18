
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static char [][]grid;
	static int [][]graph;
	static int h;
	static int w;
	static Queue <Point> q ;
	static int ans;
	static Point start,goal;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 h = Integer.parseInt(sc.next());
		 w = Integer.parseInt(sc.next());
		
		grid = new char [h][w];
		graph = new int [h][w];
		int cnt = 0;
		
		for(int i = 0 ;i < h ;i++) {
			String s = sc.next();
			for(int j = 0 ; j < w ; j++) {
				grid[i][j] = s.charAt(j); 
				if(grid[i][j] == '.') {
					cnt++;
				}
			}
		}
		 start = new Point(0,0);
		 goal = new Point(h-1,w-1);
		graph[0][0] = 0; graph[h-1][w-1] = -1;
		q = new ArrayDeque<Point>();
		BFS(start);
		
		ans = graph[h-1][w-1];
		
		int ans1 = cnt - ans - 1 ;
		if(ans == -1) {
			System.out.println(ans);
			return;
		}
		
		System.out.println(ans1);
	}

	
	static void BFS(Point s) {
		
		
		int []dy = {0,1,0,-1};
		int []dx = {1,0,-1,0};
		
		grid[s.yGet()][s.xGet()] = '#';
		
		for(int i = 0 ; i < 4 ; i++) {
			Point p = new Point(s.xGet()+dx[i],s.yGet()+dy[i]);
			if(Search(p)) {
			graph[p.yGet()][p.xGet()] = graph[s.yGet()][s.xGet()] + 1; 
			q.add(p);
			}
		}
		
		if(q.size() == 0) {
			return ;
		}
		BFS(q.poll());
	}
	
	static boolean  Search(Point s) {

		if(s.xGet()< 0 || s.xGet() >= w || s.yGet() < 0 || s.yGet() >= h) {
			return false;
		}
		else if(grid[s.yGet()][s.xGet()] == '#') {
			return false;
		}
		else {
			return true;
		}
		
	}
}
class Point{
	private int x;
	private int y;
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int xGet() {
		return x;
	}
	public int yGet() {
		return y;
	}
	public boolean equal(Point p) {
		if(x == p.xGet() && y == p.yGet()) {
			return true;
		}
		else {
			return false;
		}
	}
}



