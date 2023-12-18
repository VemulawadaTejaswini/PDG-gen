import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long x = scan.nextLong();
		long[] a = new long[n];
		long b = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
		}
		for (int i = 1; i < n; i++) {
			if (a[i-1]+a[i] > x) {
				b += (a[i-1]+a[i])-x;
				if (((a[i-1]+a[i])-x) >= 0) {
					a[i] -= b;
				} else {
					a[i-1] -= (b-a[i]);
				}
			}
		}
		System.out.println(b);
	}
}
