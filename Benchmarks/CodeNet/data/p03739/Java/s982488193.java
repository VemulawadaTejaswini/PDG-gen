import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		long sum = 0, ans = 0, ans2 = 0;
		// 偶数位置までの和：正、奇数位置までの和：負
		for(int i = 0 ; i < n ; i++) {
			if(i % 2 == 0) {
				if(sum + a[i] >= 0) {
					ans += sum + a[i] + 1;
					sum = -1;
				} else {
					sum += a[i];
				}
			} else {
				if(sum + a[i] <= 0) {
					ans += 1 - (sum + a[i]);
					sum = 1;
				} else {
					sum += a[i];
				}
			}
		}
		sum = 0;
		// 偶数位置までの和：正、奇数位置までの和：負
		for(int i = 0 ; i < n ; i++) {
			if(i % 2 == 1) {
				if(sum + a[i] >= 0) {
					ans2 += sum + a[i] + 1;
					sum = -1;
				} else {
					sum += a[i];
				}
			} else {
				if(sum + a[i] <= 0) {
					ans2 += 1 - (sum + a[i]);
					sum = 1;
				} else {
					sum += a[i];
				}
			}
		}
		System.out.println(Math.min(ans, ans2));
	}
}
