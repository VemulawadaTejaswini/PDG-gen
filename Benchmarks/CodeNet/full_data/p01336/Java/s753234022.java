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
			int[][] dp = new int[m+1][3];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j <= m; j++) {
					for(int k = 0; ; k++) {
						if(j + C[i] * k > m) break;
						dp[j + C[i] * k][0] = Math.max(dp[j + C[i] * k][0], dp[j][0] + V[i] * k);
						dp[j + C[i] * k][1] = Math.max(dp[j + C[i] * k][1], dp[j][1] + D[i] * k);
						dp[j + C[i] * k][2] = Math.max(dp[j + C[i] * k][2], dp[j][2] + L[i] * k);
					}
				}
			}
			for(int i = 0; i <= m; i++) {
				MAX = Math.max(dp[i][0], MAX);
				MAX = Math.max(dp[i][1], MAX);
				MAX = Math.max(dp[i][2], MAX);
			}
			System.out.println(MAX);
			
			
			
			
		}
		
	}
 }