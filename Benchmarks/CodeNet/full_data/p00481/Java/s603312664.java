

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	
	static int H,W,N,sx,sy,res=0;
	static char[][] map;
	static P[] points;
	static int[][] dis;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			res = 0;
			W = sc.nextInt();
			H = sc.nextInt();
			N = sc.nextInt();
			sc.nextLine();
			String temp;
			map = new char[H][];
			dis = new int[H][];
			points = new P[N+1];
			for (int i = 0; i < H; i++) {
				map[i] = new char[W];
				dis[i] = new int[W];
				temp = sc.nextLine();
				System.out.println(temp);
				for (int j = 0; j < W; j++) {
					map[i][j] = temp.charAt(j);
					dis[i][j] = 2<<10;
					if(map[i][j]=='S') {
						points[0] = new P(j,i);
						dis[i][j] = 0;
					}
					if(map[i][j]=='1') {
						points[1] = new P(j,i);
					}
					if(map[i][j]=='2') {
						points[2] = new P(j,i);
					}
					if(map[i][j]=='3') {
						points[3] = new P(j,i);
					}
					if(map[i][j]=='4') {
						points[4] = new P(j,i);
					}
					if(map[i][j]=='5') {
						points[5] = new P(j,i);
					}
					if(map[i][j]=='6') {
						points[6] = new P(j,i);
					}
					if(map[i][j]=='7') {
						points[7] = new P(j,i);
					}
					if(map[i][j]=='8') {
						points[8] = new P(j,i);
					}
					if(map[i][j]=='9') {
						points[9] = new P(j,i);
					}
					
				}
			}
			
			int res = 0;
			for (int i = 0; i < N; i++) {
				res += bfs(points[i],points[i+1]);
			}
			System.out.println(res);
			
	}
	
	
	public static int bfs(P p1,P p2) {
		Queue<P> que = new LinkedList<P>();
		que.offer(p1);
		int[][] _dis = new int[H][];
		for (int i = 0; i < _dis.length; i++) {
			_dis[i] = Arrays.copyOf(dis[i], dis[i].length);
		}
		_dis[p1.y][p1.x] = 0;
		
		
		
		while(!que.isEmpty()) {
			P p = que.poll();
			
			if(p.x==p2.x&&p.y==p2.y) break;
			
			for (int i = 0; i < 4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if(0<=nx&&0<=ny&&nx<W&&ny<H&&map[ny][nx]!='X'&&_dis[ny][nx] == 2<<10) {
					que.offer(new P(nx,ny));
					_dis[ny][nx] = _dis[p.y][p.x] +1;
				}
				
			}
		}
		
		return _dis[p2.y][p2.x];
	}
	

}

class P{
	int x;
	int y;
	
	public P() {
		super();
	}

	public P(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	
}





