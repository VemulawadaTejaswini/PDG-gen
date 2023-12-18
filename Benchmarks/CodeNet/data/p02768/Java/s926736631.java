import java.util.Scanner;
import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		// DPでね？
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		Function<Integer, Long> fn = (x) -> ((long) Math.pow(2, x)) - 1L;
		long ca = combination(n, a);
		long cb = combination(n, b);
		long ans = fn.apply(n);
		ans = ans - ca - cb;
		ans = ans % (1000000000L + 7L);
		System.out.println(Math.max(0, ans));
	}

	public static long m(int n) {
		long sum = 0;
		for (long i = 1; i <= n; i++) {
			sum += combination(n, i);
		}
		return sum;
	}

	public static long combination(long n, long r) {
		long num = 1;
		for (long i = 1; i <= r; i++) {
			num = num * (n - i + 1) / i;
		}
		return num;
	}
}
