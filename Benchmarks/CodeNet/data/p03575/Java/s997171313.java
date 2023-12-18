import java.util.*;
public class Main {
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] c = new int[n][n];
		for(int i=0;i<n;i++) {
			Arrays.fill(c[i], 0);
		}
		
		int[][] e = new int[m][2];
		for(int i=0;i<m;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			e[i][0] = a;
			e[i][1] = b;
			c[a][b] = 1;
			c[b][a] = 1;
		}
		
		int bridge = 0;
		for(int i=0;i<m;i++) {
			if(isBridge(c, e[i][0], e[i][1])) {
				bridge++;
			}
		}
		
		System.out.println(bridge);
	}
	static boolean isBridge(int[][] c, int s, int t) {
		c[s][t] = 0;
		c[t][s] = 0;
		
		int v = 0;
		boolean[] vis = new boolean[n];
		Arrays.fill(vis, false);
		Queue<Integer> que = new LinkedList<>();
		boolean start = false;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(c[i][j]==1) {
					que.offer(i);
					que.offer(j);
					vis[i] = true;
					vis[j] = true;
					start = true;
					v+=2;
					break;
				}
			}
			if(start)
				break;
		}
	
		
		while(que.size()>0) {
			int a = que.poll();
			
			for(int i=0;i<n;i++) {
				if(c[a][i]==1 && !vis[i]) {
					que.offer(i);
					vis[i] = true;
					v++;
				}
			}
		}
		
		c[s][t] = 1;
		c[t][s] = 1;
	
		if(v==n)
			return false;
		else
			return true;
	}
}