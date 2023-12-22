import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, W;
	static int[][] info;
	static int[] weight, value;
	static int count = 1;
	static int[][]dp;
	public static void main(String[] args) {
		while(read()){
			int res = solve();
			System.out.println(res);
			count++;
		}
	}
	static boolean read(){
		W = sc.nextInt();
		if(W == 0)
			return false;
		N = sc.nextInt();
		info = new int[2][N];
		weight = new int[N];
		value = new int[N];
		dp = new int[N+1][W+1];
		String line;
		String [] devide = new String[2];
		for(int i = 0; i < N; i++){
			line = sc.next();
			devide = line.split(",");
			info[0][i] = Integer.parseInt(devide[0]);
			value[i] = Integer.parseInt(devide[0]);
			info[1][i] = Integer.parseInt(devide[1]);
			weight[i] = Integer.parseInt(devide[1]);
		}
		return true;
	}
	static int solve(){
		for(int i = 0; i <= N-1; i++){
			for(int j = 0; j <= W; j++){
				if(weight[i] > j){
					dp[i+1][j] = dp[i][j];
				}else{
					dp[i+1][j] = Math.max(dp[i][j], dp[i][j - weight[i]] + value[i]);
				}
			}
		}
		int ans = dp[N][W];
		System.out.println("Case " + count + ":");
		System.out.println(ans);
		int bestValue = dp[N][W];
		int index = 0;
		for(int j = 0; j <= W; j++ ){
			if(bestValue == dp[N][j]){
				index = j;
				break;
			}
		}
		return index;
	}
}