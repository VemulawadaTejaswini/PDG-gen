import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		String[] a = new String[n];
		String[] b = new String[m];

		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
		}

		for (int i = 0; i < m; i++) {
			b[i] = sc.next();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - m + 1; j++) {
				int k;
				for (k = 0; k < m; k++) {
					if (!a[i+k].substring(j, j + m).equals(b[k])) {
						break;
					}
				}
				
				if(k < m) {
					break;
				} else {
					System.out.println("Yes");
					System.exit(0);
				}
			}

		}
		System.out.println("No");

	}
}
