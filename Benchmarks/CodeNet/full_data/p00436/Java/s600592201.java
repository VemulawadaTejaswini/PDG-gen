
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n * 2; i++)
			list.add(i);
		for (int i = 0; i < m; i++) {
			List<Integer> tmp = new ArrayList<Integer>();
			int a = scanner.nextInt();
			if (a == 0) {
				for (int j = 0; j < n; j++) {
					tmp.add(list.get(j));
					tmp.add(list.get(j + n));
				}
			} else {
				for (int j = 0; j < n * 2; j++) {
					tmp.add(list.get((j + a) % (n * 2)));
				}
			}
			list = tmp;
		}
		for (int ans : list)
			System.out.println(ans);
	}
}