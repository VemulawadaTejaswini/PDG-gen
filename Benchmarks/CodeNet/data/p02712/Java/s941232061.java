import java.util.*;

public class Main {

	public static long total(int n) {
		return (long)n * (long)(n + 1) / 2;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		long ans = 0;
		ans = total(n);
		long rest = 3 * total(n / 3);
		ans -= rest;
		rest = 5 * total(n / 5);
		ans -= rest;
		rest = 15 * total(n / 15);
		ans += rest;
		System.out.println(ans);
	}
}
