import java.util.*;
public class Main {
	
	public static class unionfind{
		int[] parent;
		int[] rank;
		int[] number;
		public unionfind(int n){
			this.parent = new int[n+1];
			this.rank = new int[n+1];
			this.number = new int[n+1];
			for(int i = 1; i <= n; i++) set(i);
		}
		public void set(int i) {
			parent[i] = i;
			rank[i] = 0;
			number[i] = 1;
		}
		public int find(int i) {
			if (i == parent[i])
				return parent[i];
			else
				return parent[i] = find(parent[i]);
			
		}
		public boolean same(int x, int y){
			return find(x) == find(y);
		}
		public void unite(int x, int y) {
			int xroot = find(x);
			int yroot = find(y);
			if(xroot == yroot)
				return;
			if(rank[xroot] > rank[yroot]) {
				parent[yroot] = xroot;
				number[xroot] += number[yroot];
			}
			else if(rank[xroot] < rank[yroot]) {
				parent[xroot] = yroot;
				number[yroot] += number[xroot];
			}
			else {
				parent[yroot] = xroot;
				number[xroot] += number[yroot];
				rank[xroot]++;
			}
		}
		public int getnumber(int i) {
			return number[find(i)];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] A = new int[m];
		int[] B = new int[m];
		for(int i = 0; i < m; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		unionfind u = new unionfind(n);
		long[] ans = new long[m+1];
		ans[0] = n*(n-1)/2;
		long count = 0;
		for(int i = m-1; i >= 1; i--) {				
			if(!u.same(A[i], B[i]))
				count += u.getnumber(A[i])*u.getnumber(B[i]);
			ans[i] = count;
			u.unite(A[i], B[i]);
		}
		if(m > 1){
			for(int i = 1; i < m; i++) 
				System.out.println(n*(n-1)/2 - ans[i]);
		}
		System.out.println(n*(n-1)/2);
	}
}