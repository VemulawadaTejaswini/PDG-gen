import java.util.*;

public class Main {
	static int[] a,b,c;
	static int n;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		a=new int[n];
		b=new int[n];
		c=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
			b[i]=scan.nextInt();
			c[i]=scan.nextInt();
		}
		dp=new int[n][4];
		for(int i=0;i<n;i++) {
			for(int j=0;j<4;j++) dp[i][j]=-1;
		}
		System.out.println(go(0,0));
	}
	static int[][] dp;
	public static int go(int at, int prev) {
		if(at==n) return 0;
		if(dp[at][prev]!=-1) return dp[at][prev];
		int res=0;
		if(prev!=1) res=Math.max(res,a[at]+go(at+1,1));
		if(prev!=2) res=Math.max(res,b[at]+go(at+1,2));
		if(prev!=3) res=Math.max(res,c[at]+go(at+1,3));
		return dp[at][prev]=res;
	}
}