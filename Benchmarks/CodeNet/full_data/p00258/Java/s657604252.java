import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			if(n == 0 && c == 0) break;
			int[][] a = new int[n][16];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < 16; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			int[][] b = new int[c][16];
			for(int i = 0; i < c; i++) {
				for(int j = 0; j < 16; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			int[] ax = new int[n];
			int[] bx = new int[c];
			for(int i = 0; i < n; i++) {
				int tmp = 0;
				for(int j = 0; j < 16; j++) {
					tmp |= a[i][j] << (15 - j);
				}
				ax[i] = tmp;
			}
			for(int i = 0; i < c; i++) {
				int tmp = 0;
				for(int j = 0; j < 16; j++) {
					tmp |= b[i][j] << (15 - j);
				}
				bx[i] = tmp;
			}
			
			
			int[][] dp = new int[n+1][1 << 16];
			for(int i = 0; i < n+1; i++) {
				Arrays.fill(dp[i], -1);
			}
			dp[0][0] = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < 1 << 16; j++) {
					if(dp[i][j] == -1) continue;
					int to = j | ax[i];
					for(int k = 0; k < c; k++) {
						int cx = to & bx[k];
						int dx = ~cx & to;
						int ret = Integer.bitCount(cx);
						dp[i+1][dx] = Math.max(dp[i+1][dx], dp[i][j] + ret);
					}
				}
			}
			int max = 0;
			for(int i = 0; i < 1<<16; i++) {
				max = Math.max(dp[n][i], max); 
			}
			
			System.out.println(max);
		}
		
	}
	
}