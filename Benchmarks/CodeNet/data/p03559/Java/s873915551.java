import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		int d[] = new int[n];
		int e[] = new int[n];
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		Arrays.sort(b);
		Arrays.sort(c);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(b[i] < c[j]) {
					e[i]++;
				}else {
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(a[i ] < b[j]) {
					cnt += e[j];
				}else {
				}
			}
		}
		System.out.println(cnt);
	}
}
