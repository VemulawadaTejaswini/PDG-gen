

import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	public static final int Max = 2<<10;
	public static int n,m;
	public static double res;
	public static double[][] cost,copy;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		cost = new double[Max][];
		copy = new double[Max][];
		int[] x = new int[n+1];
		int[] y = new int[n+1];
		for (int i = 1; i <= n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			cost[i] = new double[Max];
			copy[i] = new double[Max];
			Arrays.fill(cost[i], 0);
			Arrays.fill(copy[i], 0);
		}
		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			cost[u][v] = cost[v][u] = Math.sqrt(Math.pow((x[u]-x[v]), 2)+Math.pow((y[u]-y[v]), 2));
			res += cost[u][v];
		}
		for (int i = 1; i < n+1; i++) {
			for (int j = 1; j < n+1; j++) {
				copy[i][j] = cost[i][j];
			}
		}
		prim();
		System.out.printf("%.3f", res);
		
	}
	
	public static void prim() {
		
		double[] maxcost = new double[2<<9];
		boolean[] used = new boolean[2<<9];
		for (int i = 0; i < n+1; i++) {
			maxcost[i] = 0;
			used[i] = false;
		}
//		res = 0;
		
		while(true) {
			int v = -1;
			for (int u = 1; u < n+1; u++) {
				if(!used[u]&&(v==-1||maxcost[u]>maxcost[v])) v = u;
			}
			if(v==-1) break;
			used[v] = true;
			res -= maxcost[v];
			
			for (int u = 1; u < n+1; u++) {
				maxcost[u] = Math.max(maxcost[u], cost[v][u]);
			}
			
		}
		
		
	}

}

