import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long[] a = new long[1010];
		// 2 * 3 * 4 * .... * n
		for(int i = 2 ; i <= n ; i++) {
			for(int j = 2 ; j <= n ; j++) {
				if(isPrime(j) && i % j == 0) {
					a[j] += func(i, j);
				}
			}
		}
		long ans = 1;
		for(int i = 2 ; i <= 1000 ; i++) {
			ans = ans * (a[i] + 1) % 1000000007;
		}
		System.out.println(ans);
	}

	public static boolean isPrime(int x) {
		boolean ok = true;
		for(int i = 2 ; i * i <= x ; i++) {
			if(x % i == 0) {
				ok = false;
			}
		}
		return ok;
	}

	public static long func(int a, int b) {
		long ret = 0;
		while(a % b == 0) {
			ret++;
			a /= b;
		}
		return ret;
	}

}
