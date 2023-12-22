
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		int h = scanner.nextInt();
		int n = scanner.nextInt();
		int nowx = scanner.nextInt();
		int nowy = scanner.nextInt();
		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			if ((nowx < x && nowy < y) || (nowx > x && nowy > y)) {
				ans += Math.max(Math.abs(y - nowy), Math.abs(x - nowx));
			} else {
				ans += Math.abs(y - nowy) + Math.abs(x - nowx);
			}
			nowx = x;
			nowy = y;
		}
		System.out.println(ans);

	}
}