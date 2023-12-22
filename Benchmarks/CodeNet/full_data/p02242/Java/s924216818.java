

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] G = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			int u = sc.nextInt();
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				int v = sc.nextInt();
				G[u][v] = sc.nextInt();
			}
		}
		solve(n, G);
	}
	
	public static void solve(int n, int[][] G) {
		int[] dist = new int[n]; // 確定した距離
		int[] cand = new int[n]; // 候補
		
		int s = 0;
		int count = n;
		while(count > 0) {
			for (int i = 1; i < n; i++) {
				if (G[s][i] == 0)
					continue;
				if (cand[i] > 0)
					cand[i] = Math.min(G[s][i] + dist[s], cand[i]);
				else 
					cand[i] = G[s][i] + dist[s];
			}
			
			int minI = Integer.MAX_VALUE;
			int minD = Integer.MAX_VALUE;
			for (int i = 1; i < n; i++) {
				if (i == s)
					continue;
				if (dist[i] > 0)
					continue;
				if (cand[i] == 0) {
					continue;
				}
				if (cand[i] < minD) {
					minI = i;
					minD = cand[i];
				}
			}
			if (minI != Integer.MAX_VALUE)
				dist[minI] = minD;
			// next
			s = minI;
			count--;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(i + " " + dist[i]);
		}
	}
}