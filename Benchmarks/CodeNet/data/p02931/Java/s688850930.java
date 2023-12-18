import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		Unit[] units = new Unit[n];
		for (int i = 0; i < n; i++) {
			units[i] = new Unit(sc.nextInt() - 1, sc.nextInt() + h - 1, sc.nextInt());
		}
		Arrays.sort(units);
		UnionFindTree uft = new UnionFindTree(h, w);
		long total = 0;
		for (Unit u : units) {
			if (uft.canSet(u.r, u.c)) {
				uft.unite(u.r, u.c);
				total += u.value;
			}
		}
		System.out.println(total);
	}
	
	static class UnionFindTree {
		int hSize;
		int[] parents;
		int[] pCount;
		int[] hCount;
		public UnionFindTree(int hSize, int wSize) {
			this.hSize = hSize;
			parents = new int[hSize + wSize];
			pCount = new int[hSize + wSize];
			hCount = new int[hSize + wSize];
			for (int i = 0; i < parents.length; i++) {
				parents[i] = i;
				pCount[i] = 1;
			}
		}
		
		private int find(int x) {
			if (x == parents[x]) {
				return x;
			}
			int ans = find(parents[x]);
			parents[x] = ans;
			return ans;
		}
		
		private boolean canSet(int x, int y) {
			int xx = find(x);
			int yy = find(y);
			if (xx == yy) {
				return pCount[xx] >= hCount[xx] + 1;
			} else {
				return pCount[xx] + pCount[yy] >= hCount[xx] + hCount[yy] + 1;
			}
		}
		
		private void unite(int x, int y) {
			int xx = find(x);
			int yy = find(y);
			if (xx == yy) {
				hCount[xx]++;
			} else {
				parents[xx] = yy;
				pCount[yy] += pCount[xx];
				hCount[yy] += hCount[xx] + 1;
			}
		}
	}
	
	static class Unit implements Comparable<Unit> {
		int r;
		int c;
		int value;
		
		public Unit(int r, int c, int value) {
			this.r = r;
			this.c = c;
			this.value = value;
		}
		
		public int compareTo(Unit u) {
			return u.value - this.value;
		}
	}
}
