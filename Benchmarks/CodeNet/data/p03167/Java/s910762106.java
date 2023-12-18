
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner in;
	
	private static int n;
	private static int m;
	private static char[][] g;
	private static long[][] dp;
	private static final int MOD = (int)1e9+7;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		g = new char[n][m];
		for(int i=0; i<n; i++) {
			g[i] = in.next().toCharArray();
		}
		
		dp = new long[n][m];
		
		for(int i=0; i<n; i++)
			Arrays.fill(dp[i], -1);
		
		System.out.println(solve(0, 0));
	
	}
	
	private static long solve(int x, int y) {
		if (x==n-1 && y==m-1) return 1;
		
		
		if (dp[x][y]!=-1) return dp[x][y];
		
		int[] dx = {1, 0};
		int[] dy = {0, 1};
		
		long ans = 0;
		
		for(int k=0; k<2; k++) {
			int nx = x+dx[k];
			int ny = y+dy[k];
			if (nx<0 || nx>=n || ny<0 || ny>=m || g[nx][ny]=='#') continue;
			ans = (ans+solve(nx, ny))%MOD;
		}
		
		
		return dp[x][y]=ans;
	}

}
