
import java.io.IOException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			m = scanner.nextInt();
			n = scanner.nextInt();
			if ((m | n) == 0)
				break;
			M = new HashMap<Pair, Integer>();
			h = 1;
			a = new int[n][m];
			pairs = new Pair[24];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++) {
					int t = scanner.nextInt();
					if (t == 0) {
						a[i][j] = -1;
					} else if (t == 1) {
						pairs[h] = new Pair(i, j);
						a[i][j] = h++;
					} else {
						pairs[0] = new Pair(i, j);
						a[i][j] = 0;
					}
				}
			BitSet bit = new BitSet();
			bit.set(0);
			System.out.println(slove(0, bit));
		}
	}

	private int slove(int cur, BitSet bit) {
		Pair p = new Pair(cur, bit);
		if (M.containsKey(p))
			return M.get(p);
		int res = 0;
		for (int[] mo : move) {
			int y = pairs[cur].y;
			int x = pairs[cur].x;
			while (true) {
				y += mo[0];
				x += mo[1];
				if (!isOK(y, x))
					break;
				if (a[y][x] == 0)
					if (bit.cardinality() == h) {
						return res + 1;
					}
				
				if (a[y][x] >= 1) {
					if (bit.get(a[y][x]))
						continue;
					BitSet newbit = (BitSet) bit.clone();
					newbit.set(a[y][x]);
					res += slove(a[y][x],newbit);
					break;
				}
			}
		}
		M.put(p, res);
		return res;
	}

	private boolean isOK(int y, int x) {
		if (0 <= y && y < n && 0 <= x && x < m)
			return true;
		return false;
	}

	class Pair {
		int y, x;
		BitSet bit;

		public Pair(int y, BitSet bit) {
			super();
			this.y = y;
			this.bit = bit;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((bit == null) ? 0 : bit.hashCode());
			result = prime * result + y;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (bit == null) {
				if (other.bit != null)
					return false;
			} else if (!bit.equals(other.bit))
				return false;
			if (y != other.y)
				return false;
			return true;
		}

		public Pair(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}

		private Main getOuterType() {
			return Main.this;
		}

	}

	int m, n, h;
	Pair[] pairs;
	int[][] a;
	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
	Map<Pair, Integer> M;
}