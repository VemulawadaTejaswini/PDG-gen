import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[m];
			int c[] = new int[m];
			long result = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
				c[i] = sc.nextInt();
			}
			
			for (int i = 0; i < m; i++) {
				Arrays.sort(a);
				for (int j = 0; j < b[i]; j++) {
					if (a[j] < c[i]) {
						a[j] = c[i];
					}
				}
			}
			for (int i = 0; i < n; i++) {
				result += a[i];
			}
			System.out.println(result);
		}
	}
}
