import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		Arrays.sort(a);
		while (a[n - 2] != 0) {
			for (int i = 1; i < n; i++) {
				a[i] = a[i] % a[0];
			}
			Arrays.sort(a);
		}
		System.out.println(a[n - 1]);
	}
}