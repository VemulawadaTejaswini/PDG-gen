import java.util.Scanner;

public class Main {
	public static final int MAX = Integer.MAX_VALUE - 90000;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int N = in.nextInt();
			int M = in.nextInt();
			if(N==0 && M==0) break;
			int[] C = new int[M];
			for(int i=0;i<M;i++){
				C[i] = in.nextInt();
			}
			int[] x = new int[N+1];
			for(int i=1;i<N+1;i++){
				x[i] = in.nextInt();
			}
			
			int[][] dp = new int[N+1][256];
			for(int i=0;i<N+1;i++){
				for(int j=0;j<256;j++){
					dp[i][j] = MAX;
				}
			}
			dp[0][128] = 0;
 			for(int i=0;i<N;i++){
 				for(int j=0;j<256;j++){
 					for(int k=0;k<C.length;k++){
 						int trg = Math.min(255,Math.max(0,j+C[k]));
 						dp[i+1][trg] = (int)Math.min(dp[i+1][trg],
 								dp[i][j]+Math.pow(x[i+1]-trg,2));
 					}
 				}
 			}
 			int ans=MAX;
 			for(int i=0;i<256;i++){
 				ans = Math.min(ans,dp[N][i]);
 			}
 			System.out.println(ans);
 			System.gc();
		}
	}
}