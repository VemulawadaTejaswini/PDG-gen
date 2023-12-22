import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
     
     
public class Main {
	static int W;
	static int H;
	static int N;
	static boolean[][] fld;
	static int[] vx = new int[] {0,1,0,-1};
	static int[] vy = new int[] {1,0,-1,0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		String in = sc.next();
		for(int i = 0; i < n; i++) {
			if(in.charAt(i) == '*') {
				num[i] = -1;
			}
			else {
				num[i] = in.charAt(i) - '0';
			}
		}
		int m = sc.nextInt();
		int[] c = new int[m];
		for(int i = 0; i < m; i++) {
			c[i] = sc.nextInt();
		}
		long[][] dp = new long[n+1][10];
		dp[0][0] = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 10; j++) {
				if(num[i] != -1) {
					int tmp = 0;
					if((n - i) % 2 == 0) {
						tmp = num[i]*2;
						if(tmp >= 10) {
							switch(tmp) {
								case 10: tmp = 1; break;
								case 11: tmp = 2; break;
								case 12: tmp = 3; break;
								case 13: tmp = 4; break;
								case 14: tmp = 5; break;
								case 15: tmp = 6; break;
								case 16: tmp = 7; break;
								case 17: tmp = 8; break;
								case 18: tmp = 9; break;
							}
						}
					}
					else {
						tmp = num[i];
					}
					tmp += j;
					tmp %= 10;
					dp[i+1][tmp] += dp[i][j];
				}
				else {
					for(int k = 0; k < m; k++) {
						int tmp = 0;
						if((n - i) % 2 == 0) {
							tmp = c[k]*2;
							if(tmp >= 10) {
								switch(tmp) {
								case 10: tmp = 1; break;
								case 11: tmp = 2; break;
								case 12: tmp = 3; break;
								case 13: tmp = 4; break;
								case 14: tmp = 5; break;
								case 15: tmp = 6; break;
								case 16: tmp = 7; break;
								case 17: tmp = 8; break;
								case 18: tmp = 9; break;
								}
							}
						}
						else {
							tmp = c[k];
						}
						tmp += j;
						tmp %= 10;
						dp[i+1][tmp] += dp[i][j];
					}
				}
			}
		}

		System.out.println(dp[n][0]);
		
	}
	static int dfs(int now, int[] num, int[] c) {
		if(now == num.length) {
			return check(num)?1:0;
		}
		if(num[now] != -1) return dfs(now+1,num,c);
		int ret = 0;
		for(int i = 0; i < c.length; i++) {
			num[now] = c[i];
			ret += dfs(now+1,num,c);
		}
		num[now] = -1;
		return ret;
	}
	static boolean check(int[] a) {
		int sum = 0;
		for(int i = a.length-1; i >= 0; i--) {
			if((a.length - i) % 2 == 0) {
				int tmp = a[i]*2;
				if(tmp >= 10) {
					switch(tmp) {
					case 10: tmp = 1; break;
					case 11: tmp = 2; break;
					case 12: tmp = 3; break;
					case 13: tmp = 4; break;
					case 14: tmp = 5; break;
					case 15: tmp = 6; break;
					case 16: tmp = 7; break;
					case 17: tmp = 8; break;
					case 18: tmp = 9; break;
					}
				}
				sum += tmp;
			}
			else {
				sum += a[i];
			}
		}
		return sum % 10 == 0;
	}
}