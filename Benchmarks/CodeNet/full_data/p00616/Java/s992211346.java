
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
		int y = 500;
		int z = 25000;
		while (true) {
			int n = scanner.nextInt();
			int h = scanner.nextInt();
			if ((n | h) == 0)
				break;

			Set<Integer> set = new HashSet<Integer>();
			while (h-- > 0) {
				String s = scanner.next();
				int a = scanner.nextInt() - 1;
				int b = scanner.nextInt() - 1;
				if (s.equals("xy")) {
					for (int i = 0; i < n; i++)
						set.add(a + y * b + i * z);
				} else if (s.equals("xz")) {
					for (int i = 0; i < n; i++)
						set.add(a + i * y + b * z);
				} else {
					for (int i = 0; i < n; i++)
						set.add(i + a * y + b * z);
				}
			}
			System.out.println(n * n * n - set.size());
		}
	}
}