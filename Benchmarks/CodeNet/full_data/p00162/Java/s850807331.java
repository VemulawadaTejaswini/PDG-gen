
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 1000000;
		boolean[] map = new boolean[N + 1];
		for (int i = 1; i <= N; i *= 2) {
			for (int j = 1; i * j <= N; j *= 3) {
				for (int k = 1; i * j * k <= N; k *= 5) {
					int s = i * j * k;
					map[s] = true;
				}
			}
		}
		int c = 0;
		int[] num = new int[N+1];
		for (int i = 1; i <= N; i++) {
			if (map[i])
				c++;
			num[i] = c;
		}

		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int m = scanner.nextInt();

			System.out.println(num[m] - num[n - 1]);
		}
	}
}