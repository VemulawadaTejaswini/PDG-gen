
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
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		Deque<Integer> deque = new ArrayDeque<Integer>();
		for (int i = 1; i <= n * 2; i++)
			deque.offer(i);
		for (int i = 0; i < m; i++) {
			int a = scanner.nextInt();
			if (a == 0) {
				Deque<Integer> tmp = new ArrayDeque<Integer>();
				Deque<Integer> tmp2 = new ArrayDeque<Integer>();
				for (int j = 0; j < n; j++)
					tmp.offer(deque.poll());
				for (int j = 0; j < n; j++) {
					tmp2.offer(tmp.poll());
					tmp2.offer(deque.poll());
				}
				deque = tmp2;
			} else {
				for (int j = 0; j < a; j++) {
					deque.offer(deque.poll());
				}
			}
		}
		while (!deque.isEmpty())
			System.out.println(deque.poll());
	}
}