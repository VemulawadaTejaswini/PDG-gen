import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] field = new char[h][];
		for (int i = 0; i < h; i++) {
			field[i] = sc.next().toCharArray();
		}
		UnionFindTree uft = new UnionFindTree(h, w);
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (j != w - 1 && field[i][j] != field[i][j + 1]) {
					uft.union(j + i * w, j + 1 + i * w, field[i][j], field[i][j + 1]);
				}
				if (i != h - 1 && field[i][j] != field[i + 1][j]) {
					uft.union(j + i * w, j + (i + 1) * w, field[i][j], field[i + 1][j]);
				}
			}
		}
		System.out.println(uft.count());
	}
	
	static class UnionFindTree {
		
		int[] parent;
		int[] bCount;
		int[] wCount;
		int w;
		
		public UnionFindTree(int h, int w) {
			this.w = w;
			parent = new int[h * w];
			bCount = new int[h * w];
			wCount = new int[h * w];
			for (int i = 0; i < h * w; i++) {
				parent[i] = i;
			}
		}
		
		public int find(int i) {
			if (parent[i] == i) {
				return i;
			}
			int p = find(parent[i]);
			parent[i] = p;
			return p;
		}
		
		public int find(int x, int y){
			return find(x + y * w);
		}
		
		public boolean same(int a, int b) {
			return (find(a) == find(b));
		}
		
		public boolean same(int ax, int ay, int bx, int by) {
			return same(ax + ay * w, bx + by * w);
		}
		
		public void union(int a, int b, char aa, char bb) {
			int aaa = find(a);
			int bbb = find(b);
			if (aaa == bbb) {
				return;
			}
			if (bCount[aaa] + wCount[aaa] == 0) {
				if (aa == '#') {
					bCount[aaa] = 1;
				} else {
					wCount[aaa] = 1;
				}
			}
			if (bCount[bbb] + wCount[bbb] == 0) {
				if (bb == '#') {
					bCount[bbb] = 1;
				} else {
					wCount[bbb] = 1;
				}
			}
			parent[aaa] = bbb;
			bCount[bbb] += bCount[aaa];
			wCount[bbb] += wCount[aaa];
		}
		
		public long count() {
			long ans = 0;
			for (int i = 0; i < parent.length; i++) {
				if (parent[i] == i) {
					ans += bCount[i] * wCount[i];
				}
			}
			return ans;
		}
	}
}
