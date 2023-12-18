import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); //数
		int W = stdIn.nextInt(); //ナップサックの容量
		
		int[]w = new int[n+10];
		int[]v = new int[n+10];
		
		for(int i = 0; i < n; i++) {
			w[i] = stdIn.nextInt();
			v[i] = stdIn.nextInt();
		}
		
		
		long[][] dp = new long[n+1][(int)1e5+10];
		
		//dpループ
		for(int i = 0; i < n; i++) {
			
			for(int sumw = 0; sumw <= W; sumw++) {
				
				if(w[i] <= sumw) {
					dp[i+1][sumw] = Math.max(dp[i][sumw],dp[i][sumw - w[i]]+v[i] );
				}
				
				dp[i+1][sumw] = Math.max(dp[i+1][sumw],dp[i][sumw] );
				
			}
			
		}
		
		System.out.println(dp[n][W]);
		
	}

}
