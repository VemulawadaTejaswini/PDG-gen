import java.util.*;
import java.io.*;

class Main {

	static int[][] dp;
	static int[] row;
	static int[] colmn;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		dp = new int[n][n];

		row = new int[n];
		colmn = new int[n];

		for (int i=0; i<n; i++) {
			String line = br.readLine();
			row[i] = Integer.parseInt(line.substring(0,line.indexOf(" ")));
			colmn[i] = Integer.parseInt(line.substring(line.indexOf(" ")+1));
		}

		System.out.println(rec(0,n-1));

		br.close();
	}

	static int rec(int i,int j){
		if (dp[i][j] != 0 || i==j)
			return dp[i][j];
		if (i-j == 1)
			return dp[i][j] = row[i] * colmn[i] * colmn[j];
		int min = Integer.MAX_VALUE;
		for (int k=i; k<j; k++){
			min = Math.min(min, rec(i,k) + rec(k+1,j) + row[i] * row[k+1] * colmn[j]);
		}
		return dp[i][j] = min;
	}
}