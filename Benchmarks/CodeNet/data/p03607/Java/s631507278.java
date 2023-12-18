import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		int count = 0;
		int ans = 0;
		for (int i = 0; i < n-1; i++) {
			if (a[i] == a[i+1]) {
				count++;
			} else {
				if (count % 2 == 0) {
					ans++;
				}
				count = 0;
			}
		}
		System.out.println(ans);
	}
}