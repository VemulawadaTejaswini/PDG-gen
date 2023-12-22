import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, m;
	static int[][] cost;
	static int[] mincost;
	static boolean[] used;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		m = sc.nextInt();
		if(n == 0 && m == 0)return false;
		cost = new int[n][n];
		mincost = new int[n];
		used = new boolean[n];
		for(int[] formatting: cost)Arrays.fill(formatting, 1<<29);
		Arrays.fill(mincost, 1<<29);
		Arrays.fill(used, false);
		for(int i = 0; i < m; i++){	
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			cost[a][b] = c;
			cost[b][a] = c;
		}
		return true;
	}
	
	static void solve(){
		mincost[0] = 0;
		int res = 0;
		
		while(true){
			int v = -1;
			for(int i = 0; i < n; i++){
				if(!used[i] && (v == -1 || mincost[i] < mincost[v]))v = i;
			}
			
			if(v == -1)break;
			used[v] = true;
			res += mincost[v];
			
			for(int i = 0; i < n; i++){
				mincost[i] = Math.min(mincost[i], cost[v][i]);
			}
		}
		System.out.println(res);
	}

}