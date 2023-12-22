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
	int def = Integer.MAX_VALUE;
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			n = scan.nextInt();
			int m = scan.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			cost = new int[n][n];
			for(int i = 0;i < n;i++){
				Arrays.fill(cost[i],def);
			}
			for(int i = 0;i < m;i++){
				int a = scan.nextInt() - 1;
				int b = scan.nextInt() - 1;
				cost[a][b] = 1;
				cost[b][a] = 1;
			}
			dist = new int[n];
			visit = new boolean[n];
			Arrays.fill(dist,def);
			dijkstra(0);
			int count = 0;
			for(int i = 1;i < n;i++){
				if(dist[i] <= 2){
					count++;
				}
			}
			System.out.println(count);
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
				dist[u] = (cost[start][u] == def)?dist[u]:Math.min(dist[u],dist[start]+cost[start][u]);
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