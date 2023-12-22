import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, m, p, q, r;
	static int[][] cost, time;
	public static void main(String[] args) {
		while(read()){
			//solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		m = sc.nextInt();
		if(n == 0 && m == 0)return false;
		
		cost = new int[n+1][n+1];
		time = new int[n+1][n+1];
		
		for(int formatting[] : cost)Arrays.fill(formatting, 1<<29);
		for(int formatting[] : time)Arrays.fill(formatting, 1<<29);
		
		for(int i = 1; i <= n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			cost[a][b] = sc.nextInt();
			time[a][b] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		for(int j = 0; j < k; j++){
			p = sc.nextInt();
			q = sc.nextInt();
			r = sc.nextInt();
			solve();
		}
		
		return true;
	}
	
	static void solve(){
		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k][j]);
					time[i][j] = Math.min(time[i][j], time[i][k] + time[k][j]);
				}
			}
		}
		if(r == 0){
			System.out.println(cost[p][q]);
		}else{
			System.out.println(time[p][q]);
		}
	}

}