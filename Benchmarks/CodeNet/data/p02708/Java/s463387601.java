import java.util.Scanner;

public class Main {

	private static final long N = 1_000_000_007L;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), k = scanner.nextInt();
			long answer = 0L;
			for (int i = k; i <= n + 1; i++) {
				answer += f(n + 1, i);
				answer = answer % N;
			}
			System.out.println(answer);
		}
	}

	private static long f(long n, long m) {
		return m * n - g(m - 1) - g(m) + 1;
	}

	private static long g(long m) {
		return m * (m + 1) / 2L;
	}
}
