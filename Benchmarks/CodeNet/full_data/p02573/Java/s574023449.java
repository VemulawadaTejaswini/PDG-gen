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
    	System.out.println(uft.getMax());
    }
    
    static class UnionFindTree {
        int[] parents;
        int[] counts;
        
        public UnionFindTree(int size) {
            parents = new int[size];
            counts = new int[size];
            for (int i = 0; i < size; i++) {
                parents[i] = i;
                counts[i] = 1;
            }
        }
        
        public int find(int x) {
            if (parents[x] == x) {
                return x;
            } else {
                return parents[x] = find(parents[x]);
            }
        }
        
        public boolean smae(int x, int y) {
            return find(x) == find(y);
        }
        
        public void unite(int x, int y) {
            int xx = find(x);
            int yy = find(y);
            if (xx == yy) {
                return;
            }
            parents[xx] = yy;
            counts[yy] += counts[xx];
        }
        
        public int getMax() {
            int max = 0;
            for (int x : counts) {
                max = Math.max(max, x);
            }
            return max;
        }
    }
}
