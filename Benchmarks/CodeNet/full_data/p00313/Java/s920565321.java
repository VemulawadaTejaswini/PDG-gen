import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 調査対象の人数 N (1 ≤ N ≤ 100) が与えられる。と、それに続いて組織 
		int N = sc.nextInt();

		boolean belongA[] = new boolean[N + 1];

		boolean belongB[] = new boolean[N + 1];

		boolean hasC[] = new boolean[N + 1];

		// 組織 A に属している者の数 X (0 ≤ X ≤ N)
		int X = sc.nextInt();
		for (int i = 0; i < X; ++i) {
			int a = sc.nextInt();
			belongA[a] = true;
		}

		// 組織 B に属している者の数 X (0 ≤ X ≤ N)
		int Y = sc.nextInt();
		for (int i = 0; i < Y; ++i) {
			int a = sc.nextInt();
			belongB[a] = true;
		}

		// 商品 C を所持している者の数 X (0 ≤ X ≤ N)
		int Z = sc.nextInt();
		for (int i = 0; i < Z; ++i) {
			int a = sc.nextInt();
			hasC[a] = true;
		}

		int answer = 0;
		for (int i = 1; i <= N; ++i) {
			// 組織Aに属さず、かつ、商品Cを所持している者。
			// 組織Bに属し、かつ、商品Cを所持している者。
			if ((!belongA[i] && hasC[i]) || (belongB[i] && hasC[i])) {
				answer++;
			}
		}

		System.out.println(answer);

	}
}

