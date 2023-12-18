import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[m];
			int c[] = new int[m];
					
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			
			int count = 0;
			for (int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
				c[i] = sc.nextInt();
				count += b[i];
			}
			
			Integer d[] = new Integer[count];			
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < b[i]; j++) {
					d[j] = c[i];
				}
			}
			
			Arrays.sort(a);
			Arrays.sort(d, Comparator.reverseOrder());
			
			for (int i = 0; i < m; i++) {
				if (a[i] < d[i]) {
					a[i] = d[i];
				} else {
					break;
				}
			}
			
			long result = 0;
			for (int i = 0; i < n; i++) {
				result += a[i];
			}
			System.out.println(result);
		}
	}
}
