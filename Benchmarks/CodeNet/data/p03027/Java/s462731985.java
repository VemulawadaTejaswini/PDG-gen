import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int q = sc.nextInt();
			int x[] = new int[q];
			int d[] = new int[q];
			int n[] = new int[q];
			long s[] = new long[q];
			int r[] = new int[q];
			for (int i = 0; i < q; i++) {
				x[i] = sc.nextInt();
				d[i] = sc.nextInt();
				n[i] = sc.nextInt();
				s[i] = 1;
				for (int j = 0; j < n[i]; j++) {
					int k[] = new int[n[i]];
					k[j] = x[i] + j * d[i];
					s[i] *= k[j];
				}
				r[i] = (int)s[i]%1000003;

			}
			for (int i = 0; i<q; i++) {
				System.out.println(r[i]);
			}
		}
	}
}