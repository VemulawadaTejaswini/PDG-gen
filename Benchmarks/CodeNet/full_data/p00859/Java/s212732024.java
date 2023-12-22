
import java.util.*;
public class Main {
	final int INF = 1 << 29;
	int [][] pass;
	boolean [] isused;
	int [] candcost;
	int n, premin;

	//1435 debug
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			pass = new int[n][n];
			isused = new boolean[n];
			candcost = new int[n];
			for(int i = 0;i < n; i++){
				Arrays.fill(pass[i], INF);
			}
			for(int i = 0; i < m; i++){
				int from = sc.nextInt() - 1;
				int to = sc.nextInt() -1;
				int cost = sc.nextInt();
				pass[from][to] = cost;
				pass[to][from] = cost;
			}

			int ans = INF;
			premin = Integer.MIN_VALUE;
			int res = 0;
			while(true){
				res = slimSpan();
				if(res == -1) break;
				ans = Math.min(ans, res);
			}
			System.out.println(ans == INF ? -1 : ans);
		}
	}

	private int slimSpan(){
		Arrays.fill(isused, false);
		Arrays.fill(candcost, INF);
		candcost[0] = 0;
		int max = 0, min = Integer.MAX_VALUE;

		while(true){
			int v = -1;
			for(int i = 0; i < n; i++){
				if(candcost[i] == INF) continue;
				if(! isused[i]){
					if(v == -1 || (candcost[v] > candcost[i]  && premin < candcost[i])){
						v = i;
					}
				}
			}
			if(v == -1) break;
			isused[v] = true;
			if(v != 0){
				max = Math.max(max,candcost[v]);
				min = Math.min(min, candcost[v]);
			}
			//cand cost
			for(int i = 0; i < n; i++){
				if(premin < pass[v][i] && candcost[i] > pass[v][i]){
					candcost[i] = pass[v][i];
				}
			}
		}

		for(int i = 0; i < n; i++){
			if(! isused[i]) return -1;
		}
		premin = min;
		return max - min;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
} 