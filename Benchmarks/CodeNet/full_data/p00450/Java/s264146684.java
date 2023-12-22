
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			Deque<Pair> deque = new ArrayDeque<Pair>();
			deque.push(new Pair(scanner.nextInt(), 1));
			for (int i = 2; i <= n; i++) {
				int a = scanner.nextInt();
				if (deque.peek().clr == a)
					deque.peek().num++;
				else {
					if (i % 2 == 0) {
						int num = deque.poll().num + 1;
						if (deque.isEmpty())
							deque.push(new Pair(a, num));
						else
							deque.peek().num += num;
					} else {
						deque.push(new Pair(a, 1));
					}
				}
			}
			int wcnt = 0;
			while (!deque.isEmpty()) {
				Pair p = deque.poll();
				wcnt += p.clr == 0 ? p.num : 0;
			}
			System.out.println(wcnt);
		}
	}

	class Pair {
		int clr, num;

		public Pair(int clr, int num) {
			super();
			this.clr = clr;
			this.num = num;
		}

		@Override
		public String toString() {
			return "Pair [clr=" + clr + ", num=" + num + "]";
		}

	}
}