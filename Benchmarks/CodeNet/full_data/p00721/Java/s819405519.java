import java.util.*;
import java.awt.geom.*;
import java.io.*;

public class Main{
	int [] vx = {0,1,0,-1};
	int [] vy = {1,0,-1,0};
	int INF = 1 << 24;
	
	class State{
		int x,y,step;

		public State(int x, int y, int step) {
			this.x = x;
			this.y = y;
			this.step = step;
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if((w|h) == 0) break;
			char [][] data = new char[h][w];
			for(int i = 0; i < h; i++){
				data[i] = sc.next().toCharArray();
			}
			int sx = -1, sy = -1;
			ArrayList<int []> gmap = new ArrayList<int[]>();
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(data[i][j] == 'o'){
						sx = j;
						sy = i;
						data[i][j] = '.';
						gmap.add(new int[]{i,j});
					}
					if(data[i][j] == '*'){
						gmap.add(new int[]{i,j});
					}
				}
			}
			
			int v = gmap.size();
			int [][] pass = new int[v][v];
			
			for(int k = 0; k < gmap.size(); k++){
				LinkedList<State> open = new LinkedList<Main.State>();
				open.add(new State(gmap.get(k)[1],gmap.get(k)[0], 0));
				int [][] close = new int[h][w];
				
				for(int i = 0; i < h; i++){
					Arrays.fill(close[i], INF);
				}
				close[gmap.get(k)[0]][gmap.get(k)[1]] = 0;
				while(! open.isEmpty()){
					State now = open.poll();
					for(int i = 0; i < 4; i++){
						int xx = now.x + vx[i];
						int yy = now.y + vy[i];
						if(! isOK(xx, yy, w,h)) continue;
						if(data[yy][xx] == 'x') continue;
						if(close[yy][xx] <= now.step + 1){
							continue;
						}
						open.add(new State(xx, yy, now.step + 1));
						close[yy][xx] = now.step + 1;
					}
				}
				
				for(int i = 0; i < v; i++){
					if(i == k){
						pass[k][i] = 0;
						continue;
					}
					pass[k][i] = close[gmap.get(i)[0]][gmap.get(i)[1]];
				}
			}
			
			int [][] dp = new int[v][1 << v];
			int sind = -1;
			for(int i = 0; i < v; i++){
				if(gmap.get(i)[0] == sy && gmap.get(i)[1] == sx){
					sind = i;
					break;
				}
			}
			for(int i = 0; i < v;i++){
				Arrays.fill(dp[i], INF);
			}
			dp[sind][1 << sind] = 0;
			for(int j = 0; j < (1 << v); j++){
				for(int i = 0; i < v; i++){
					if(dp[i][j] == INF) continue;
					for(int k = 0; k < v; k++){
						if(  (j & (1 << k)) != 0) continue;
						int next = j | (1 << k);
						int value = dp[i][j] + pass[i][k];
						dp[k][next] = Math.min(dp[k][next], value);
					}
				}
			}
			int ans = INF;
			for(int i = 0; i < v; i++){
				ans = Math.min(ans, dp[i][(1 << v) - 1]);
			}
			
			System.out.println(ans == INF ? -1 : ans);
		}
	}
	
	private boolean isOK(int xx, int yy, int w, int h) {
		return (0 <= xx && xx < w && 0 <= yy && yy < h);
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}