import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		long[] b = new long[n + 1];
		a[0] = sc.nextInt();
		b[0] = 0;
		for (int i = 1; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = a[i - 1] + b[i - 1];
		}
		b[n] = b[n - 1] + a[n - 1];
		int cnt = 0;
		for (int i = 0; i < n + 1; i++) {
			for (int j = n; j > i; j--) {
				if ((b[j] - b[i]) % m == 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
