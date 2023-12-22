import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

//Traveling Alone: One-way Ticket of Youth
public class Main {

	public static int n;
	public static int m;

	public static int[][] cost;
	public static int[][] time;

	public static int[] dist;

	public static int dijkstra(int start, int goal, int x){
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[start] = 0;
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(m, new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2) {
				return dist[o1]-dist[o2];
			}
		});
		q.add(start);
		while(!q.isEmpty()){
			int u = q.poll();
			if(u==goal)return dist[goal];
			if(x==0){
				for(int i=0;i<m;i++){
					if(cost[u][i]!=Integer.MAX_VALUE && dist[u]+cost[u][i] < dist[i]){
						dist[i] = dist[u] + cost[u][i];
						q.remove(i);
						q.add(i);
					}
				}
			}
			else{
				for(int i=0;i<m;i++){
					if(time[u][i]!=Integer.MAX_VALUE && dist[u]+time[u][i] < dist[i]){
						dist[i] = dist[u] + time[u][i];
						q.remove(i);
						q.add(i);
					}
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			m = sc.nextInt();
			if(n==0&&m==0)break;
			cost = new int[m][m];
			time = new int[m][m];
			dist = new int[m];
			for(int[] a:cost)Arrays.fill(a, Integer.MAX_VALUE);
			for(int[] a:time)Arrays.fill(a, Integer.MAX_VALUE);
			while(n--!=0){
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				int c = sc.nextInt();
				int t = sc.nextInt();
				if(cost[a][b] > c)
					cost[a][b] = cost[b][a] = c;
				if(time[a][b] > t)
					time[a][b] = time[b][a] = t;
			}
			int k = sc.nextInt();
			while(k--!=0){
				int s = sc.nextInt()-1;
				int t = sc.nextInt()-1;
				int x = sc.nextInt();
				System.out.println(dijkstra(s, t, x));
			}
		}
	}
}