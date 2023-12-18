import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] c = S.toCharArray();
		sc.close();

		// 一周してRGBが何個あるかを判定
		long R = 0;
		long G = 0;
		long B = 0;

		for (int i = 0; i < N; i++) {
			if (c[i] == 'R') {
				R++;
			} else if (c[i] == 'G') {
				G++;
			} else {
				B++;
			}
		}

		// NGを判定する
		long ng = 0;
		for (int i = 0; i < N - 2; i++) {
			char first = c[i];

			for (int j = i + 1; j < N - 1; j++) {
				if (c[j] == first) {
					continue;
				}
				char second = c[j];
				int d = j - i;

				if (j + d < N && c[j + d] != first && c[j + d] != second) {
					ng++;
				}
			}
		}

		long ans = R * G * B - ng;
		System.out.println(ans);
	}
}
