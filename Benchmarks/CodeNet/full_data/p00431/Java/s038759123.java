
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
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			lists = new ArrayList[101];
			for (int i = 0; i < 101; i++)
				lists[i] = new ArrayList<Integer>();
			while (n-- > 0) {
				int from = scanner.nextInt();
				int to = scanner.nextInt();
				lists[from].add(to);
				lists[to].add(from);
			}
			ans = 0;
			for (int i = 0; i < 101; i++) {
				if (lists[i].isEmpty())
					continue;
				b = new boolean[101];
				slove(i, 1);

			}
			System.out.println(ans);
		}
	}

	private void slove(int from, int step) {
		if (b[from])
			return;
		b[from] = true;
		ans = Math.max(ans, step);
		for (int to : lists[from]) {
			slove(to, step + 1);
		}
	}

	int ans;
	boolean[] b;
	List<Integer>[] lists;
}