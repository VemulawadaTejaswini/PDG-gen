
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			char[] a = scanner.next().toCharArray();
			char[] b = scanner.next().toCharArray();
			if (String.valueOf(a).equals("0"))
				break;
			int[] num = new int[10];
			for (int i = 0; i < 4; i++) {
				num[a[i] - '0']++;
				num[b[i] - '0']++;

			}
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				if (num[i] == 2)
					sum++;
			}
			int ans = 0;
			for (int i = 0; i < 4; i++) {
				if (a[i] == b[i]) {
					ans++;
					sum--;
				}
			}
			System.out.println(ans + " " + sum);
		}
	}
}