import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, n, m, counter = 0;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			int[] a = new int[n];
			for(i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			m = sc.nextInt();
			int[] b = new int[m];
			for(i = 0; i < m; i++) {
				b[i] = sc.nextInt();
			}
			if(m > n) {
				counter = 1;
			}
			for(i = 0; i < Math.min(m, n); i++) {
				if(b[i] > a[i]) {
					counter = 1;
					break;
				}else if(b[i] < a[i]) {
					counter = 0;
					break;
				}
			}
		}
		System.out.println(counter);
	}
}

