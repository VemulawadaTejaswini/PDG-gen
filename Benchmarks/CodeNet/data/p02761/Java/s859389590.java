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

		for (int i = 0; i < M - 1; i++) {
			for (int j = i + 1; j < M; j++) {
				// 同じ桁で違う数字指定はNG
				if (s[i] == s[j] && c[i] != c[j]) {
					System.out.println("-1");
					return;
				}
			}
		}

		int[] result = new int[N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				// Nが1桁以外で、1桁目が0はNG
				if (N != 1 && s[j] == 1 && c[j] == 0) {
					System.out.println("-1");
					return;
				}
				// 桁の指定がない場合は、1桁目は1、それ以外は0で埋める
				if (s[j] == (i + 1)) {
					result[i] = c[j];
					break;
				} else {
					if (i == 0) {
						result[i] = 1;
					} else {
						result[i] = 0;
					}
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.print(result[i]);
		}
		System.out.println("");

		sc.close();
	}

}
