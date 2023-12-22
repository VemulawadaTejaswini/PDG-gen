import java.util.*;

public class Main {
	long[][][] dp = new long[10][101][1001];
	
	void init(){
		for(int i=0;i<10;i++){
			for(int j=0;j<101;j++){
				for(int k=0;k<1001;k++){
					dp[i][j][k] = -1;
				}
			}
		}
	}
	
	long loop(int n, int x, int s){
		if(n==0 && s==0) return 1;
		if(n<0 || x<0 || s<0) return 0;
		if(dp[n][x][s]>=0) return dp[n][x][s];
		
		long sum = 0;
		for(int i=x;i>=0;i--){
			sum += loop(n-1,i-1,s-i);
		}
		dp[n][x][s] = sum;
		return dp[n][x][s];
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		init();
		while(true){
			int n = sc.nextInt();
			int s = sc.nextInt();
			if(n==0 && s==0) break;
			System.out.println(loop(n,100,s));
		}
	}
	
		
	public static void main(String[] args) {
		new Main().solve();
	}	
}