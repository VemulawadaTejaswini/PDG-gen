
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		long[] b = new long[m];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextLong();
		}
		int nk=n;
		int mk=m;
		int acn = 0;
		int bcn = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (k >= 0) {
					if (n > 0 && m > 0) {
						if (a[i] <= b[j]) {
							k -= a[i];
							nk -= 1;
							acn++;
						} else {
							k -= b[j];
							mk -= 1;
							bcn++;
						}
					} else if (n == 0 && m > 0) {
						k -= b[j];
						m -= 1;
						bcn++;
					} else if (n > 0 && m == 0) {
						k -= a[i];
						n -= 1;
						acn++;
					}else {
						int d=acn+bcn;
						System.out.println(d);
						break;
					}
					

				} else {
					break;
				}
			}
			
		}
		System.out.println(acn+bcn-1);
		sc.close();
	}

}
