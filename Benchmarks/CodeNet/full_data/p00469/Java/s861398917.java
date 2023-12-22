
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			k = scanner.nextInt();
			if ((n | k) == 0)
				break;
			num = new int[n];
			for (int i = 0; i < n; i++)
				num[i] = scanner.nextInt();
			set = new HashSet<String>();
			b = new boolean[n];
			dfs(0, "");
			System.out.println(set.size());
		}
	}

	private void dfs(int x, String s) {
		if (x == k) {
			set.add(s);
			return;
		}
		for (int i = 0; i < n; i++) {
			if(b[i])
				continue;
			b[i] = true;
			dfs(x + 1, s + num[i]);
			b[i] = false;
		}
	}

	int n, k;
	int[] num;
	boolean[] b;
	Set<String> set;
}