import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] w = new int[1 << n];
		
		
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		w[0] = 0;
		for(int i = 0; i < w.length; i++) {
			for(int j = 0; j < n; j++) {
				if((i & (1 << j)) == 0) 
					w[i | (1 << j)] = w[i] + c[j]*20;
			}
		}
		
		double[][] dp = new double[1 << n][n+1];
		int[][] prev = new int[1 << n][n+1];
		for(int i = 1; i < dp.length; i++) {
			Arrays.fill(prev[i], -1);
		}
		for(int i = 0; i < dp.length; i++) {
			Arrays.fill(dp[i], 2 << 27);
		}
		dp[0][0] = 0;
		
		for(int i = 0; i < dp.length; i++) {
			for(int j = 0; j < n+1; j++) {
				for(int k = 0; k < n; k++) {
					if(j-1 == k) continue;
					if((i & (1 << k)) == 0) {
						if( dp[i | (1 << k)][k+1] >  dp[i][j] + Math.abs((j == 0)?0:(b[j-1] - b[k]) / (2000.0 / (70.0 + w[i])))) {
							dp[i | (1 << k)][k+1] =  dp[i][j] + Math.abs((j == 0)?0:(b[j-1] - b[k]) / (2000.0 / (70.0 + w[i])));
							prev[i | (1 << k)][k+1] = j;
						}
					}
				}
			}
		}
		double min = 2 << 27;
		int id = 0;
		
		for(int i = 0; i < n+1; i++) {
			if(dp[dp.length-1][i] < min) {
				
				min = dp[dp.length-1][i];
				id = i;
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		int now = dp.length-1;
		list.add(id-1);
		while(true) {
			if(prev[now][id] == 0) break;
			list.add(prev[now][id]-1);
			int ck = now;
			now ^= (1 << (id-1));
			id = prev[ck][id];
		}
		System.out.print(a[list.get(list.size()-1)]);
		for(int i = list.size()-2; i >= 0; i--) {
			System.out.print(" " + a[list.get(i)]);
		}
		System.out.println();
		
	}
	

}