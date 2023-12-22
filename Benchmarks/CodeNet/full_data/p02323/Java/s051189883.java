import java.util.*;
import java.io.*;

class Main {

	static final int INF = Integer.MAX_VALUE/2;
	static int[][] dp;
	static int[][] d;
	static int v,e;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		v = Integer.parseInt(line.substring(0,line.indexOf(" ")));
		e = Integer.parseInt(line.substring(line.indexOf(' ')+1));
		d = new int[v][v];
		for (int i=0; i<e; i++) {
			line = br.readLine();
			String[] str = line.split(" ");
			int si = Integer.parseInt(str[0]);
			int ti = Integer.parseInt(str[1]);
			int di = Integer.parseInt(str[2]);
			d[si][ti] = di;
		}

		dp = new int[1<<v][v];
		for (int i=0; i<1<<v; i++)
			Arrays.fill(dp[i],-1);
		dp[(1<<v)-1][0] = 0;
		
		int ans = rec(0,0);
		System.out.println(ans>=INF?-1:ans);

		br.close();
	}

	static int rec(int i,int j) {
		if (dp[i][j] >= 0)
			return dp[i][j];
		if ((i == (1<<v)-1) && (j == 0))
			return dp[i][j] = 0;
		int res = INF;
		for (int k=0; k<v; k++) {
			if (((i>>k)&1) == 0 && d[j][k] != 0)
				res = Math.min(res,rec(i|1<<k,k)+d[j][k]);
		}
		return dp[i][j] = res;
	}
}