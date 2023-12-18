
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long[] a = new long[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		if (k >= n) {
			System.out.println(0);
		} else {
			long ans = 0;
			for (int i = 0; i < n - k; i++) {
				ans += a[i];
			}
			System.out.println(ans);
		}
	}
}
