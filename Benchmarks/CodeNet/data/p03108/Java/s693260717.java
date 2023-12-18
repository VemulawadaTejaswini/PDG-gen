import static java.lang.System.*;
import java.util.*;

class UnionFind {
    int[] par;

    UnionFind(int n) { 
    	par = new int[n];
        for(int i = 0; i < n; i++) par[i] = i;
    }

    int root(int x) {
        if (par[x] == x) return x;
        return par[x] = root(par[x]);
    }

    void unite(int x, int y) {
        int rx = root(x); 
        int ry = root(y);
        if (rx == ry) return; 
        
        par[rx] = ry;
    }

    boolean same(int x, int y) {
        int rx = root(x);
        int ry = root(y);
        return rx == ry;
    }
};

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		UnionFind uf = new UnionFind(n);

		int[] a = new int[m];
		int[] b = new int[m];
		for(int i=0; i<m; i++) {
			a[m-i-1] = sc.nextInt()-1;
			b[m-i-1] = sc.nextInt()-1;
		}
		
		long[] ans = new long[m];
		ans[0] = n*(n-1)/2;
		
		for(int i=0; i<m-1; i++) {
			if(uf.same(a[i], b[i])) ans[i+1] = ans[i];
			else {
				int ar = uf.root(a[i]);
				int br = uf.root(b[i]);
				long ac = 0, bc = 0;
				for(int j=0; j<n; j++) {
					if(uf.root(j) == ar) ac++;
					else if(uf.root(j) == br) bc++;
				}
				ans[i+1] = ans[i] - ac * bc;
				uf.unite(a[i], b[i]);
			}
		}

		for(int i=0; i<m; i++) {
			out.println(ans[m-i-1]); 
		}
	}

}
