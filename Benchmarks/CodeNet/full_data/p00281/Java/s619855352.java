
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
		while (r-- > 0) {
			int[] b = new int[m];
			for (int i = 0; i < m; i++)
				b[i] = scanner.nextInt();

			for (int i = 0; i < n; i++) {
				int res = 0;
				for (Pair pair : lists[i]) {
					res += b[pair.b] * pair.cost;
				}
				System.out.print(res);
				System.out.print(i == n - 1 ? '\n' : ' ');
			}
		}
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