import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, k, a, b, c, d, e;
	static int[][] cost;
	public static void main(String[] args) {
		while(read()){
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		k = sc.nextInt();
		if(n == 0 && k == 0)return false;
		
		cost = new int[n+1][n+1];
		for(int formatting[] : cost)Arrays.fill(formatting, 1 << 29);
		
		for(int i = 0; i < k; i++){
			if(sc.nextInt() == 0){
				a = sc.nextInt();
				b = sc.nextInt();
				if(cost[a][b] < 1 << 29){
					System.out.println(cost[a][b]);
				}else{
					System.out.println(-1);
				}
			}else{
				c = sc.nextInt();
				d = sc.nextInt();
				e = sc.nextInt();
				cost[c][d] = e;
				cost[d][c] = e;
				solve();
			}
		}
		return true;
	}
	
	static void solve(){
		if(cost[c][d] > e){
			for(int k = 1; k <= n; k++){
				for(int i = 1; i <= n; i++){
					for(int j = 1; j <= n; j++){
						cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k][j]);
					}
				}
			}
		}
	}

}