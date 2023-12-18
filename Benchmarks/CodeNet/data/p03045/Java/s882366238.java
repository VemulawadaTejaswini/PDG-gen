import java.util.HashSet;
import java.util.Scanner;

class UnionFind{
	int[] par;
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
		return par[x] = find(par[x]);
	}
	public Boolean same(int x, int y){
		return find(x) == find(y);
	}
	public void unite(int x, int y){
		if(find(x) == find(y)) return;
		par[find(x)] = find(y);
	}
	public int DistinctElementsNum(){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < N; i++){
			find(i);
			set.add(find(i));
		}
		return set.size();
	}
}


class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		UnionFind uf = new UnionFind(N);
		for(int i = 0; i < M; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int Z = sc.nextInt();
			uf.unite(X - 1, Y - 1);
		}
		System.out.println(uf.DistinctElementsNum());
	}
}