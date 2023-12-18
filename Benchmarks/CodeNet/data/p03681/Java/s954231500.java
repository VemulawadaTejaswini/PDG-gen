import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long N = reader.nextLong();
		long M = reader.nextLong();
		long ans = 1;
		if (Math.abs(N-M) > 1) {
			System.out.println(0);
			reader.close();
			return;
		}
		ans = consequentMultiply(N) * consequentMultiply(M);
		if (N == M) {
			ans *= 2;
		}

		System.out.println(ans % 1000000007);
		reader.close();

	}
	public static long consequentMultiply(long num) {
		long ans = 1;
		for (long i = num; i > 0; i--) {
			ans *= i;
			ans %= 1000000007;
		}
		return ans;

	}
}



