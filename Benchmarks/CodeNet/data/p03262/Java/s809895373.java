import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long X = in.nextLong();
		long[] r = new long[N];
		for (int i = 0; i < N; i++) {
			r[i] = Math.abs(X - in.nextLong());
		}
		Arrays.sort(r);
		long ans = r[0];
		for (int i = 1; i < N - 1; i++) {
			ans = gcd(r[i], ans);
		}
		System.out.println(ans);
		in.close();
	}

	static long gcd(long m, long n) {
		long temp;
		while (m % n != 0) {
			temp = n;
			n = m % n;
			m = temp;
		}
		return n;
	}
}