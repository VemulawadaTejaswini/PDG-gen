import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] map = new int[h][w];
		for(int i = 0; i < h; i++) {
			char[] in = sc.next().toCharArray();
			for(int j = 0; j < w; j++) {
				map[i][j] = in[j] - '0';
			}
		}
		int[][] dp = new int[h][w];
		for(int i = 0; i < h; i++) {
			Arrays.fill(dp[i], 2 << 27);
		}
		dp[0][0] = 0;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(i != h-1) {
					dp[i+1][j] = Math.min(dp[i][j] + map[i+1][j], dp[i+1][j]);
				}
				if(j != w-1) {
					dp[i][j+1] = Math.min(dp[i][j] + map[i][j+1], dp[i][j+1]);
				}
			}
		}
		
		System.out.println(dp[h-1][w-1]);
		
		
		
		
		
		
		
	}
}