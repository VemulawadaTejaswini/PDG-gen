import java.util.*;
import java.io.PrintWriter;
public class Main{
	static long[] a;
	static long[][] dp;
	static boolean[][] visited;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=new long[n];
		dp=new long[n][n];
		visited=new boolean[n][n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
		}
		System.out.println(dfs(0,n-1));
	}
	static long dfs(int l,int r){
		if(visited[l][r]) return dp[l][r];
		if(l==r) return a[l];
		visited[l][r]=true;
		return dp[l][r]=Math.max(a[l]-dfs(l+1,r),a[r]-dfs(l,r-1));
	}
}