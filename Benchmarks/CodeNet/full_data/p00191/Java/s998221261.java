import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0)
				break;
			double [][] data = new double[n][n];
			for(int i=0; i < n; i++){
				for(int j=0; j < n; j++){
					data[i][j] = sc.nextDouble();
				}
			}
			double [][] dp = new double[n][m];
			for(int i=0; i < n; i++){
				dp[i][0] = 1.0;
			}

			for(int i=1; i < m; i++){
				for(int j=0; j < n; j++){
					double max = 0;
					for(int k=0; k < n; k++){
						max = Math.max(max, dp[k][i-1] * data[k][j]);
					}
					dp[j][i] = max;
				}
			}

			//print
			double ans = 0;
			for(int i=0; i < n; i++){
				ans = Math.max(ans, dp[i][m-1]);
			}
			System.out.printf("%1.2f\n",ans);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}