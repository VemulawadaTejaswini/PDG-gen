import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			double[][] map = new double[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++) map[i][j] = sc.nextDouble();
			}
			
			double[][] dp = new double[m][n];
			Arrays.fill(dp[0], 1);
			for(int k=1;k<m;k++){
				for(int i=0;i<n;i++){
					for(int j=0;j<n;j++){
						dp[k][i] = Math.max(dp[k][i], dp[k-1][j]*map[j][i]);
					}
				}
			}
			double max = 0;
			for(int i=0;i<n;i++) max = Math.max(max, dp[m-1][i]);
			System.out.println(max);
		}
	}
}