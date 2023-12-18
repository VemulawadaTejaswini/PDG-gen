import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		final int MOD = (int)1e9+7;
		int H = Integer.parseInt(st.nextToken()); int W = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		long[][] dp = new long[H+1][W+1];
		boolean[][] wall = new boolean[H+1][W+1];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			wall[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = true;
		}
		dp[1][1] = 1;
		for(int i=1; i<=H; i++) {
			for(int j=1; j<=W; j++) {
				if(wall[i][j]) {
					dp[i][j] = 0;
					continue;
				}
				if(j!=0 && i==1) {
					dp[1][j] = dp[1][j-1];
					continue;
				}
				if(i!=0 && j==1) {
					dp[i][1] = dp[i-1][1];
					continue;
				}
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		System.out.println(dp[H][W]%MOD);
		
	}
}