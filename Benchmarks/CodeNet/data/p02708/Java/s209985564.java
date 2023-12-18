import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		int K = scan.nextInt();

		long answer = 0;
		for (long i = K; i <= N + 1; i++) {
			long temp = 0;
			temp += i * (2 * (N - i + 1) + (i - 1)) / 2;
			temp -= (i * (i - 1) / 2) - 1;

			answer += temp % 1000000007;
		}

		System.out.println(answer % 1000000007);
	}
}