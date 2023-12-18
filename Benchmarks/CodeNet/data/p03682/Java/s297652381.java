import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		new Main().solve();
	}
	
	int N;
	int []x;
	int []y;
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		x=new int[N];
		y=new int[N];
		ArrayList<Edge> list=new ArrayList<>();
		int max_weight=0;
		int max=0;
		
		for(int i=0;i<N;i++){
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		
		for(int i=0;i<N;i++){
			for(int j=i;j<N;j++){
				if(i!=j){
					int w=Math.min(Math.abs(x[i]-x[j]),Math.abs(y[i]-y[j]));
					list.add(new Edge(w,i,j));
					max_weight+=w;
					max+=w;
				}
			}
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		
		int ans=Integer.MAX_VALUE;

		
		for (int i = 0; i < list.size(); i++) {
			// 道iのコストより大きい物だけを使って最小全域木を作ってみる
			
			if (i > 0 && list.get(i).weight == list.get(i - 1).weight) {
				// もう調べたコストならスルー
				continue;
			}

			PriorityQueue<Edge> priorityQueue = new PriorityQueue<Edge>();
			for (int j = i; j < list.size(); j++) {
				priorityQueue.add(new Edge(list.get(j).weight, list.get(j).from, list.get(j).to));
			}

			UnionFind uf = new UnionFind(N);
			while (!priorityQueue.isEmpty()) {
				Edge e = priorityQueue.poll();
				if (!uf.isSame(e.from, e.to)) {
					max = Math.max(max, e.weight);
					uf.unite(e.from, e.to);
				}
			}

			// 全域木になっているかチェック
			boolean allSame = true;
			for (int j = 1; j < N; j++) {
				if (!uf.isSame(0, j)) {
					allSame = false;
					break;
				}
			}

			// 全域木なら解答を更新
			if (allSame) {
				ans = Math.min(ans, max - list.get(i).weight);
			} else {
				break;
			}
		}

		if (ans == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(max_weight-ans);
		}
		
	}
	
	class UnionFind {
		int[] parts;
		
		UnionFind(int n) {
			parts = new int[n];
			for (int i = 0; i < n; i++)
				parts[i] = i;
		}

		public int find(int x) {
			if (parts[x] == x)
				return x;
			return parts[x] = find(parts[x]);
		}

		public Boolean isSame(int x, int y) {
			return find(x) == find(y);
		}

		public void unite(int x, int y) {
			if (find(x) == find(y))
				return;
			parts[find(x)] = find(y);
		}
	}
	
	class Edge implements Comparable<Edge> {
		int weight;
		int from, to;

		Edge(int w, int f, int t) {
			this.weight = w;
			this.from = f;
			this.to = t;
		}

		@Override
		public int compareTo(Edge edge) {
			// 昇順
			return this.weight - edge.weight;
		}
	}

}