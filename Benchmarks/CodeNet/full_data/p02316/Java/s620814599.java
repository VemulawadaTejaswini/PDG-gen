import java.math.*;
import java.io.*;
import java.util.*;
public class Main {

	static int[] w;
	static int[] v;
	static int n;
	static int W;
	static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		W=Integer.parseInt(st.nextToken());
		w=new int[n];
		v=new int[n];
		dp=new int[n+1][W+1];
		for(int i=0;i<n;i++){
			st=new StringTokenizer(br.readLine());
			v[i]=Integer.parseInt(st.nextToken());
			w[i]=Integer.parseInt(st.nextToken());
			Arrays.fill(dp[i],-1);
		}
		
		
		for(int i=0;i<=W;i++){
			dp[n][i]=0;
		}for(int i=n-1;i>=0;i--){
			for(int j=0;j<=W;j++){
				if(j<w[i]){
					dp[i][j]=dp[i+1][j];
				}
				else{
					dp[i][j]=Math.max(Math.max(dp[i+1][j],dp[i+1][j-w[i]]+v[i]),dp[i][j-w[i]]+v[i]);
				}
			}
		}
		System.out.println(dp[0][W]);
		
		
	}
	

}