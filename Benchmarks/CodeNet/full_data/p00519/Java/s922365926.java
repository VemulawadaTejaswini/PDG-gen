import java.util.*;
import java.math.*;
public class Main{

	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int c[] = new int[n];
		int r[] = new int[n];
		int a[] = new int[k];
		int b[] = new int[k];
		for(int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		for(int i = 0; i < k; i++) {
			a[i] = sc.nextInt()-1;
			b[i] = sc.nextInt()-1;
		}
		int[][] dis = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j) continue;
				dis[i][j] = INF;
			}
		}
		Node[] node = new Node[n];
		for(int i = 0; i < n; i++) {
			node[i] = new Node();
			node[i].cost = INF;
		}
		for(int i = 0; i < k; i++) {
			node[a[i]].edge_to.add(b[i]);
			node[b[i]].edge_to.add(a[i]);
		}
		for(int i = 0; i < n; i++) {
			ArrayDeque<Data> queue = new ArrayDeque<Data>();
			queue.add(new Data(i,0));
			while(!queue.isEmpty()) {
				Data tmp = queue.poll();
				if(tmp.cost > r[i]) break;
				ArrayList<Integer> edge_to = node[tmp.now].edge_to;
				for(int j = 0; j < edge_to.size(); j++) {
					int T = edge_to.get(j);
					int M = tmp.cost+1;
					if(dis[i][T] <= M) continue;
					dis[i][T] = M;
					queue.add(new Data(T,M));
				}
 			}
		}
		PriorityQueue<Data> queue = new PriorityQueue<Data>();
		queue.add(new Data(0,0));
		while(!queue.isEmpty()) {
			Data tmp = queue.poll();
			if(node[tmp.now].cost <= tmp.cost) continue;
			node[tmp.now].cost = tmp.cost;
			node[tmp.now].check = true;
			if(tmp.now == n-1) break;
			for(int i = 0; i < n; i++) {
				if(node[i].check) continue;
				if(dis[tmp.now][i] > r[tmp.now]) continue;
				if(node[i].cost <= tmp.cost + c[tmp.now]) continue;
				queue.add(new Data(i,tmp.cost + c[tmp.now]));
			}
		}
		System.out.println(node[n-1].cost);	
	}
	static class Data implements Comparable<Data>{
		int now;
		int cost;
		Data(int a, int b) {
			now  = a;
			cost = b;
		}
		@Override
		public int compareTo(Data o) {
			return this.cost - o.cost;
		}
	}
	static class Node {
		int cost;
		boolean check;
		ArrayList<Integer> edge_to = new ArrayList<Integer>();
	}
}