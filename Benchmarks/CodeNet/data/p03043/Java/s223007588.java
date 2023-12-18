import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		double K = sc.nextDouble();

		double ans = 0;
		int c = (int)N;

		if (N>=K) {
			ans += (N-K+1)/N;
			c = (int)K-1;
		}

		for (int i = 1; i <= c; i++) {
			long s = (int) (Math.log(K/i)/Math.log(2)) +1;
			ans +=Math.pow((double)0.5, s)/N;
		}
		System.out.println(ans);
	}
}
