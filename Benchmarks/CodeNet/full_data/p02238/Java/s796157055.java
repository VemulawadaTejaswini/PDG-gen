
import java.util.Scanner;

public class Main {
	static int[][] graph;
	static int time;
	static int[] d,f;
	static boolean[] visited;
	
	static void visit(int node) {
		if(!visited[node]) {
			visited[node] = true;
			d[node] = time++;
			for(int i=1;i<d.length;i++) {
				if(graph[node][i]==1)
					visit(i);
			}
			f[node] = time++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n= sc.nextInt();
			if(n==0)break;
			time = 1;
			graph = new int[n+1][n+1];
			d = new int[n+1];
			f = new int [n+1];
			visited = new boolean[n+1];
			for(int i=0;i<n;i++) {
				int s = sc.nextInt();
				int k = sc.nextInt();
				for(int j=0;j<k;j++) {
					graph[s][sc.nextInt()] =1;
				}
			}
			for(int i=1;i<=n;i++)
				visit(i);
			for(int i=1;i<=n;i++)
				System.out.println(i+" "+d[i]+" "+f[i]);
		}
	}

}

