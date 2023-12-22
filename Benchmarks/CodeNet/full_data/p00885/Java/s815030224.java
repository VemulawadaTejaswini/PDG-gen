import java.util.Arrays;
import java.util.Scanner;

public class Main{

	int N;
	int[] ps;
	int[] ts;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			N = in.nextInt();
			if(N==0) return ;
			ps = new int[N];
			ts = new int[N];
			for(int i=0; i<N; i++){
				ps[i] = in.nextInt();
				ts[i] = in.nextInt();
			}
			int ans = solve();
			if(ans > 0) System.out.println("OK " + ans);
			else System.out.println("NG " + (-ans));
		}
	}

	int solve(){
		int[][] dp = new int[N][3];
		for(int i=0; i<N; i++){
			Arrays.fill(dp[i], Integer.MAX_VALUE);
		}
		if(ts[0] < ps[0]) return -1;
		dp[0][0] = ps[0];
		for(int i=0; i<N-1; i++){
			for(int j=0; j<3; j++)if(dp[i][j] < Integer.MAX_VALUE){
				if(ts[i] + (j+2)*ps[i] + ps[i+1] <= ts[i+1]){
					dp[i+1][0] = Math.min(dp[i+1][0], dp[i][j] + ps[i] + ps[i+1]);
				}
				if(j<2 && ts[i] + (j+2)*Math.abs(ps[i]-ps[i+1]) <= ts[i+1]){
					dp[i+1][j+1] = Math.min(dp[i+1][j+1], dp[i][j] + Math.abs(ps[i] - ps[i+1]));
				}
			}
			boolean ok = false;
			for(int j=0; j<3; j++){
				if(dp[i+1][j] < Integer.MAX_VALUE){
					ok = true;
				}
			}
			if(!ok){
				return -(i+2);
			}
		}
		int ans = Integer.MAX_VALUE;
		for(int j=0; j<3; j++){
			ans = Math.min(ans, dp[N-1][j]);
		}
		return ans + ps[N-1];
	}

	public static void main(String args[]){
		new Main().run();
	}
}