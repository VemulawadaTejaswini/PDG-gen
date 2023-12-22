import java.util.*;
import java.awt.geom.*;
public class Main {
	int INF = 1 << 24;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int m = sc.nextInt();
			int [][] pass = new int[n][n];
			for(int i = 0; i < n; i++){
				Arrays.fill(pass[i], INF);
				pass[i][i] = 0;
			}
			for(int i = 0; i < m; i++){
				String [] s = sc.next().split(",");
				int from = Integer.parseInt(s[0]);
				int to = Integer.parseInt(s[1]);
				int cost = Integer.parseInt(s[2]) / 100 - 1;
				pass[from][to] = cost;
				pass[to][from] = cost;
			}
			int res = mst(pass);
			System.out.println(res);
		}
	}

	private int mst(int[][] pass) {
		int INF = 1 << 24;
		int n = pass.length;
		int [] mincost = new int[n];
		boolean [] isused = new boolean[n];
		Arrays.fill(mincost, INF);

		mincost[0] = 0;
		int res = 0;
		while(true){
			int v = -1;
			for(int i = 0; i < n; i++){
				if(! isused[i] &&( v == -1 || mincost[i] < mincost[v])){
					v = i;
				}
			}
			if(v == -1) break;
			isused[v] = true;
			res += mincost[v];
			for(int i = 0; i < n; i++){
				mincost[i] = Math.min(mincost[i], pass[v][i]);
			}
		}
		return res;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}