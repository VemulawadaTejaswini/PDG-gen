import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

//C: Fastest Route
public class Main{

	public static int[] dist;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[][] cost = new int[n][n+1];
			for(int i=0;i<n;i++)for(int j=0;j<=n;j++)cost[i][j]=sc.nextInt();
			dist = new int[1<<n];
			Arrays.fill(dist, 1<<30);
			dist[0] = 0;
			Queue<Integer> q = new PriorityQueue<Integer>(n, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return dist[o1]-dist[o2];
				}
			});
			q.add(0);
			while(true){
				int u = q.poll();
				if(u==(1<<n)-1)break;
				for(int i=0;i<n;i++){
					if((u&(1<<i))>0)continue;
					int nu = u | (1<<i);
					int min = dist[u] + cost[i][0];
					for(int j=0;j<n;j++){
						if((u&(1<<j))>0)min=Math.min(min, dist[u]+cost[i][j+1]);
					}
					if(min < dist[nu]){
						dist[nu] = min;
						q.add(nu);
					}
				}
			}
			System.out.println(dist[dist.length-1]);
		}
	}
}