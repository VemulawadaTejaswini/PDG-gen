import java.util.Scanner;
 
class Main {
	int n;
	int[][] abc;
	int[][] dp;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
	}
	Main(Scanner sc){
		n = sc.nextInt();
		abc = new int[n][3];
		dp = new int[n+1][3];
		for(int i=0;i<n;i++){
			abc[i][0] = sc.nextInt();
			abc[i][1] = sc.nextInt();
			abc[i][2] = sc.nextInt();
		}
		dp[0][0] = 0;
		dp[0][1] = 0;
		dp[0][2] = 0;
	}
	void solve(){
		for(int i=1;i<=n;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					if(j==k) continue;
					dp[i][j] = Math.max(dp[i][j], dp[i-1][k]+abc[i-1][j]);
				}
			}
		}
		System.out.println(Math.max(Math.max(dp[n][0], dp[n][1]),dp[n][2]));
	}
}