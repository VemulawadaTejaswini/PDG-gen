import java.util.*;
public class Main {
	Scanner sc;
	int w;
	int h;
	int[][] map;
	P s;
	int count;
	boolean[][] visited;
	void run() {
		sc = new Scanner(System.in);
		while (true) {
			count =0;
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0 && h ==0) break;
			visited = new boolean[h+2][w+2];
			map = new int[h+2][w+2];
			for (int i=1;i<h+1;i++) {
				String str = sc.next();
				for (int j=1;j<w+1;j++) {
					visited[i][j] = false;
					if (str.charAt(j-1)=='.') visited[i][j] = true;
					else if(str.charAt(j-1)=='#') visited[i][j] = false;
					else if(str.charAt(j-1) == '@'){
						visited[i][j] = true;
						s = new P(j,i);
					}
					
					
				}
			}
			count = 0;
			solve(s);
			System.out.println(count);
			
		}
	}
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	void solve(P p) {
		count++;
		visited[p.y][p.x] = false;
		for (int i=0;i<4;i++) 
			if (visited[p.y+dy[i]][p.x+dx[i]]) solve(new P(p.x+dx[i],p.y+dy[i])); 
	}
		
	
	
	class P {
		int x;
		int y;
		P(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}