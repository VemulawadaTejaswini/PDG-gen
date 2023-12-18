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
		costTable[0][0] = 0;
		HashSet<Integer> s = new HashSet<>();

		for (int i = 0; i <= 400; i++) {
			for (int j = 0; j <= 400; j++) {
				int h = new AB(i, j).hashCode();
				s.add(h);
			}
		}
		System.out.println(s.size());

		HashSet<AB> created = new HashSet<>();
		for (int i = 0; i < N; i++) {
			int ai = sc.nextInt();
			int bi = sc.nextInt();
			int ci = sc.nextInt();
			costTable[ai][bi] = Math.min(costTable[ai][bi], ci);
			ArrayList<AB> newCreate = new ArrayList<>();
			newCreate.add(new AB(ai, bi));
			for (AB ab : created) {
				costTable[ab.a + ai][ab.b + bi] = Math.min(costTable[ab.a + ai][ab.b + bi], costTable[ab.a][ab.b] + ci);
				newCreate.add(new AB(ab.a + ai, ab.b + bi));
			}
			for (AB ab : newCreate) {
				created.add(ab);
			}
		}
		int minCost = Integer.MAX_VALUE;
		for (AB ab : created) {
			if (ab.a * Mb == ab.b * Ma) {
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

		public AB(int a, int b) {
			assert (a > 0 && b > 0);
			this.a = a;
			this.b = b;
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
			return 1000 * this.a + this.b;
		}

	}

}
