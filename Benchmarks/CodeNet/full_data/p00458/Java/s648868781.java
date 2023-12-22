import java.util.Scanner;



public class Main {
	final int[][] ofs = {
			{1, 0}, {0,-1}, {-1, 0}, {0, 1}
	};
	int dfs(boolean map[][], int y, int x, int c){
		int max = c+1;
		map[y][x] = false;
		
		for(int i=0; i<4; ++i){
			int nx = x + ofs[i][0];
			int ny = y + ofs[i][1];
			if((0<=ny && ny<map.length) && (0<=nx && nx<map[0].length)){
				if(map[ny][nx]){
					int tmp = dfs(map, ny, nx, c+1);
					if(max<tmp){
						max = tmp;
					}
				}
			}
		}
		map[y][x] = true;
		
		return max;
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		final int m = sc.nextInt();
		final int n = sc.nextInt();
		boolean[][] map = new boolean[n][m];
		for(int y=0; y<n; ++y){
			for(int x=0; x<m; ++x){
				map[y][x] = 1==sc.nextInt();
			}
		}
		
		int max = 0;
		for(int y=0; y<n; ++y){
			for(int x=0; x<m; ++x){
				if(map[y][x]){
					int tmp = dfs(map, y, x, 0);
					if(max<tmp){ max = tmp; }
				}
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}