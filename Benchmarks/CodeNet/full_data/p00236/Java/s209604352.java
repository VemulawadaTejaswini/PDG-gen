import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	boolean [][] visited;
	boolean ans;
	int count, w,h;
	int [] vx = {0,1,0,-1};
	int [] vy = {1,0,-1,0};
	
	private void doit(){
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h) == 0) break;
			count = 0;
			visited = new boolean[h][w];
			int sx = -1, sy = -1;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					int now = sc.nextInt();
					if(now == 0){
						count++;
						if(sx == -1){
							sx = j;
							sy = i;
						}
					}
					else{
						visited[i][j] = true;
					}
				}
			}
			if(sx == -1){
				System.out.println("No");
				continue;
			}
			ans = false;
			visited[sx][sy] = true;
			dfs(sx, sy, 1);
			System.out.println(ans ? "Yes" : "No");
		}
	}

	private void dfs(int x, int y, int deep) {
		if(ans) return;
		if(deep == count){
			ans = true;
			return;
		}
		for(int i = 0; i < 4; i++){
			int xx = x + vx[i];
			int yy = y + vy[i];
			if(! isOK(xx, yy))continue;
			if(visited[yy][xx]) continue;
			visited[yy][xx] = true;
			dfs(xx, yy, deep + 1);
			visited[yy][xx] = false;
		}
	}

	private boolean isOK(int xx, int yy) {
		if(0<= xx && xx < w && 0<= yy && yy < h) return true;
		return false;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}