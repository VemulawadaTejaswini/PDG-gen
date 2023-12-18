import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		char[] S = sc.next().toCharArray();
		int N = S.length;
		int sakaime = 0;
		int countR = 0;
		int countL = 0;
		int irekae = 0;
		Boolean flgR = true;
		Boolean flgL = false;
		int ans[] = new int[N];

		sc.close();

		for (int i = 0; i < N; i++) {
			if (flgR) {
				if (S[i] == 'R') {
					irekae = countR;
					countR = countL;
					countL = irekae;
					countR += 1;
				} else {
					flgR = false;
					flgL = true;
					sakaime = i;
					ans[sakaime - 1] += countR;
					ans[sakaime] += countL;
					countR = 0;
					countL = 1;
				}
			}

			if (flgL) {
				if (S[i] == 'R' || i == N) {
					flgR = true;
					flgL = false;
					ans[sakaime - 1] += countR;
					ans[sakaime] += countL;
					countR = 1;
					countL = 0;
				} else {
					irekae = countR;
					countR = countL;
					countL = irekae;
					countL += 1;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println(ans[i]);
		}

	}
};