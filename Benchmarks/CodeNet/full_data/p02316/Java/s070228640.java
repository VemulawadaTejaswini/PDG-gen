import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int N = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int[] v = new int[N];
		int[] w = new int[N];
		for(int i=0;i<N;i++){
			v[i] = Integer.parseInt(sc.next());
			w[i] = Integer.parseInt(sc.next());
		}
		
		int[][] dp = new int[N+1][W+1];
		for(int i=0; i<=W; i++){
			dp[0][i] = 0;
		}
		
		for(int i=0;i<N;i++){
			for(int j=0;j<=W; j++){
				if(j-w[i]>=0){
					dp[i+1][j] = Integer.max(dp[i][j], dp[i+1][j-w[i]] + v[i]);
				}else{
					dp[i+1][j] = dp[i][j];
				}
			}
		}
		
		
		System.out.println(dp[N][W]);
		
		sc.close();
	}
	
	
	
}
