import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		long n = fact(N) / (2 * fact(N - 2));
		long m = fact(M) / (2 * fact(M - 2));
		System.out.println(n + m);
	}
	static long fact(int n) {
		long r = 1;
		for(int i = 1; i <= n; i++) {
			r *= i;
		}
		return r;
	}
}
