import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
 
public class Main {

	static long MOD = 1_000_000_007;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int N = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		//char[] c = sc.next().toCharArray();
		int INF = Integer.MAX_VALUE;
		
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[] S = new int[N];
		int[] T = new int[M];
		for(int i=0;i<N;i++){
			S[i] = Integer.parseInt(sc.next());
		}
		for(int i=0;i<M;i++){
			T[i] = Integer.parseInt(sc.next());
		}
		
		long[][] dp = new long[N+1][M+1];
		for(int i=0;i<=N;i++)dp[i][0] = 1;
		for(int i=0;i<=M;i++)dp[0][i] = 1;
		
		for(int i=0;i<N;i++){
			for(int j=0; j<M; j++){
				if(S[i] == T[j]){
					dp[i+1][j+1] = (dp[i+1][j] + dp[i][j+1])%MOD;
				}else{
					long tmp=0;
					for(int p=i;p>=0;p--){
						if(S[p] == T[j]){
							tmp = dp[p+1][j];
							break;
						}
					}
					dp[i+1][j+1] = (Math.max(dp[i+1][j], dp[i][j+1])+tmp)%MOD;
				}
			}
		}
		
	
		
		System.out.print(dp[N][M]);
		
	}
}

