import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		UnionFindTree uft = new UnionFindTree(n);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int type = sc.nextInt();
		    if (type == 0) {
		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        int z = sc.nextInt();
		        uft.unite(x, y, z);
		    } else {
		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        sb.append(uft.diff(x, y)).append("\n");
		    }
		}
		System.out.print(sb);
	}
	
	static class UnionFindTree {
	    int[] parents;
	    int[] weight;
	    int[] rank;
	    
	    public UnionFindTree(int size) {
	        parents = new int[size];
	        weight = new int[size];
	        rank = new int[size];
	        for (int i = 0; i < size; i++) {
	            parents[i] = i;
	        }
	    }
	    
	    public int find(int x) {
	        if (parents[x] == x) {
	            return x;
	        } else {
	            int p = find(parents[x]);
	            weight[x] += weight[parents[x]];
	            return parents[x] = p;
	        }
	    }
	    
	    public boolean same(int x, int y) {
	        return find(x) == find(y);
	    }
	    
	    public void unite(int x, int y, int w) {
	        int xx = find(x);
	        int yy = find(y);
	        if (xx == yy) {
	            return;
	        }
	        if (rank[xx] < rank[yy]) {
	            weight[xx] = - weight[x] + weight[y] + w;
	            parents[xx] = yy;
	            rank[yy] = Math.max(rank[yy], rank[xx] + 1);
	        } else {
	            weight[yy] = weight[x] - weight[y] - w;
	            parents[yy] = xx;
	            rank[xx] = Math.max(rank[xx], rank[yy] + 1);
	        }
	    }
	    
	    public String diff(int x, int y) {
	        if (same(x, y)) {
	            return String.valueOf(weight[x] - weight[y]);
	        } else {
	            return "?";
	        }
	    }
	}
}

