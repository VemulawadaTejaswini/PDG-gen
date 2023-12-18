import java.util.Scanner;

public class Main {

	static int mod = 100000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		if (Math.abs(N - M) > 1) {
			System.out.println(0);
			in.close();
			return;
		}
		int dog = 1;
		for (int i = 1; i <= N; i++) {
			dog = (dog * i) % mod;
		}
		int mon = 1;
		for (int i = 1; i <= M; i++) {
			mon = (mon * i) % mod;
		}
		int ans = N == M ? dog * mon * 2 % mod : dog * mon % mod;
		System.out.println(ans);
		in.close();
	}

}