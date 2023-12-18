
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static long res = 0;

	public static void main(String[] args) throws Exception {

		long n = sc.nextLong();
		System.out.println(helper(n));

	}

	Set<Long> s = new HashSet<Long>();

	private static long helper(long n) {
		// TODO Auto-generated method stub
		long k = Long.MAX_VALUE;
		k = Math.min(k, sum(n));
		for (long time = 2; time < 100000000; time++) {
			k = Math.min(k, sum(n * time));
		}
		return k;
	}

	private static long sum(long n) {
		// TODO Auto-generated method stub
		long res = 0;
		while (n != 0) {
			res += n % 10;
			n = n / 10;
		}
		return res;
	}

}