import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] visited = new int[n+1];
		ArrayList<Edge>[] list = new ArrayList[n+1];
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i = 1; i <= n; i++){
		    list[i] = new ArrayList<Edge>();
		    pq.add(i);
		}
		for(int i = 0; i < m; i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    
		    list[x].add(new Edge(x, y));
		    list[y].add(new Edge(y, x));
		}
		
		// 計算
		int result = 0;
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		while(!pq.isEmpty()){
		    int a = pq.poll();
		    visited[a] = 1;
		    result++;
		    ad.add(a);
		    while(!ad.isEmpty()){
		        int now = ad.poll();
		        for(Edge e : list[now]){
		            int i = e.to;
		            if(visited[i] == 1) continue;
		            pq.remove(i);
		            visited[i] = 1;
		            ad.add(i);
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
    
    Edge(int from, int to){
        this.from = from;
        this.to = to;
    }

    public String toString(){
        return "from:" + from + " to:" + to ;
    }
    
}