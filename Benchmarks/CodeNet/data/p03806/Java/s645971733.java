import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int Ma = sc.nextInt();
		final int Mb = sc.nextInt();
		int[][] costTable = new int[N * 10 + 1][N * 10 + 1];
		for (int i = 0; i < costTable.length; i++) {
			for (int j = 0; j < costTable[i].length; j++) {
				costTable[i][j] = Integer.MAX_VALUE;
			}
		}
		HashSet<AB> created = new HashSet<>();
		for (int i = 0; i < N; i++) {
			int ai = sc.nextInt();
			int bi = sc.nextInt();
			int ci = sc.nextInt();
			costTable[ai][bi] = Math.min(costTable[ai][bi], ci);
			ArrayList<AB> newCreate = new ArrayList<>();
			for (AB ab : created) {
				costTable[ab.a + ai][ab.b + bi] = Math.min(costTable[ab.a + ai][ab.b + bi], costTable[ab.a][ab.b] + ci);
				AB newAB = new AB(ab.a + ai, ab.b + bi);
				if (!created.contains(newAB)) {
					newCreate.add(newAB);
				}
			}
			AB thisOne = new AB(ai, bi);
			if (!created.contains(thisOne)) {
				created.add(thisOne);
			}
			for (AB ab : newCreate) {
				created.add(ab);
			}
		}
		int minCost = Integer.MAX_VALUE;
		for (AB ab : created) {
			if (ab.ma == Ma && ab.mb == Mb) {
				minCost = Math.min(minCost, costTable[ab.a][ab.b]);
			}
		}
		if (minCost == Integer.MAX_VALUE) {
			minCost = -1;
		}

		System.out.println(minCost);
		sc.close();
	}

	class AB {
		public final int a;
		public final int b;
		public final int ma;
		public final int mb;

		public AB(int a, int b) {
			this.a = a;
			this.b = b;
			int g = gcd(a, b);
			this.ma = a / g;
			this.mb = b / g;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AB other = (AB) obj;
			if (a != other.a)
				return false;
			if (b != other.b)
				return false;
			return true;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + a;
			result = prime * result + b;
			return result;
		}

		private int gcd(int x, int y) {
			if (y > x) {
				return gcd(y, x);
			}
			int r = x % y;
			if (r == 0) {
				return y;
			} else {
				return gcd(y, r);
			}
		}
	}

}
