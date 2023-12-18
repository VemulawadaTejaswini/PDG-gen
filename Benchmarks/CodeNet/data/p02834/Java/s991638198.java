import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int u = sc.nextInt() - 1;
		int v = sc.nextInt() - 1;
		ArrayList<Edge>[] g  = new ArrayList[n];
		for(int i = 0; i < n; i++){
		    g[i] = new ArrayList<Edge>();
		}
		for(int i = 0; i < n-1; i++){
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    g[a].add(new Edge(a, b, 1));
		    g[b].add(new Edge(b, a, 1));
		}
		
		// 計算
		int result = 0;
		if(u == v){
		    System.out.println(result);
		    return;
		}
		if(g[u].size() == 1 && g[u].get(0).to == v){
		    System.out.println(result);
		    return;
		}
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int[] distV = new int[n];
		int[] visitedV = new int[n];
		pq.add(v);
		visitedV[v] = 1;
		while(!pq.isEmpty()){
		    int from = pq.poll();
		    for(Edge e : g[from]){
		        int to = e.to;
		        if(visitedV[to] == 1) continue;
		        visitedV[to] = 1;
		        distV[to] =  distV[from] + 1;
		        pq.add(to);
		    }
		}
		int[] distU = new int[n];
		Arrays.fill(distU, -1);
		distU[u] = 0;
		int[] visitedU = new int[n];
		pq.add(u);
		visitedU[u] = 1;
		while(!pq.isEmpty()){
		    int from = pq.poll();
		    for(Edge e : g[from]){
		        int to = e.to;
		        if(visitedU[to] == 1) continue;
		        visitedU[to] = 1;
		        if(to != v){
		            distU[to] =  distU[from] + 1;
		            pq.add(to);
		        }
		    }
		}
		int max = 0;
		for(int i = 0; i < n; i++){
		    if(distU[i] != -1 && distU[i] < distV[i]){
		        max = max(max, distV[i]);
		    }
		}
		result = max - 1;
		
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

