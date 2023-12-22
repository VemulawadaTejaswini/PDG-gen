
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int R = scanner.nextInt();
		int L = scanner.nextInt();
		Pair[] pairs = new Pair[N];
		TreeSet<Pair> set = new TreeSet<Pair>();
		int[] c = new int[N];
		for (int i = 0; i < N; i++) {
			pairs[i] = new Pair(i, 0);
		}
		int now = 0;
		int index = 0;

		for (int i = 0; i < R; i++) {
			int d = scanner.nextInt() - 1;
			int t = scanner.nextInt();
			int x = scanner.nextInt();
			c[index] += t - now;
			set.remove(pairs[d]);
			pairs[d].point += x;
			set.add(pairs[d]);
			index = set.first().id;
			now = t;
		}
		c[index] += L - now;
		int ans = 0;
		int max = 0;
		for (int i = 0; i < N; i++) {
			if (max < c[i]) {
				max = c[i];
				ans = i;
			}
		}
		System.out.println(ans + 1);

	}

	class Pair implements Comparable<Pair> {
		int id, point;

		public Pair(int id, int point) {
			super();
			this.id = id;
			this.point = point;
		}

		@Override
		public String toString() {
			return "Pair [id=" + id + ", point=" + point + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + id;
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
			if (id != other.id)
				return false;
			return true;
		}

		@Override
		public int compareTo(Pair o) {
			if (this.point == o.point)
				return this.id - o.id;
			return o.point - this.point;
		}

		private Main getOuterType() {
			return Main.this;
		}

	}
}