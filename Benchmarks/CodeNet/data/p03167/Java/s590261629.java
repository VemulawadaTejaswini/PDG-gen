import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++) {
			String str=s.next();
			for(int j=0;j<m;j++) {
				char c=str.charAt(j);
				if(c=='.')
					arr[i][j]=0;
				else
					arr[i][j]=1;
			}
		}
		int[][] dp=new int[n][m];
		for(int i=0;i<n;i++)
		Arrays.fill(dp[i],-1);
		int a=dfs(0,0,arr,dp);
		System.out.println(a);

	}
	public static int dfs(int i, int j, int[][] arr, int[][] dp) {
		if(i==arr.length-1 && j==arr[0].length-1) {
			return 1;
		}
		if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]==1) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		dp[i][j]=dfs(i+1,j,arr,dp)%1000000007+dfs(i,j+1,arr,dp)%1000000007;
		return dp[i][j]%1000000007;
	}
}
