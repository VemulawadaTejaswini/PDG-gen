import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			int[] c = new int[m];
			int[] x = new int[n];
			for(int i=0;i<m;i++) c[i] = sc.nextInt();
			for(int i=0;i<n;i++) x[i] = sc.nextInt();
			
			int[][] dp = new int[n+1][256];
			for(int i=0;i<=n;i++){
				for(int j=0;j<256;j++){
					dp[i][j] = Integer.MAX_VALUE;
				}
			}
			dp[0][128] = 0;
			
			for(int i=1;i<=n;i++){
				for(int j=0;j<256;j++){
					if(dp[i-1][j]==Integer.MAX_VALUE) continue;
					for(int k=0;k<m;k++){
						int num = j + c[k];
						if(num<0) num = 0;
						if(num>255) num = 255;
						int v = dp[i-1][j] + (x[i-1]-num) * (x[i-1]-num);
						dp[i][num] = Math.min(dp[i][num], v);
					}
				}
			}
			
			int min = Integer.MAX_VALUE;
			for(int i=0;i<256;i++){
				min = Math.min(min, dp[n][i]);
			}
			System.out.println(min);
		}
		
	}

}