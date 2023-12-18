import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Edge>[] list = new ArrayList[n+1];
		for(int i = 1; i <= n; i++){
		    list[i] = new ArrayList<Edge>();
		}
		for(int i = 0; i < m; i++){
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    int d = sc.nextInt();
		    list[l].add(new Edge(l, r, d));
		    list[r].add(new Edge(r, l, -d));
		}

		// 計算
		String result = "Yes";
		int[] dist = new int[n+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		int[] visited = new int[n+1];
		for(int i = 1; i < n+1; i++){
		    if(visited[i] == 1) continue;
		    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		    dist[i] = 0;
		    pq.add(i);
		    while(!pq.isEmpty()){
		        int now = pq.poll();
		        if(visited[now] == 1) continue;
		        visited[now] = 1;
		        for(Edge e : list[now]){
		            int from = e.from;
		            int to = e.to;
		            int d = e.weight;
		            if(dist[to] == Integer.MAX_VALUE){
		                dist[to] = dist[from] + d;
		            }else{
		                if(dist[to] != dist[from] + d) result = "No";
		            }
		            pq.add(to);
		        }
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}

class Edge {
    int from;
    int to;
    int weight;
    
    Edge(int from, int to, int weight){
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public String toString(){
        return "from:" + from + " to:" + to + " weight:" + weight;
    }   
}
