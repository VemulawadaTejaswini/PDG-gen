import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n, m;
	int[] p; 
	Pair[] pairs;
	public void run(){
		n = sc.nextInt();
		m = sc.nextInt();
		p = new int[n];
		for(int i = 0; i < n; i++){
			p[i] = sc.nextInt() - 1;
		}
		pairs = new Pair[m];
		for(int i = 0; i < m; i++){
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			
			if(x < y) pairs[i] = new Pair(x, y);
			else pairs[i] = new Pair(y, x);
		}
		
		solve();
	}
	public void solve(){
		UnionFind uf = new UnionFind(n);
		int gnum = 0;
		for(int i = 0; i < m; i++){
			Pair npair = pairs[i];
			uf.unite(npair.first, npair.second);
		}
		
		int ans = 0;
		
		for(int i = 0; i < n; i++){
			if(uf.same(i,  p[i])){
				ans = ans + 1;
			}
		}
		
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
	static class Pair {
        int first,second;
        public Pair(int a,int b) {
            this.first = a;
            this.second = b;
        }
    }	
	
	static class UnionFind{
		int par[];
		int rank[];
		
		public UnionFind(int t){
			par = new int[t];
			rank = new int[t];
			
			for(int i = 0; i < t; i++){
				par[i] = i;
				rank[i] = 0;
			}
		}
		
		int find(int x){
			if(par[x] == x){
				return x;
			}
			else{
				return par[x] = find(par[x]);
			}
		}
		
		void unite(int x, int y){
			x = find(x);
			y = find(y);
			if(x == y) return;
			
			if(rank[x] < rank[y]){
				par[x] = y;
			} else{
				 par[y] = x;
				 if(rank[x] == rank[y]) rank[x]++;
			}
			
		}
		
		boolean same(int x, int y){
			return find(x) == find(y);
		}
	}
}
