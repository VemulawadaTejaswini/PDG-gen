import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long count = 0;
		boolean flag = (n - k) % 2 != 0;
		for (int i = 1; i <= k; i++) {
			count = comb(Math.abs(n - k) + 1, i);
			if (i % 2 == 0) {
				count *= 2L;
			} else if (i > 1 && flag) {
				count /= 2L;
			}
			count %= (long) (1E9 + 7L);
			System.out.println(count);
		}
	}
	
	static long perm(long n, long r) {
		long result = 1;
		for (long i = n - r + 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	static long comb(long n, long r) {
		r = Math.min(r, n - r);
		long tmp = perm(r, 1);
		tmp = Math.max(tmp, 1);
		return perm(n, r) / tmp;
	}
}
