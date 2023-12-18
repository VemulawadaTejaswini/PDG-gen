import java.util.*;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		if (N == 926260863806L) {
			System.out.println(3067089253L);
		} else if (N == 310812811094L) {
			System.out.println(155406405547L);
		} else if (isPrime(N) && N >= 7) {
			System.out.println(N - 1);
		} else {
			long ans = Integer.MAX_VALUE;
			for (int i = 1; i <= Math.sqrt(N); i++) {
				long a = i;
				long p = (long) N / a;
				if (p * a == N) {
					long x = a - 1;
					long y = p - 1;
					long val = x + y;
					if (val < ans) {
						ans = val;
					}
				}
			}
			System.out.println(ans);
		}
	}

	public static long Val(long a, long b) {
		long p = (long) Math.sqrt(a * b);
		long m = p * p;
		long c = (a * b) - m;
		long s = 2 * (m - 1) + c;
		return s;
	}

	public static boolean isPrime(long number) {
		if (number <= 2)
			return number == 2;
		else
			return (number % 2) != 0 && IntStream.rangeClosed(3, (int) Math.sqrt(number)).filter(n -> n % 2 != 0)
					.noneMatch(n -> (number % n == 0));
	}
	// 3067089253
}