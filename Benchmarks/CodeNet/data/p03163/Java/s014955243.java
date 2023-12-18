import java.util.Scanner;
 
class Main {
	int n;
	int w;
	int[] weight;
	int[] value;
	long[][] dp;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		n = sc.nextInt();
		w = sc.nextInt();
		weight = new int[n];
		value = new int[n];
		dp = new long[n+1][w+1];
		for(int i=0;i<n;i++){
			weight[i] = sc.nextInt();
			value[i] = sc.nextInt();
		}
	}
	void solve(){
		for(int i=1;i<=n;i++){
			for(int j=0;j<=w;j++){
				if(j-weight[i-1]>=0) dp[i][j] = Math.max(dp[i][j], dp[i-1][j-weight[i-1]]+value[i-1]);
				dp[i][j] = Math.max(dp[i][j], dp[i-1][j]);
			}
		}
		System.out.println(dp[n][w]);
	}
}