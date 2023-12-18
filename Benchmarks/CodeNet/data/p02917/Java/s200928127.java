import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] b = new int[n + 1];

			for (int i = 1; i < n; i++) {
				b[i] = scanner.nextInt();
			}
			b[0] = b[n] = 1000000;

			int ans = 0;
			for (int i = 0; i < n; i++) {
				ans += Math.min(b[i], b[i+1]);
			}

			System.out.println(ans);
		}
	}
}
