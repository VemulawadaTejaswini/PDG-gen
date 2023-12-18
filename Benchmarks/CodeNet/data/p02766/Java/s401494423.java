import java.util.Scanner;

public class Test002 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		digits(N, K);
	}

	public static int digits(int N, int K) {
		int count = 1;

		while (N >= K) {
			N = N / K;
			count++;
		}
		System.out.println(count);
		return 0;
	}
}