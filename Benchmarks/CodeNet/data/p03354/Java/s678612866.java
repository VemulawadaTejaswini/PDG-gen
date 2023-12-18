import java.util.*;
public class Main {
		
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int p[] = new int[N];
		for(int i=0;i<N;i++)p[i]=sc.nextInt()-1;

		UnionFind uf = new UnionFind(N);
		
		for(int i=0;i<M;i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			
			uf.unite(x, y);
		
		}
		sc.close();
		
		int cnt = 0;
		for(int i=0;i<N;i++) {
			if(uf.same(i, p[i]))cnt++;
		}
		System.out.println(cnt);
		
	}
}

class UnionFind{
	
	int parent[];
	
	UnionFind(int N){
		parent = new int[N];
		Arrays.fill(parent, -1);
	}
	
	boolean same(int x, int y){
		return root(x)==root(y);
	}
	
	int root(int x) {
		if(parent[x]<0)return x;
		return parent[x] = root(parent[x]);
	}
	
	int size(int x) {
		return -parent[root(x)];
	}
	
	void unite(int x, int y) {
		if(size(x)<size(y)) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		int rx = root(x);
		int ry = root(y);
		
		if(rx==ry)return;
		
		parent[rx] += parent[ry];
		parent[ry] = rx;
		
	}
	
}