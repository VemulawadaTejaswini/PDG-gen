import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		solver.readQ(in.readLine());
		for (; solver.hasQ();) {
			solver.solve(in.readLine());
		}
	}
}

class Solver {
	int H;
	int W;
	int D;
	int cnt;

	public void init() {
		H = 0;
		W = 0;
		D = 0;
		cnt = 0;
	}

	int[][] A;

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		H = Integer.parseInt(strArr[0]);
		W = Integer.parseInt(strArr[1]);
		D = Integer.parseInt(strArr[2]);
		A = new int[H][W];
	}

	public boolean hasNext() {
		return cnt < H;
	}

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		for (int i = 0; i < W; i++)
			A[cnt][i] = Integer.parseInt(strArr[i]);
		cnt++;
	}

	private class Cell {
		int X;
		int Y;

		public Cell(int x, int y) {
			super();
			X = x;
			Y = y;
		}

		@Override
		public String toString() {
			return "Cell [X=" + X + ", Y=" + Y + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + X;
			result = prime * result + Y;
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
			Cell other = (Cell) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (X != other.X)
				return false;
			if (Y != other.Y)
				return false;
			return true;
		}

		private Solver getOuterType() {
			return Solver.this;
		}

	}

	int Q;
	HashMap<Integer, Cell> CellMap;

	HashMap<Integer, HashMap<Integer, Integer>> Mem;

	public void readQ(String str) {
		Q = Integer.parseInt(str);
		cnt = 0;
		CellMap = new HashMap<Integer, Cell>();
		for (int h = 0; h < H; h++) {
			for (int w = 0; w < W; w++) {
				CellMap.put(A[h][w], new Cell(h, w));
			}
		}
		Mem = new HashMap<Integer, HashMap<Integer, Integer>>();
	}

	public boolean hasQ() {
		return cnt < Q;
	}

	public void solve(String str) {
		cnt++;
		// for (int h = 0; h < H; h++) {
		// for (int w = 0; w < W; w++)
		// System.out.printf(" %3d", A[h][w]);
		// System.out.println();
		// }

		String[] strArr = str.split(" ");
		int L = Integer.parseInt(strArr[0]);
		int R = Integer.parseInt(strArr[1]);

		if (Mem.containsKey(L) && Mem.get(L).containsKey(R)) {
			System.out.println(Mem.get(L).get(R));
			return;
		}

		Cell pc = CellMap.get(L);
		int ans = 0;
		for (int n = L; n <= R; n += D) {
			// System.out.println(CellMap.get(n));
			Cell nc = CellMap.get(n);
			ans += Math.abs(nc.X - pc.X);
			ans += Math.abs(nc.Y - pc.Y);
			pc = nc;
		}

		if (!Mem.containsKey(L))
			Mem.put(L, new HashMap<Integer, Integer>());
		Mem.get(L).put(R, ans);
		System.out.println(ans);
	}
}
