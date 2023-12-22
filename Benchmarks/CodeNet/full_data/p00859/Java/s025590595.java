import java.util.*;
public class Main {
	final int INF = 1 << 29;
	int [][] pass;
	boolean [] isused;
	int [] candcost;
	int n, max, min;
	
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
			for(int i = 0; i < n; i++){
				for(int j = i+1; j < n; j++){
					if(pass[i][j] == INF) continue;
					max = pass[i][j];
					min = pass[i][j];
					int res = slimSpan(i, j);
					ans = Math.min(ans, res);
				}
			}
			System.out.println(ans == INF ? -1 : ans);
		}
	}
	
	private int slimSpan(int a, int b){
		Arrays.fill(isused, false);
		isused[a] = true;
		isused[b] = true;
		
		for(int i = 0; i < n; i++){
			candcost[i] = pass[a][i];
		}
		for(int i = 0; i < n; i++){
			if(avg(candcost[i]) > avg(pass[b][i]) ){
				candcost[i] = pass[b][i];
			}
		}
		
		while(true){
			int v = -1;
			int nowavg = -1;
			for(int i = 0; i < n; i++){
				if(candcost[i] == INF) continue;
				if(! isused[i]){
					if(v == -1){
						v = i;
						nowavg = avg(candcost[i]);
					}
					else if(nowavg > avg(candcost[i])){
						v = i;
						nowavg = avg(candcost[i]);
					}
				}
			}
			if(v == -1) break;
			
			isused[v] = true;
			max = Math.max(max,candcost[v]);
			min = Math.min(min, candcost[v]);
			
			//cand cost
			for(int i = 0; i < n; i++){
				if(avg(candcost[i]) > avg(pass[v][i]) ){
					candcost[i] = pass[v][i];
				}
			}
		}
		
		for(int i = 0; i < n; i++){
			if(! isused[i]) return INF;
		}
		return max - min;
	}

	private int avg(int num) {
		if(min <= num && num <= max){
			return 0;
		}
		else{
			if(num < min){
				return min - num;
			}
			else{
				return num - max;
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}