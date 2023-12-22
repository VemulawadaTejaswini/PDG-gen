
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
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		List<Integer>[] G = new ArrayList[n];
		for (int i = 0; i < n; i++)
			G[i] = new ArrayList<Integer>();
		int[] deg = new int[n];
		for (int i = 0; i < m; i++) {
			int u = scanner.nextInt() - 1;
			int v = scanner.nextInt() - 1;
			G[u].add(v);
			deg[v]++;
		}
		boolean ambig = false;
		Deque<Integer> deque = new ArrayDeque<Integer>();
		for (int i = 0; i < n; i++) {
			if (deg[i] == 0)
				deque.push(i);
		}
		while (!deque.isEmpty()) {
			if (deque.size() >= 2)
				ambig = true;
			int u = deque.poll();
			System.out.println(u + 1);
			for (int v : G[u]) {
				deg[v]--;
				if (deg[v] == 0)
					deque.push(v);
			}
		}
		System.out.println(ambig ? 1 : 0);
	}
}