import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		UnionFindTree uft = new UnionFindTree(n);
		for (int i = 0; i < m; i++) {
		    uft.unite(sc.nextInt() - 1, sc.nextInt() - 1);
		}
		HashSet<Integer> cities = new HashSet<>();
		int count = 0;
		for (int i = 0; i < n; i++) {
		    int x = uft.find(i);
		    if (i != x) {
		        cities.add(x);
		    } else {
		        count++;
		    }
		}
		int cityCount = cities.size();
		int vilCount = count - cityCount;
		System.out.println(Math.abs(cityCount - vilCount));
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
	    
	    public void unite(int x, int y) {
	        int xx = find(x);
	        int yy = find(y);
	        if (xx == yy) {
	            return;
	        }
	        parents[xx] = yy;
	    }
	}
}

