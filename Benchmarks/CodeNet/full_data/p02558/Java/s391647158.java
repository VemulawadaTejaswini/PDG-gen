import java.util.*;

public class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int q = sc.nextInt();
    	StringBuilder sb = new StringBuilder();
    	UnionFindTree uft = new UnionFindTree(n);
    	for (int i = 0; i < q; i++) {
    	    int type = sc.nextInt();
    	    int a = sc.nextInt();
    	    int b = sc.nextInt();
    	    if (type == 0) {
    	        uft.unite(a, b);
    	    } else {
    	        if (uft.same(a, b)) {
    	            sb.append("1\n");
    	        } else {
    	            sb.append("0\n");
    	        }
    	    }
    	}
   	    System.out.print(sb);
	}
	
	static class UnionFindTree {
	    int[] parents;
	    
	    public UnionFindTree(int size) {
	        parents = new int[size];
	        for (int i = 0; i < size; i++) {
	            parents[i] = i;
	        }
	    }
	    
	    public int find(int x) {
	        if (x == parents[x]) {
	            return x;
	        } else {
	            return parents[x] = find(parents[x]);
	        }
	    }
	    
	    public boolean same(int x, int y) {
	        return find(x) == find(y);
	    }
	    
	    public void unite(int x, int y) {
	        if (!same(x, y)) {
	            parents[find(x)] = find(y);
	        }
	    }
	}
}