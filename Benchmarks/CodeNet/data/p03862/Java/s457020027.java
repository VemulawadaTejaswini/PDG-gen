import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		long ans = 0;
		for(int i = 0 ; i < n - 1 ; i++) {
			if(i % 2 == 1) {
				if(a[i - 1] + a[i] > x) {
					ans += a[i - 1] + a[i] - x;
					a[i] = x - a[i - 1];
				}
			}
		}
		for(int i = 0 ; i < n - 1 ; i++) {
			if(a[i] + a[i + 1] > x) {
				ans += a[i] + a[i + 1] - x;
				a[i] = x - a[i + 1];
			}
		}
		System.out.println(ans);
	}
}
