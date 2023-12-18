import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N, A, B;
		N = sc.nextLong();
		A = sc.nextLong();
		B = sc.nextLong();
		sc.close();

		long ans = 0;
		long sum = 0;
		while (sum <= N) {
			sum += A;
			ans += A;
			if (sum <= N) {
				sum += B;
			} else {
				System.out.println(ans - (sum - N));
				return;
			}
		}
		System.out.println(ans);
	}
}
