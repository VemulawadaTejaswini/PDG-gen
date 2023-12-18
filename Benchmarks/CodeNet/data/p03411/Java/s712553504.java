
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int rx[] = new int[n];
		int ry[] = new int[n];
		
		int bx[] = new int[n];
		int by[] = new int[n];
		
		for(int i = 0; i < n  ; i ++){
			
			rx[i] = sc.nextInt();
			ry[i] = sc.nextInt();
			
		}
		
		for(int i =0 ; i < n;  i++){
			bx[i] = sc.nextInt();
			by[i] = sc.nextInt();
		}
		
		
		List<E> list = new ArrayList<E>();
		
		
		for(int i = 0; i < n ;i++){
			for(int j =0 ; j < n ; j++){
				if(rx[i] < bx[j] && ry[i] < by[j]){
					E e =new E();
					e.from = i;
					e.to = n+j;
					e.cap = 1;
					list.add(e);
					
					E rev  = new E();
					rev.from = n+j;
					rev.to = i;
					rev.cap = 0;
					list.add(rev);
				}
			}
		}
		
		for(int i =0 ; i< n ;i++){
			E e =new E();
			e.from = i;
			e.to = 2*n;
			e.cap = 0;
			list.add(e);
			
			E rev  = new E();
			rev.from = 2*n;
			rev.to = i;
			rev.cap = 1;
			list.add(rev);			
		}
		
		for(int i =0 ; i< n ;i++){
			E e =new E();
			e.from = n+i;
			e.to = 2*n+1;
			e.cap = 1;
			list.add(e);
			
			E rev  = new E();
			rev.from = 2*n+1;
			rev.to = n+i;
			rev.cap = 0;
			list.add(rev);		
		}
		
		long ans = 0;
		int[] depth = new int[2*n+2];
		boolean[] visited = new boolean[2*n+2];
		for (;;) {
			Arrays.fill(depth, 2*n+2+5);
			Arrays.fill(visited, false);
			if (!bfs(list, depth, visited, 2*n, 2*n+1)) {
				break;
			}
	
			for (;;) {
				Arrays.fill(visited, false);
				visited[2*n] = true;
				int flow = dfs(1,list, depth,visited, 2*n,2*n+1,0);
				if(flow == 0){
					break;
				}
				ans += flow;
			}
		}
		System.out.println(ans);
		
	}
	
	
	int dfs(int flow ,List<E> edges, int[]depth,boolean[] visited, int now,int to,int d){
		if(now == to){
			return flow;
		}
		long ans = 0;
		for(int ii = 0 ; ii < edges.size(); ii++){
			E e =edges.get(ii);
			if(e.from == now && !visited[e.to] && depth[e.to] > depth[e.from] && e.cap > 0){
				visited[e.to] = true;
				
				int res = dfs(Math.min(flow,e.cap),edges,depth,visited,e.to,to,d+1);
				if(res > 0 ){
					e.cap -= res;
					edges.get(ii^1).cap += res;
					return res;
				}
				visited[e.to] = false;
			}
		}
		return 0;
	}
	
	
	boolean bfs(List<E> edges, int[] depth, boolean[] visited, int from, int to) {

		PriorityQueue<EE> q = new PriorityQueue<>((ee1, ee2) -> Integer.compare(ee1.depth, ee2.depth));
		EE init = new EE();
		init.depth = 0;
		init.pos = from;
		q.add(init);

		for (; !q.isEmpty();) {

			EE x = q.poll();
			if (x.pos == to) {
				depth[x.pos] = x.depth;
				return true;
			}

			if (depth[x.pos] <= x.depth) {
				continue;
			}
			depth[x.pos] = x.depth;
			visited[x.pos] = true;

			for (E e : edges) {
				if (e.from == x.pos && !visited[e.to] && e.cap > 0) {
					EE ex = new EE();
					ex.depth = x.depth + 1;
					ex.pos = e.to;
					q.add(ex);
				}
			}
		}
		return false;
	}

	class EE {
		int pos;
		int depth;
	}

	class E {
		int from;
		int to;
		int cap;
	}

}
