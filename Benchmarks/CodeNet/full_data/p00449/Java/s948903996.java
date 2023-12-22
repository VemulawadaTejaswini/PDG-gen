import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	int[][] cost;
	boolean[] visit;
	int[] dist;
	int n;
	int def = Integer.MAX_VALUE - 100000;
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			n = scan.nextInt();
			int k = scan.nextInt();
			if(n == 0 && k == 0){
				break;
			}
			cost = new int[n][n];
			for(int i = 0;i < n;i++){
				Arrays.fill(cost[i],def);
			}
			dist = new int[n];
			visit = new boolean[n];
			for(int i = 0;i < k;i++){
				int m = scan.nextInt();
				if(m == 0){
					int a = scan.nextInt() - 1;
					int b = scan.nextInt() - 1;
					Arrays.fill(visit, false);
					Arrays.fill(dist,def);
					dijkstra(a);
					System.out.println((dist[b] == def)?-1:dist[b]);
				}else{
					int c = scan.nextInt() - 1;
					int d = scan.nextInt() - 1;
					int e = scan.nextInt();
					cost[c][d] = Math.min(cost[c][d],e);
					cost[d][c] = Math.min(cost[d][c],e);
				}
			}
		}
	}
	public void dijkstra(int start){
		dist[start] = 0;
		while(true){
			int min = def;
			int next = -1;
			for(int u = 0;u < n;u++){
				if(visit[u]){
					continue;
				}
				dist[u] = Math.min(dist[u],dist[start]+cost[start][u]);
				if(dist[u] < min){
					min = dist[u];
					next = u;
				}
			}
			visit[start] = true;
			start = next;
			if(start == -1){
				break;
			}
		}
	}
}