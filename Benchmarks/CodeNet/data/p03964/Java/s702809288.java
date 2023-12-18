import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] t = new long[n];
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextLong();
			a[i] = sc.nextLong();
		}
		long[] tt = Arrays.copyOf(t, n);
		long[] aa = Arrays.copyOf(a, n);
		for (int i = 1; i < n; i++) {
			while (tt[i - 1] + aa[i - 1] > tt[i] + aa[i] || tt[i - 1] > tt[i] || aa[i - 1] > aa[i]) {
				tt[i] += t[i];
				aa[i] += a[i];
			}
		}
		System.out.println(tt[n - 1] + aa[n - 1]);
	}
}