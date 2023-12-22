import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long border = 1000000000000000000L;
		int N = sc.nextInt();
		long A = 0L;
		long sum = 1L;

		for (int i = 0; i < N; i++) {
			A = sc.nextLong();
			if (A < 1) {
				System.out.println(0);
				return;
			}
			sum = A * sum;
			if (sum > border) {
				System.out.println(-1);
				return;
			}
		}

		System.out.println(sum);

		sc.close();
	}

}
