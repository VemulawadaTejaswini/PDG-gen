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

		int i;
		boolean ok = false;
		for (i = 0; i < n - m; i++) {
			for (int j = 0; j < n - m; j++) {
				// A[i,j]をB[0,0]に合わせて一致するかテスト
				int k;
				for (k = 0; k < m; k++) {
					int l;
					for (l = 0; l < m; l++) {
						if (a[i + k].charAt(j + l) != b[k].charAt(l)) {
							break;
						}
					}
					if (l < m) {
						break;
					}
				}
				if (k >= m) {
					System.out.println("Yes");
					System.exit(0);
				}
			}

		}

		System.out.println("No");

	}

}
