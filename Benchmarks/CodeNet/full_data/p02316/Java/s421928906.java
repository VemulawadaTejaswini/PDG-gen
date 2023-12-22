import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int N = Integer.parseInt(line.substring(0,line.indexOf(" ")));
		int W = Integer.parseInt(line.substring(line.indexOf(" ")+1));
		int[] v = new int[N+1];
		int[] w = new int[N+1];

		for (int i=1; i<N+1; i++) {
			line = br.readLine();
			v[i] = Integer.parseInt(line.substring(0,line.indexOf(" ")));
			w[i] = Integer.parseInt(line.substring(line.indexOf(" ")+1));
		}

		int[][] dp = new int[W+1][N+1];

		for (int i=1; i<W+1; i++) {
			for (int j=1; j<N+1; j++) {
				if (i-w[j] >= 0)
					dp[i][j] = Math.max(dp[i][j-1],dp[i-w[j]][j-1]+v[j]);
				else
					dp[i][j] = dp[i][j-1];
			}
		}

		System.out.println(dp[N][W]);

		br.close();
	}
}