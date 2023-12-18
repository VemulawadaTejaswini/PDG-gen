import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] s = new int[N];
		int[] c = new int[N];

		for (int i = 0; i < M; i++) {
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		sc.close();

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				// 同じ桁で違う数字指定はNG
				if ((s[i] == s[j]) && (c[i] != c[j])) {
					System.out.println("-1");
					return;
				}
			}
			if (s[i] == 1 && c[i] == 0) {
				if (N == 1) {
					// 1桁で、かつ1桁目が0
					System.out.println("0");
					return;
				} else {
					// Nが1桁以外で、1桁目が0はNG
					System.out.println("-1");
					return;
				}
			}
		}

		int[] result = new int[N];

		if (N == 1) { // 初期化
			result[0] = 0;
		} else {
			result[0] = 1;
		}

		for (int i = 0; i < M; i++) {
			int digit = s[i] - 1;
			result[digit] = c[i];
		}

		for (int i = 0; i < N; i++) {
			System.out.print(result[i]);
		}
		System.out.println("");

	}
}
