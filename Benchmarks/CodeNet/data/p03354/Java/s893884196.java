import java.util.*;

class UnionFind {
    int[] roots;
	
	public UnionFind(int N) {
		this.roots = new int[N];
		for(int i = 0; i < N; ++i) this.roots[i] = i;
	}
	
	int getRoot(int x) {
		if(this.roots[x] == x) return x;
		else return this.roots[x] = getRoot(this.roots[x]);
	}
	
	boolean isSameSet(int x, int y) {
		return getRoot(x) == getRoot(y);
	}
	
	void unite(int x, int y) {
	    int rx = getRoot(x);
	    int ry = getRoot(y);
	    if(rx == ry) return;
	    roots[rx] = ry;
	}
}

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main (String[] args) {
        int N = sc.nextInt();
        UnionFind uf = new UnionFind(N);
        int M = sc.nextInt();
        
        int[] p = new int[N];
        for(int i = 0; i < N; ++i) p[i] = sc.nextInt() - 1;
        
        for(int i = 0; i < M; ++i) {
            uf.unite(sc.nextInt() - 1, sc.nextInt() - 1);
        }
        
        int ans = 0;
        for(int i = 0; i < N; ++i) {
            if(uf.isSameSet(i, p[i])) ++ans;
        }
        System.out.println(ans);
        
    }
}