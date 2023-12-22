import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	int[][][] cost;
	boolean[] visit;
	int[] ans;
	int m;
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			m = scan.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			cost = new int[2][m][m];
			for(int i = 0;i < m;i++){
				Arrays.fill(cost[0][i],10000);
				Arrays.fill(cost[1][i], 10000);
			}
			for(int i = 0;i < n;i++){
				int a = scan.nextInt() - 1;
				int b = scan.nextInt() - 1;
				int tcost = scan.nextInt();
				int time = scan.nextInt();
				cost[0][a][b] = tcost;
				cost[0][b][a] = tcost;
				cost[1][b][a] = time;
				cost[1][a][b] = time;
			}
			int k = scan.nextInt();
			visit = new boolean[m];
			ans = new int[m];
			for(int i = 0;i < k;i++){
				int p = scan.nextInt() - 1;
				int q = scan.nextInt() - 1;
				int r = scan.nextInt();
				Arrays.fill(visit, false);
				Arrays.fill(ans,10000000);
				dijkstra(p,r);
				System.out.println(ans[q]);
			}
		}
	}
	public void dijkstra(int start,int r){
		ans[start] = 0;
		while(true){
			int min = 10000000;
			int next = -1;
			for(int u = 0;u < m;u++){
				if(visit[u]){
					continue;
				}
				ans[u] = Math.min(ans[u],ans[start]+cost[r][start][u]);
				if(ans[u] < min){
					min = ans[u];
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