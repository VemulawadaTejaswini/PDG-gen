import java.util.*;

public class Main {
    static final int SIZE = 40;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] lefts = new int[m];
		int[] rights = new int[m];
		for (int i = 0; i < m; i++) {
		    lefts[i] = sc.nextInt() - 1;
		    rights[i] = sc.nextInt() - 1;
		}
		long[] values = new long[m];
		UnionFindTree uft = new UnionFindTree(n);
		for (int i = m - 1; i >= 0; i--) {
		    values[i] = uft.getValue();
		    uft.unite(lefts[i], rights[i]);
		}
		StringBuilder sb = new StringBuilder();
		for (long x : values) {
		    sb.append(x).append("\n");
		}
		System.out.print(sb);
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
        
        public void unite(int x, int y) {
            int xx = find(x);
            int yy = find(y);
            if (xx == yy) {
                return;
            }
            parents[xx] = yy;
            counts[yy] += counts[xx];
        }
        
        public long getValue() {
            int size = parents.length;
            long total = 0;
            for (int i = 0; i < size; i++) {
                total += size - counts[find(i)];
            }
            return total / 2;
        }
    }
}

