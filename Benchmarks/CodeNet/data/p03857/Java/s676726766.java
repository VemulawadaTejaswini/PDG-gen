import java.util.*;

public class Main {
	static final long BASE = 2000000;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		UnionFindTree roadTree = new UnionFindTree(n);
		for (int i = 0; i < k; i++) {
			roadTree.unite(sc.nextInt() - 1, sc.nextInt() - 1);
		}
		UnionFindTree trainTree = new UnionFindTree(n);
		for (int i = 0; i < l; i++) {
			trainTree.unite(sc.nextInt() - 1, sc.nextInt() - 1);
		}
		HashMap<Long, Integer> counts = new HashMap<>();
		for (int i = 0; i < n; i++) {
			long key = roadTree.find(i) * BASE + trainTree.find(i);
			if (counts.containsKey(key)) {
				counts.put(key, counts.get(key) + 1);
			} else {
				counts.put(key, 1);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				sb.append(" ");
			}
			long key = roadTree.find(i) * BASE + trainTree.find(i);
			sb.append(counts.get(key));
		}
		System.out.println(sb);
	}
	
	static class UnionFindTree {
		int[] parents;
		
		public UnionFindTree (int size) {
			parents = new int[size];
			for (int i = 0; i < size; i++) {
				parents[i] = i;
			}
			
		}
		
		public int find(int x) {
			if (x == parents[x]) {
				return x;
			}
			int ans = find(parents[x]);
			parents[x] = ans;
			return ans;
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
