
import java.util.Scanner;

public class Main {
	
	static int h;
	static int w;
	static char [][]grid;
	static int []temp;
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 h = Integer.parseInt(sc.next());
		 w = Integer.parseInt(sc.next());
		
		 grid = new char[w+2][h+2];
		for(int i = 0 ;i < h ;i++) {
			String s = sc.next();
			for(int j = 0 ; j < w ; j++) {
				grid [j][i] = s.charAt(j);
			}
		}
		
		temp = new int [4];
		ans = 0;
		
		for(int i = 0; i < w ;i++) {
			for(int j = 0 ; j < h ;j++) {
				for(int k = 0; k < 4 ;k++) {
					temp[k] = 0;
				}

				if(grid[i][j] == '#') {
					continue;
				}
				else {
					dfs(i,j,0);
					dfs(i,j,1);
					dfs(i,j,2);
					dfs(i,j,3);
					
				ans = Math.max(ans, temp[0]+temp[1]+temp[2]+temp[3]+1);
				}
			}
		}
		
		System.out.println(ans);
	
		
	}
	
	static void dfs(int x, int y, int dir) {
		
		int []dx = {1,0,-1,0};
		int []dy = {0,1,0,-1};
		
		int px = dx[dir] + x;
		int py = dy[dir] + y;
		
		if(px < 0 || px >= w || py < 0 || py >= h) {
			return;
		}
		
		else if(grid[px][py] == '#') {
			return;
		}
		else {
		temp[dir]++;
		dfs(px,py,dir);

		}
	}
	}


