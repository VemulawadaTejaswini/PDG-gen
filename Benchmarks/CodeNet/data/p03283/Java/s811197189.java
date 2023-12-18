
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int q = sc.nextInt();
			int[] lm = new int[m];
			int[] rm = new int[m];

			for (int i = 0; i < m; i++) {
				lm[i] = sc.nextInt();
				rm[i] = sc.nextInt();
			}
			for (int i = 0; i < q; i++) {
				int lq = sc.nextInt();
				int rq = sc.nextInt();
				int result = 0;

				for (int j = 0; j < m; j++) {
					if (lq <= lm[j] && rm[j] <= rq) {
						result++;
					}
				}
				System.out.println(result);
			}
		}
	}
}
