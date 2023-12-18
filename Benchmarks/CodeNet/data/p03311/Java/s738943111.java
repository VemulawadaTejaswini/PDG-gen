import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long[] a = new long[n];
		long sum  = 0;
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
			sum += a[i];
		}
		sum /= n;
		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += Math.abs(a[i] - (sum - n / 2 + i));
		}
		System.out.println(ans);
	}
}