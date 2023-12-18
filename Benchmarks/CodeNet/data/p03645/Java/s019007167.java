
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int M = s.nextInt();
			
			// 経路入力
			int[] a = new int[M];
			int[] b = new int[M];
			for (int i = 0; i < M; i++) {
				a[i] = s.nextInt();
				b[i] = s.nextInt();
			}
			
			// Nと同じbを探す
			for (int i = 0; i < M; i++) {
				if (b[i] == N) {
					for (int j = 0; j < M; j++) {
						// bに向かうaと同じbを探す
						if (b[j] == a[i]) {
							// bに向かうaが1であればPOSSIBLE
							if (a[j] == 1) {
								System.out.println("POSSIBLE");
								System.exit(0);
							}
						}
					}
				}
			}
			
			
		}
		System.out.println("IMPOSSIBLE");
	}
}