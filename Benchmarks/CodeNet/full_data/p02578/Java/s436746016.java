import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int r = 0;
		for (int i=1;i<n;i++) {
			if (a[i] < a[i - 1]) {
				r += a[i - 1] - a[i];
				a[i] = a[i - 1];
			}
		}
		System.out.println(r);
	}
}
