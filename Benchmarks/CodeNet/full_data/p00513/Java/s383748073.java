
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			if (slove(a))
				ans++;
		}
		System.out.println(ans);
	}

	private boolean slove(int a) {
		for (int i = 1; i * i <= a; i++) {
			if ((a - i) % (2 * i + 1) == 0)
				return false;
		}
		return true;
	}
}