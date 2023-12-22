import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Path> queue = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        int x = sc.nextInt();
		        if (i >= j || x < 0) {
		            continue;
		        }
		        queue.add(new Path(i, j, x));
		    }
		}
		UnionFindTree uft = new UnionFindTree(n);
		long total = 0;
		while (queue.size() > 0) {
		    Path p = queue.poll();
		    if (uft.same(p)) {
		        continue;
		    }
		    uft.unite(p);
		    total += p.value;
		}
		System.out.println(total);
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
	        if (parents[x] == x) {
	            return x;
	        } else {
	            return parents[x] = find(parents[x]);
	        }
	    }
	    
	    public boolean same(int x, int y) {
	        return find(x) == find(y);
	    }
	    
	    public boolean same(Path p) {
	        return same(p.left, p.right);
	    }
	    
	    public void unite(int x, int y) {
	        if (same(x, y)) {
	            return;
	        }
	        parents[find(x)] = find(y);
	    }
	    
	    public void unite(Path p) {
	        unite(p.left, p.right);
	    }
	}
	
	static class Path implements Comparable<Path> {
	    int left;
	    int right;
	    int value;
	    
	    public Path(int left, int right, int value) {
	        this.left = left;
	        this.right = right;
	        this.value = value;
	    }
	    
	    public int compareTo(Path another) {
	        return value - another.value;
	    }
	}
}

