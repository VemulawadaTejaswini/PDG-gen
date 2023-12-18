
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
			
			search(N, M, a, b, 2);
			System.out.println("IMPOSSIBLE");
		}
	}
	
	private static void search(int N, int M, int[] a, int[] b, int lim) {
		if (lim == 0 && N == 1) {
			System.out.println("POSSIBLE");
			System.exit(0);
		}
		
		for (int i = 0; i < M; i++) {
			if (b[i] == N) {
				search(a[i], M, a, b, lim - 1);
			}
		}
	}
}