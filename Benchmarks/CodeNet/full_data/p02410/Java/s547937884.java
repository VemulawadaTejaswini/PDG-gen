import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int m, n;
		int i, j;
		try (Scanner sc = new Scanner(System.in)) {
			m = sc.nextInt();
			n = sc.nextInt();
			int a[][] = new int[m][n];
			int b[] = new int[n];
			int c[] = new int[m];
			for(i = 0; i < m; i++) {
				for(j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			for(i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}
			for(i = 0; i < m; i++) {
				for(j = 0; j < n; j++) {
					c[i] += a[i][j] * b[j];
				}
			}
			for(i = 0; i < m; i++) System.out.println(c[i]);
		}
	}
}

