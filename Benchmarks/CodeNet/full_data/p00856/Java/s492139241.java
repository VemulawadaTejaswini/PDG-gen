import java.util.*;
public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int t = sc.nextInt();
			int l = sc.nextInt();
			int b = sc.nextInt();
			if((n|t|l|b) == 0)break;
			int [] lList = new int[n+1];
			int [] bList = new int[n+1];
			for(int i = 0; i < l; i++){
				lList[sc.nextInt()] = 1;
			}
			for(int i = 0; i < b; i++){
				bList[sc.nextInt()] = 1;
			}
			double [][] dp = new double[t + 1][n + 1];
			for(int i = 0; i <= t; i++){
				Arrays.fill(dp[i], 0.0);
			}
			dp[0][0] = 1.0;
			for(int i = 0; i < t; i++){
				for(int j = 0; j < n; j++){
					for(int k = 1; k <= 6; k++){
						int  nextind = j + k;
						if(nextind <= n){
							
						}
						else{
							int diff = nextind - n;
							nextind = n - diff;
						}
						if(bList[nextind] == 1){
							dp[i+1][0] += dp[i][j] * (1.0 / 6);
						}
						else if(lList[nextind] == 1){
							if(i+2 <= t){
								dp[i+2][nextind] += dp[i][j] * (1.0 / 6);
							}
						}
						else{
							dp[i+1][nextind] += dp[i][j] * (1.0 / 6);
						}
					}
				}
				//n
				dp[i+1][n] += dp[i][n];
			}
			System.out.printf("%.6f\n",dp[t][n]);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}