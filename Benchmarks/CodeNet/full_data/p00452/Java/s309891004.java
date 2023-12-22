
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
			int[] num = new int[n + 1];
			for (int i = 1; i <= n; i++)
				num[i] = scanner.nextInt();
			NavigableSet<Integer> set = new TreeSet<Integer>();
			for (int i = 0; i <= n; i++)
				for (int j = i; j <= n; j++)
					if (num[i] + num[j] <= m)
						set.add(num[i] + num[j]);
			int ans = 0;
			int l = set.first();
			int r = set.last();

			while (!set.isEmpty()) {
				if (l + r < m) {
					ans = Math.max(ans, l + r);
					l = set.pollFirst();
				} else {
					r = set.pollLast();
				}
			}
			System.out.println(ans);

		}
	}
}