
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	@SuppressWarnings("unchecked")
	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			m = scanner.nextInt();
			if ((n | m) == 0)
				break;
			lists = new ArrayList[n];
			for (int i = 0; i < n; i++)
				lists[i] = new ArrayList<Integer>();
			for (int i = 0; i < m; i++) {
				int a = scanner.nextInt() - 1;
				int b = scanner.nextInt() - 1;
				lists[a].add(b);
				lists[b].add(a);
			}
			b = new boolean[n];
			ans = 0;
			Deque<Integer> deque = new ArrayDeque<Integer>();
			deque.offer(0);
			b[0] = true;
			for (int k = 0; k < 2; k++) {
				int size = deque.size();
				for (int i = 0; i < size; i++) {
					int a = deque.poll();
					for (int t : lists[a]) {
						if (b[t])
							continue;
						b[t] = true;
						ans++;
						deque.offer(t);
					}
				}
			}
			System.out.println(ans);
		}
	}

	int n, m, ans;
	List<Integer>[] lists;
	boolean[] b;
}