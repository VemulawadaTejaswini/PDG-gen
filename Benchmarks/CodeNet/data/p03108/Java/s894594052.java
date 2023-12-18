import java.util.Scanner;
import java.util.TreeMap;

class UnionFind{
	int[] par;
	int[] cnt;
	int N;
	public UnionFind(int n){
		N = n;
		par = new int[N];
		for(int i = 0; i < N; i++){
			par[i] = i;
		}
	}
	public int find(int x){
		if(par[x] == x) return x;
		int parent = find(par[x]);
		return par[x] = parent;
	}
	public Boolean same(int x, int y){
		return find(x) == find(y);
	}
	public void unite(int x, int y){
		if(find(x) == find(y)) return;
		par[find(y)] = find(x);
	}
}
class Edge{
	int s, t;
	public Edge(int _s, int _t) {
		s = _s; t = _t;
	}
}
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		Edge[] edges = new Edge[M];
		UnionFind uf = new UnionFind(N);
		for(int i = 0; i < M; i++) {
			edges[i] = new Edge(sc.nextInt(), sc.nextInt());
		}
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int[] ans = new int[M];
		ans[M - 1] = (N - 1) * N / 2; // 全て崩壊したとき
		for(int i = M - 2; i >= 0; i--) {
			// edges[i + 1]の橋が復活した時
			int source = uf.find(edges[i + 1].s - 1), sink = uf.find(edges[i + 1].t - 1);
			if(source == sink) {
				ans[i] = ans[i + 1];
				continue;
			}
			int first = (map.containsKey(source)) ? map.get(source) : 1;
			int second = (map.containsKey(sink)) ? map.get(sink) : 1;
			ans[i] = Math.max(0, ans[i + 1] - (first * second));
			uf.unite(edges[i + 1].s - 1, edges[i + 1].t - 1);
			uf.find(edges[i + 1].s - 1); uf.find(edges[i + 1].t - 1);
			map.put(uf.find(edges[i + 1].s - 1), first + second);
		}
		for(int a : ans) System.out.println(a);
	}
}