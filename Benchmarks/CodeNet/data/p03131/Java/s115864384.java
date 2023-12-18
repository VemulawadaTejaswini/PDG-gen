import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(solve());
	}

	static long solve() {
		long K = sc.nextInt();
		long A = sc.nextInt();
		long B = sc.nextInt();
		if (B - A < 2) {
			return 1 + K;
		} else {
			if (K <= A) {
				return 1 + K;
			}
			long exchange = (K - (A - 1)) / 2;
			return 1 + (K - exchange * 2) + exchange * (B - A);
		}
	}

}