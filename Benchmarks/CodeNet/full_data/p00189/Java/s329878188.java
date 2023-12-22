

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main{
	
	static int[][] cost;
	static int[] d,sum;
	static boolean[] used;
	static int n,V;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			n = sc.nextInt();
			V = 0;
			ArrayList<Integer> arr = new ArrayList<Integer>();
			if(n==0) break;
			cost = new int[2<<9][];
			d = new int[2<<9];
			sum = new int[2<<9];
			used = new boolean[2<<9];
			Arrays.fill(sum, 0);
			for (int i = 0; i < cost.length; i++) {
				cost[i] = new int[2<<9];
				Arrays.fill(cost[i], 2<<9);
			}
			for (int i = 0; i < n; i++) {
				
				int y = sc.nextInt();
				int x = sc.nextInt();
				int c = sc.nextInt();
				if(!arr.contains(x)) {
					arr.add(x);
					V++;
				}
				if(!arr.contains(y)) {
					arr.add(y);
					V++;
				}
				cost[y][x] = c;
				cost[x][y] = c;
			}
			for (int i = 0; i < V; i++) {
				dijkstra(i);
			}
			int ans = Integer.MAX_VALUE;
			int index = 0;
			for (int i = 0; i < V; i++) {
				if(ans>sum[i]) {
					index = i;
					ans = sum[i];
				}
			}
			System.out.println((index)+" "+ans);
		}
		
	}
	
	
	public static void dijkstra(int s) {
		Arrays.fill(d, 2<<9);
		Arrays.fill(used, false);
		d[s] = 0;
		
		while(true) {
			int v = -1;
			for (int u = 0; u < V; u++) 
				if(!used[u]&&(v==-1||d[u]<d[v])) v=u; 
			
			if(v==-1) break;
			used[v] = true;
			for (int u = 0; u < V; u++) {
				d[u] = Math.min(d[u], d[v]+cost[v][u]);
			}
		}
		int temp = 0;
		for (int i = 0; i < V; i++) {
			temp+=d[i];
		}
		sum[s] = temp;
		
	}
	
}

