import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		if (n == 2) {
			System.out.println(Math.max(a[0], a[1]));
			return;
		}

		Set<Integer> set = new HashSet<Integer>();
		set.add(a[0]);
		set.add(a[1]);
		int[] gcda = new int[n];
		gcda[0] = a[0];
		for (int i = 1; i < n; i++) {
			int ai = a[i];
			Integer[] arr = set.toArray(new Integer[0]);
			set = new HashSet<Integer>();
			for (int j : arr) {
				set.add(BigInteger.valueOf(j).gcd(BigInteger.valueOf(ai)).intValue());
			}
			set.add(gcda[i - 1]);
			gcda[i] = BigInteger.valueOf(gcda[i - 1]).gcd(BigInteger.valueOf(ai)).intValue();
		}

		int ans = 0;
		for (int j : set) {
			ans = Math.max(ans, j);
		}
		System.out.println(ans);
	}
}
