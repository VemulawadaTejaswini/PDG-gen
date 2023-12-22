import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] a = new int[n][4];
			for(int i=0;i<n;i++){
				sc.nextLine();
				sc.nextLine();
				for(int j=0;j<4;j++) a[i][j] = sc.nextInt();
			}
			
			int max = 0;
			for(int k=1;k<4;k++){
				int[][] dp = new int[n+1][m+1];
				for(int i=0;i<n;i++){
					for(int j=0;j<=m;j++){
						if(j<a[i][0]) dp[i+1][j] = dp[i][j];
						else dp[i+1][j] = Math.max(dp[i][j], dp[i+1][j-a[i][0]]+a[i][k]);
					}
				}
				max = Math.max(max, dp[n][m]);
			}
			
			System.out.println(max);
		}	
	}	
}