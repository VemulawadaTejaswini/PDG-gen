import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			if(x == 0 && y == 0 && z == 0) break;
			int[] v = new int[x];
			for(int i = 0; i < x; i++) {
				v[i] = sc.nextInt();
			}
			
			int[] n = new int[z];
			int[] e = new int[z];
			int[] A = new int[z];
			
			
			for(int i = 0; i < z; i++) {
				n[i] = sc.nextInt();
				e[i] = sc.nextInt();
				A[i] = sc.nextInt();
			}
			
			double[][] dp = new double[5000][y+1];
			for(int i = 0; i < 5000; i++) {
				Arrays.fill(dp[i], 0);
			}
			dp[0][0] = 1.0;
			
			for(int j = 0; j < dp[0].length-1; j++) {
				for(int i = 0; i < dp.length; i++) {
					if(dp[i][j] == 0) continue;
					for(int k = 0; k < x; k++) {
						int to = Math.min(y, j + v[k]);
						int money = i;
						Z:for(int l = 0; l < z; l++) {
							if(n[l] != to) continue;
							switch (e[l]) {
							case 1: to = Math.min(to + A[l], y); break Z;
							case 2: money += A[l]; break Z;
							case 3: money = Math.max(money - A[l], 0); break Z;
							}
							break Z;
						}
						dp[money][to] += dp[i][j] * (1.0/x);
					}
				}
			}
			double ans = 0;
			
			for(int i = 0; i < 5000; i++) {
				ans += i * dp[i][y];
			}

			System.out.println((int)ans);
			
		}
		
	}

	
}