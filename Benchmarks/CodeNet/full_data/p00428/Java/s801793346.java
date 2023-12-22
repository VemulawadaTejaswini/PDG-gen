
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if ((n | m) == 0)
				break;
			int[] num = new int[m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++) {
					int a = scanner.nextInt();
					num[j] += a;
				}
			NavigableSet<Pair> set = new TreeSet<Pair>();
			for (int i = 0; i < m; i++)
				set.add(new Pair(i + 1, num[i]));
			System.out.print(set.pollFirst());
			while (!set.isEmpty())
				System.out.print(" " + set.pollFirst());
			System.out.println();
		}
	}

	class Pair implements Comparable<Pair> {
		int id, point;

		public Pair(int id, int point) {
			super();
			this.id = id;
			this.point = point;
		}

		@Override
		public int compareTo(Pair o) {
			if (o.point == this.point)
				return this.id - o.id;
			return o.point - this.point;
		}

		@Override
		public String toString() {
			return String.valueOf(this.id);
		}

	}
}