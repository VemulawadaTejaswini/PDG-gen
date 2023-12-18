import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		long ans = 0;
		for(int i = n - 1 ; i >= 0 ; i--) {
			ans += (a[i] + ans + b[i] - 1) / b[i] * b[i] - (a[i] + ans);
		}
		System.out.println(ans);
	}
}
