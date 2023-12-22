import java.util.*;

public class Main {
	final int INF = 1 << 24;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;
			int [] nlist = new int[n];
			int [] mlist = new int[m];
			for(int i=0; i < m; i++){
				mlist[i] = sc.nextInt();
			}
			for(int i = 0; i < n; i++){
				nlist[i] = sc.nextInt();
			}
			long [][] dp = new long[n+1][256];
			for(int i=0; i <= n; i++){
				Arrays.fill(dp[i], INF);
			}
			dp[0][128] = 0;
			for(int i=0; i < n; i++){
				for(int j=0; j < 256;j++){
					if(dp[i][j] >= INF) continue;
					
					for(int k=0; k < m; k++){
						int ind = j +mlist[k];
						if(ind < 0) ind = 0;
						else if(ind > 255) ind = 255;
						long value = dp[i][j] + (nlist[i] - ind) * (nlist[i] - ind);
						dp[i+1][ind] = Math.min(dp[i+1][ind], value);
						//System.out.println("dp=" + dp[i+1][ind] + " " + (i+1));
					}
				}
			}
//			for(int i=0; i <= n; i++){
//				for(int j=0; j < 255; j++){
//					if(dp[i][j] == INF){
//						System.out.print("INF ");
//					}
//					else{
//						System.out.print(dp[i][j] + " ");
//					}
//					
//				}
//				System.out.println();
//			}
			long ans = INF;
			for(int i=0; i < 256; i++){
				ans = Math.min(ans, dp[n][i]);
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}