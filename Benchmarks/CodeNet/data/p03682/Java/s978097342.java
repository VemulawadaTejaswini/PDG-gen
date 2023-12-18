import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		solver.solve();
	}
}

class Solver {
	int LastColor = 0;

	private class Cluster {
		int Color;

		public Cluster() {
			Color = LastColor;
			LastColor++;
		}
	}

	private class Town {
		int X;
		int Y;
		Cluster C;

		public Town(int x, int y) {
			super();
			X = x;
			Y = y;
			C = null;
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
			Town other = (Town) obj;
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

		@Override
		public String toString() {
			return "Town [X=" + X + ", Y=" + Y + "]";
		}

	}

	private class Road {
		Town T1;
		Town T2;

		public Road(Town t1, Town t2) {
			super();
			T1 = t1;
			T2 = t2;
		}

		public int cost() {
			int xdiff = T1.X - T2.X;
			if (xdiff < 0)
				xdiff *= -1;
			int ydiff = T1.Y - T2.Y;
			if (ydiff < 0)
				ydiff *= -1;
			return Integer.min(xdiff, ydiff);
		}

		public boolean isSameCluster() {
			if (T1.C instanceof Cluster && T2.C instanceof Cluster)
				return T1.C.Color == T2.C.Color;
			return false;
		}

		public void mergeCluster() {
			if (T1.C instanceof Cluster && T2.C instanceof Cluster)
				T2.C.Color = T1.C.Color;
			else if (T1.C instanceof Cluster && !(T2.C instanceof Cluster))
				T2.C = T1.C;
			else if (!(T1.C instanceof Cluster) && T2.C instanceof Cluster)
				T1.C = T2.C;
			else {
				Cluster c = new Cluster();
				T1.C = c;
				T2.C = c;
			}
		}

		@Override
		public String toString() {
			return "Road [T1=" + T1 + ", T2=" + T2 + ", cost=" + cost() + "]";
		}
	}

	int N;
	int cnt;
	ArrayList<Town> Towns;

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		Towns = new ArrayList<Town>();
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
		String[] strArr = str.split(" ");
		int x = Integer.parseInt(strArr[0]);
		int y = Integer.parseInt(strArr[1]);
		// System.out.println(x + " " + y);
		Towns.add(new Town(x, y));
	}

	public void solve() {
		// for (Town t : Towns)
		// System.out.println(t);

		Towns.sort(new Comparator<Town>() {
			public int compare(Town t1, Town t2) {
				return t1.X - t2.X;
			}
		});

		// System.out.println("ソートX");
		// for (Town t : Towns)
		// System.out.println(t);

		ArrayList<Road> iniRoads = new ArrayList<Road>();
		Town prevTown = null;
		for (Town t : Towns) {
			if (prevTown instanceof Town)
				iniRoads.add(new Road(prevTown, t));
			prevTown = t;
		}

		// for (Road r : iniRoads)
		// System.out.println(r);

		Towns.sort(new Comparator<Town>() {
			public int compare(Town t1, Town t2) {
				return t1.Y - t2.Y;
			}
		});

		// System.out.println("ソートY");
		// for (Town t : Towns)
		// System.out.println(t);

		prevTown = null;
		for (Town t : Towns) {
			if (prevTown instanceof Town)
				iniRoads.add(new Road(prevTown, t));
			prevTown = t;
		}

		iniRoads.sort(new Comparator<Road>() {
			public int compare(Road r1, Road r2) {
				return r1.cost() - r2.cost();
			}
		});

		long ans = 0;
		int cnt = 0;
		for (Road r : iniRoads) {
			if (r.isSameCluster())
				continue;
			// System.out.println(r);
			ans += (long) r.cost();
			r.mergeCluster();
			cnt++;
			if (cnt >= N - 1)
				break;
		}
		System.out.println(ans);
	}
}
