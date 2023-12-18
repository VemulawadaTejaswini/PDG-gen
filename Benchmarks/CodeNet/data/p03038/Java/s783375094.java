import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.parallelSort(a);
		int[] b = new int[m];
		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = scanner.nextInt();
			c[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < b[i]; j++) {
				if (a[j] < c[i]) {
					a[j] = c[i];
				}
			}
			Arrays.parallelSort(a);
		}
		long result = 0;
		for (int i = 0; i < n; i++) {
			result = result + (long) a[i];
		}
		System.out.println(result);
	}
}
