import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int len = s.length();
		int[] ans = new int[len];

		int countR = 1;

		for (int i = 1; i < len; i++) {
			int startL = i;
			int countL = 0;

			if (s.charAt(i) == 'R') {
				if (s.charAt(i - 1) == 'L') {
					countR = 1;
				} else {
					countR++;
				}
			} else {
				int tmpL = startL;
				while (s.charAt(tmpL) == 'L') {
					countL++;
					tmpL++;
					if (tmpL == len) {
						break;
					}
				}
				if (s.charAt(i - 1) == 'R') {
					ans[startL - 1] = hidari(countR, countL);
					ans[startL] = migi(countR, countL);
				}
			}

		}

		for (int i = 0; i < len; i++) {
			System.out.print(ans[i] + " ");
		}
		sc.close();
	}

	public static int hidari(int R, int L) {
		if (R % 2 == L % 2) {
			return (L + R) / 2;
		} else {
			if (R > L) {
				if (R % 2 == 0)
					return (L + R) / 2;
				else
					return (L + R) / 2 + 1;

			} else {
				if (L % 2 == 0)
					return (L + R) / 2 + 1;
				else
					return (L + R) / 2;
			}
		}
	}

	public static int migi(int R, int L) {
		if (R % 2 == L % 2) {
			return (L + R) / 2;
		} else {
			if (R > L) {
				if (R % 2 == 0)
					return (L + R) / 2 + 1;
				else
					return (L + R) / 2;

			} else {
				if (L % 2 == 0)
					return (L + R) / 2;
				else
					return (L + R) / 2 + 1;
			}
		}
	}
}