
import java.util.*;
public class Main {
	//1140 start
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int K = sc.nextInt();
			if((n|m|K) == 0)break;
			long [][] dp = new long[n+1][n * m + 1];
			for(int i = 1; i < m+1; i++){
				dp[1][i] = 1;
			}
			
			for(int i = 1; i < n; i++){
				for(int j = 1;j <= i * m; j++){
					if(dp[i][j] == 0)continue;
					for(int k = 1; k <= m; k++){
						int next = j + k;
						dp[i+1][next] += dp[i][j];
					}
				}
			}
			
			double sum = 0;
			long mn = 1;
			for(int i = 0; i < n; i++){
				mn *= m;
			}
			
			for(int i = 1 ; i <= n * m; i++){
				int value = Math.max(i - K, 1);
				sum+= (double)dp[n][i] / mn * value;
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}