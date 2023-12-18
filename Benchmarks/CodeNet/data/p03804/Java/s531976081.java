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
		boolean flag = true;
		for (int i = 0; i <= n - m; i++) {
			for (int j = 0; j <= n - m; j++) {
				for (int k = 0; k < m; k++) {
					if (a[k].charAt(k) != b[k].charAt(k)) {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println("Yes");
					return;
				}
				flag = true;
			}
		}
		System.out.println("No");

	}
}