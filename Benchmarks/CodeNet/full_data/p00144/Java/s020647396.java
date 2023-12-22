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
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			n = scan.nextInt();
			cost = new int[n][n];
			for(int i = 0;i < n;i++){
				Arrays.fill(cost[i], 100000);
			}
			for(int i = 0;i < n;i++){
				int r = scan.nextInt() - 1;
				int k = scan.nextInt();
				for(int j = 0;j < k;j++){
					int t = scan.nextInt() - 1;
					cost[r][t] = 1;
				}
			}
			int p = scan.nextInt();
			for(int i = 0;i < p;i++){
				int s = scan.nextInt() - 1;
				int d = scan.nextInt() - 1;
				int v = scan.nextInt();
				visit = new boolean[n];
				dist = new int[n];
				Arrays.fill(dist, 1000000);
				dijkstra(s);
				System.out.println((dist[d]+1 <= v)?Math.min(dist[d]+1,v):"NA");
			}
		}
	}
	public void dijkstra(int start){
		dist[start] = 0;
		while(true){
			int min = 1000000;
			int next = -1;
			for(int u = 0;u < n;u++){
				if(visit[u]){
					continue;
				}
				dist[u] = Math.min(dist[u],dist[start] + cost[start][u]);
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