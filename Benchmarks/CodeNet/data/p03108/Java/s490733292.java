import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] p=new int[m][2];
		for(int i=0;i<m;i++){
			p[i][0]=sc.nextInt();
			p[i][1]=sc.nextInt();
		}
		sc.close();
		UnionFind uf = new UnionFind(n);
		long[] ans = new long[m];
		long now = (long)n * (n -1) / 2;
		for(int i=m-1;i>=0;i--){
			ans[i] = now;
			int a = uf.find(p[i][0] - 1);
			int b = uf.find(p[i][1] - 1);
			if (a != b) {
				now -= (long)uf.size[a] * uf.size[b];
			}
			uf.union(p[i][0]-1, p[i][1]-1);
		}
	    for (long v : ans) {
	    	System.out.println(v);
	    }
	}

	static class UnionFind {
		private int[] parent;
		private int[] rank;
		public int g;
		public int[] size;

		public UnionFind(int s) {
			parent = new int[s];
			rank = new int[s];
			for (int i = 0; i<s; i++) {
				this.parent[i] = i;
				this.rank[i] = 1;
			}
			this.g = s;
			size = new int[s];
			Arrays.fill(size, 1);
		}

		public boolean isSame(int n1, int n2) {
			return find(n1) == find(n2);
		}

		public int find(int n) {
			if (parent[n] == n) {
				return n;
			} else {
				return parent[n]=find(parent[n]);
			}
	    }

		public void union(int n1, int n2) {
	    	int root1 = find(n1);
	    	int root2 = find(n2);
	    	if (root1 != root2) g --;
	    	if (root1 != root2) {
	    		int x = size[root1] + size[root2];
	    		size[root1] = x;
	    		size[root2] = x;
	    	}
	    	if (rank[root1] < rank[root2]) {
	    		parent[root1] = root2;
	    	} else if (rank[root1] > rank[root2]) {
	    		parent[root2] = root1;
	    	} else if (root1 != root2) {
	    		parent[root2] = root1;
	    		rank[root1]++;
	    	}
		}
	}
}