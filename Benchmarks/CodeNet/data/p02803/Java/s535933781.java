
import java.util.Scanner;

public class Main {
	
	static char [][]grid;
	static int inf = 1000000000;
	static int h,w;
	static boolean [][]graph;
	static int cnt;
	static int max;
	static boolean flag;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 h =Integer.parseInt(sc.next());
		 w =Integer.parseInt(sc.next());
		
		grid = new char [h][w];
		
		for(int i = 0 ;i < h ;i++) {
			String s = sc.next();
			for(int j = 0; j < s.length();j++) {
				grid[i][j] = s.charAt(j);
			}
		}
		int ans = -1;
		for(int i = 0; i < h ;i++) {
			for(int j = 0 ;j < w; j++) {
				for(int k = 0 ;k < h ;k++) {
					for(int l = 0 ; l < w ;l++) {
						if(grid[k][l] != '#') {
							int gx = l;
							int gy = k;
							flag = false;
							graph = new boolean [h][w];
							cnt = 0;
							max = inf;
			 				dfs(i,j,gx,gy);
			 				if(max ==  inf) {
			 					continue;
			 				}
			 				ans = Math.max(ans, max);
						}
					}
				}
			}
		}
		
		System.out.println(ans);
	}

    static void dfs(int y,int x,int gx,int gy) {
    	
    	if(x < 0 || y < 0 || x >= w || y >= h) {
    		return;
    	}
    	if(graph[y][x]) {
    		return ;
    	}
    	if(grid[y][x] == '#') {
    		return;
    	}
    	if(x == gx && y == gy) {
    		max = Math.min(cnt, max);
    		return;
    	}
    	
    	graph[y][x] = true;
    	
    	int []dx = {0,1,0,-1};
    	int []dy = {1,0,-1,0};
    	
    	for(int i = 0 ;i < 4; i++) {
    		int px = x + dx[i];
    		int py = y + dy[i];	
    		cnt++;
    		dfs(py,px,gx,gy);
    		cnt--;
    	}
    	
    	graph[y][x] = false;
    	 
    }

	

}
