import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {
	static HashMap<String,Boolean> map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String in = sc.nextLine();
			String[] a = in.split(" ");
			int n = Integer.parseInt(a[0]);
			int m = Integer.parseInt(a[1]);
			int[] C = new int[n];
			int[] V = new int[n];
			int[] D = new int[n];
			int[] L = new int[n];
			for(int i = 0; i < n; i++) {
				in = sc.nextLine();
				in = sc.nextLine();
				a = in.split(" ");
				C[i] = Integer.parseInt(a[0]);
				V[i] = Integer.parseInt(a[1]);
				D[i] = Integer.parseInt(a[2]);
				L[i] = Integer.parseInt(a[3]);
			}
			int MAX = 0;
			int[][] dp = new int[n+1][m+1];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j <= m; j++) {
					for(int k = 0; ; k++) {
						if(j + C[i] * k > m) break;
						dp[i+1][j + C[i] * k] = Math.max(dp[i+1][j + C[i] * k], dp[i][j] + V[i] * k);
					}
				}
			}
			for(int i = 0; i <= m; i++) {
				MAX = Math.max(dp[n][i], MAX);
			}
			dp = new int[n+1][m+1];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j <= m; j++) {
					for(int k = 0; ; k++) {
						if(j + C[i] * k > m) break;
						dp[i+1][j + C[i] * k] = Math.max(dp[i+1][j + C[i] * k], dp[i][j] + D[i] * k);
					}
				}
			}
			for(int i = 0; i <= m; i++) {
				MAX = Math.max(dp[n][i], MAX);
			}
			dp = new int[n+1][m+1];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j <= m; j++) {
					for(int k = 0; ; k++) {
						if(j + C[i] * k > m) break;
						dp[i+1][j + C[i] * k] = Math.max(dp[i+1][j + C[i] * k], dp[i][j] + L[i] * k);
					}
				}
			}
			for(int i = 0; i <= m; i++) {
				MAX = Math.max(dp[n][i], MAX);
			}
			System.out.println(MAX);
			
			
			
			
		}
		
	}
 }