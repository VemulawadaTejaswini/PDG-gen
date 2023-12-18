import java.util.Scanner;

public class Main {

	public static void main (String[] args)  {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][]graph = new int[n][n];
		int[]color = new int[n];
		for (int i=0;i<n;i++) {
			String s = sc.next();
			for (int j=0;j<n;j++) {
				graph[i][j]=s.charAt(j)-'0';
			}
		}
		
		if(!dfs(graph,color,1,0)) {
			System.out.println(-1);
		} else {
			int[][] dist = new int[n][n];
			for (int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if (i==j) {
						dist[i][j]=0;
					} else if (graph[i][j]==1){
						dist[i][j]=1;
					} else {
						dist[i][j]=n*2;
					}
					
				}
			}
			
			for (int k=0;k<n;k++) {
				for (int i=0;i<n;i++) {
					for (int j=0;j<n;j++) {
						if (dist[i][j]>dist[i][k]+dist[k][j]) {
							dist[i][j]=dist[i][k]+dist[k][j];
						}
					}
				} 
			}
			
			int len = 0;
			for (int i=0;i<n;i++) {
				for (int j=0;j<n;j++) {
					len=Math.max(len, dist[i][j]);
				}
			}
			System.out.println(len+1);
		}
	}

	static boolean dfs (int[][] graph, int[]color, int colorNow, int point) {

		color[point]=colorNow;
		for (int i=0;i<color.length;i++) {
			if (graph[point][i]==1) {
				if (color[i]==0) {
						dfs(graph,color,-colorNow,i);
				} else if (color[i]==colorNow) {
					return false;
				}	
			}
		}
		
		return true;
	}


}
