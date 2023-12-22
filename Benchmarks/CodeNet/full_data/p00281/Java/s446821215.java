
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	@SuppressWarnings("unchecked")
	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		List<Pair>[] lists = new ArrayList[n];
		for (int i = 0; i < n; i++)
			lists[i] = new ArrayList<Pair>();
		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			if ((a | b | c) == 0)
				break;
			lists[a - 1].add(new Pair(b - 1, c));
		}
		int r = scanner.nextInt();
		StringBuilder builder = new StringBuilder();
		while (r-- > 0) {
			int[] b = new int[m];
			for (int i = 0; i < m; i++)
				b[i] = scanner.nextInt();
			int res = 0;
			for (Pair p : lists[0]) {
				res += b[p.b] * p.cost;
			}
			builder.append(res);
			for (int i = 1; i < n; i++) {
				res = 0;
				for (Pair pair : lists[i]) {
					res += b[pair.b] * pair.cost;
				}
				builder.append(' ').append(res);
			}
			builder.append('\n');
		}
		System.out.println(builder);
	}

	class Pair {
		int b, cost;

		public Pair(int b, int cost) {
			super();
			this.b = b;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Pair [b=" + b + ", cost=" + cost + "]";
		}

	}
}