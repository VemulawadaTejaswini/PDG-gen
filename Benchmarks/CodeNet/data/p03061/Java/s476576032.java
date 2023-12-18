import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int n = in.nextInt();

		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

		long result = solve(n, a);
		System.out.println(result);

		in.close();

	}

	public static long solve(long n, long[] a) {
		long result = 0;

		int len = a.length;
		long first = gcd(a[len - 1], a[len - 2]);
		
		if(len == 2) {
			return first;
		}

		for (int i = len - 3; i >= 0; i--) {
			result = gcd(first, a[i]);
		}

		return result;
	}

	public static long gcd(long m, long n) {
		if (m < n) {
			return gcd(n, m);
		}

		if (n == 0) {
			return m;
		}

		return gcd(n, m % n);
	}

}
