
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String line = scanner.next();
			if (line.equals("#"))
				break;
			int now = 0;
			for (int i = 0; i < line.length(); i++) {
				int a = line.charAt(i) - '0';
				now = move[now][a];
			}
			System.out.println(now == 5 ? "Yes" : "No");
		}
	}

	int[][] move = { { 1, 2 }, { 6, 3 }, { 1, 6 }, { 4, 5 }, { 5, 2 },
			{ 2, 1 }, { 6, 6 } };
}