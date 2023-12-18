import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt() - i - 1;
			b[i] = a[i];
		}
		int mid;
		Arrays.sort(a);
		if (a.length % 2 == 0) {
			mid = (a[a.length / 2 - 1] + a[a.length / 2]) / 2;
		} else {
			mid = a[a.length / 2];
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += Math.abs(b[i] - mid);
		}
		System.out.println(ans);
	}
}