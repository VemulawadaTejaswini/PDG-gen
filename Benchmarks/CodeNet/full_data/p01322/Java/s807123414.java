
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int m = scanner.nextInt();
			String[] s = new String[n];
			int[] win = new int[n];
			for (int i = 0; i < n; i++) {
				s[i] = scanner.next();
				win[i] = scanner.nextInt();
			}
			String[] num = new String[m];
			int ans = 0;
			for (int i = 0; i < m; i++)
				num[i] = scanner.next();
			for (int i = 0; i < m; i++)
				loop: for (int j = 0; j < n; j++) {
					for (int k = 0; k < 8; k++) {
						if (s[j].charAt(k) == '*')
							continue;
						if (s[j].charAt(k) != num[i].charAt(k))
							continue loop;
					}
					ans += win[j];
					break;
				}
			System.out.println(ans);
		}
	}
}