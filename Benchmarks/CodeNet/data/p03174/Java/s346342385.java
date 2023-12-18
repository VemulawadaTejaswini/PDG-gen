//Matching
import java.util.*;
public class Main{
	static int n;
	static int[][] matrix;
	static int mod=(int)1e9+7;
	static int dp[][];
	public static int solve(int i,int mask){
		if(i==n){
		
			if(mask==0)
				return 1;
			return 0;
		}
		if(dp[i][mask]!=-1){
			return dp[i][mask];
		}
		int ans=0;

		for(int j=0;j<n;j++){
			int avai=mask&(1<<(j));
			if(matrix[i][j]==1&&avai!=0){
				ans=(ans+solve(i+1,mask&(~(1<<j))))%mod;

			}
		}
		return dp[i][mask]=ans;

	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		matrix=new int[n][n];
		int finalBits=((1<<n)-1);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				matrix[i][j]=s.nextInt();
			}
		}
		dp=new int[n][(1<<n)];
		for(int[] x:dp){
			Arrays.fill(x,-1);
		}
		System.out.println(solve(0,finalBits));
	   }
	}