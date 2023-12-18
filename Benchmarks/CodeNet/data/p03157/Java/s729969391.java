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
					uft.union(j, i, j + 1, i);
				}
				if (i != h - 1 && field[i][j] != field[i + 1][j]) {
					uft.union(j, i, j, i + 1);
				}
			}
		}
		int count = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (field[i][j] == '#') {
					for (int k = 0; k < h; k++) {
						for (int l = 0; l < w; l++) {
							if (field[k][l] == '.' && uft.same(j, i, l, k)) {
								count++;
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
	
	static class UnionFindTree {
		
		int[] parent;
		int w;
		
		public UnionFindTree(int h, int w) {
			this.w = w;
			parent = new int[h * w];
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
		
		public void union(int a, int b) {
			parent[a] = find(b);
		}
		
		public void union(int ax, int ay, int bx, int by) {
			union(ax + ay * w, bx + by * w);
		}
	}
}
