import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static final long MOD = 10*10*10*10*10*10*10*10*10+7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long sum = 0;
		for (long i = k; i <= n+1; i++) {
			sum = (sum + sumEvery(i, n+1))%MOD;
		}
		System.out.println(sum%MOD);

	}

	private static long sumEvery(long num, long n) {
		if (num == n) {
			return 1;
		}
		if (num == n-1) {
			return n;
		}
		long l = (num*num - num)/2;
		long r = (2*n - num -1)*num/2;
		return (r-l+1)%MOD;
	}

}
