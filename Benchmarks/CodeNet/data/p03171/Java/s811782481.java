import java.util.*;
public class Main {
	static int n;
	static long[] a=new long[3005];
	static boolean[][] vis=new boolean[3005][3005];
	static long[][] dp=new long[3005][3005];
	static long DP(int x,int y) {
		if (x+y>=n) return 0;
		if (vis[x][y]) return dp[x][y];
		vis[x][y]=true;
		if ((x+y)%2==0) dp[x][y]=Math.max(DP(x+1,y)+a[x],DP(x,y+1)+a[n-1-y]);
		else dp[x][y]=Math.min(DP(x+1,y)-a[x],DP(x,y+1)-a[n-1-y]);
		return dp[x][y];
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for (int i=0;i<n;++i) a[i]=in.nextLong();
		System.out.println(DP(0,0));
	}
}