import java.util.Scanner;

public class Main {

	static long mod = 1000000007;

	static double function(double x, long m) {
		return x%m;
	}

	public static void main(String[] args) {
		// AtCoder_E
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int X = sc.nextInt();
		int M = sc.nextInt();
	    // Scannerクラスのインスタンスをクローズ
		sc.close();


		double ans = X;
		double before = X;

		for(int i=1; i<N; i++) {
			before = function(Math.pow(before,2),M);
			ans += before;
		}

		System.out.println(ans);

	}
}
