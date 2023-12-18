import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int K = scanner.nextInt();

		int ans = 0;

		for (int i = 0; i < N; i++) {
			int h = scanner.nextInt();
			if (K <= h)
				ans++;
		}

		System.out.println(ans);
	}
}
