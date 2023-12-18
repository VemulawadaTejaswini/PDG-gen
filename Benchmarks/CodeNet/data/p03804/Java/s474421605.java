import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		String[] a = new String[n];
		String[] b = new String[m];
		for (int i = 0; i < n; i++) {
			a[i] = scan.next();
		}
		for (int i = 0; i < m; i++) {
			b[i] = scan.next();
		}
		for (int v = 0; v <= n - m; v++) {
			boolean flag = true;
			for (int k = 0; k <= n - m; k++) {
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < m; j++) {
						if (a[i + k].charAt(j + v) != b[i].charAt(j)) {
							flag = false;
						}
					}
				}
				if (flag) {
					System.out.println("Yes");
					return;
				}
				flag = false;
			}
		}
		System.out.println("No");
	}
}