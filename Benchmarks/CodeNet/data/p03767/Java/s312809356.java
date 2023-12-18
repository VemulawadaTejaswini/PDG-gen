import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[3*n];

		for (int i = 0; i < 3*n; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		long ans = 0;
		for (int i = 3*n-2; i >= n; i-=2) {
			ans+= a[i];
		}
		System.out.println(ans);
	}
}