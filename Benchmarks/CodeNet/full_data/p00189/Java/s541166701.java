import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void dijkstra(int s,int cost[][],int d[],boolean used[],int V){
		for(int i = 0;i < V;i++){
			d[i] = Integer.MAX_VALUE;
			used[i] = false;
		}
		d[s] = 0;
		while(true){
			int v = -1;
			for(int u = 0;u < V;u++){
				if(!used[u] && (v == -1 || d[u] < d[v]))v = u;
			}
			if(v == -1)break;
			used[v] = true;
			for(int u = 0;u < V;u++){
				if(d[u] > d[v] + cost[v][u] && d[v] + cost[v][u] > 0){
					d[u] = d[v] + cost[v][u];
				}
			}
		}
	}
	void doIt() { 
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			int V = 10;
			int cost[][] = new int [V][V];
			int d[] = new int[V];
			boolean used[] = new boolean[V];
			for(int i = 0;i < V;i++){
				for(int j = 0;j < V;j++){
					cost[i][j] = Integer.MAX_VALUE;
				}
			}
			for(int i = 0;i < n;i++){
				int b = sc.nextInt();
				int c = sc.nextInt();
				cost[b][c] = sc.nextInt();
				cost[c][b] = cost[b][c];
			}
			int costall = Integer.MAX_VALUE;
			int ans = 0;
			for(int i = 0;i < V;i++){
				int cnt = 0;
				dijkstra(i,cost,d,used,V);
				for(int j = 0;j < V;j++){
					if(d[j] != Integer.MAX_VALUE){
						cnt = cnt + d[j];
					}
				}
				if(cnt != 0){
					if(costall > cnt){
						costall = cnt;
						ans = i;
					}
				}
			}
			System.out.println(ans+" "+costall);
		}
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}