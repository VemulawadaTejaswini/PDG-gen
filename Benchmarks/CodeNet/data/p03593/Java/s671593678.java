import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		try (Scanner cin = new Scanner(System.in)) {

			int H = cin.nextInt();
			int W = cin.nextInt();
			String[] strArray = new String[H];

			for (int i = 0; i < H; i++) {
				strArray[i] = cin.next();
			}

			int[] array = count(strArray);

			int nopair = 0;
			if (H % 2 != 0 && W % 2 != 0) {
				nopair = 1;
			}
			int pair4 = 0;

			for (int i = 0; i < H / 2; i++) {
				for (int j = 0; j < W / 2; j++) {
					pair4++;
				}
			}
			int pair2 = (H * W - pair4 * 4 - nopair) / 2;

			for (int i = 0; i < pair4; i++) {
				for (int j = 0; j < array.length; j++) {
					if (array[j] >= 4) {
						array[j] -= 4;
						break;
					}
				}
			}
			for (int i = 0; i < pair2; i++) {
				for (int j = 0; j < array.length; j++) {
					if (array[j] >= 2) {
						array[j] -= 2;
						break;
					}
				}
			}
			if (nopair != 0) {
				for (int j = 0; j < array.length; j++) {
					if (array[j] == 1) {
						array[j]--;
						break;
					}
				}
			}

			for (int i : array) {
				if (i != 0) {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");

		} finally {
		}
	}

	private static int[] count(String[] strArray) {
		int[] array = new int[26];

		for (int i = 0; i < strArray.length; i++) {
			char[] cArray = strArray[i].toCharArray();
			for (char c : cArray) {
				array[c - 97] += 1;
			}
		}

		int size = 0;

		for (int i : array) {
			if (i > 0) {
				size++;
			}
		}
		int[] ret = new int[size];
		int index = 0;
		for (int i : array) {
			if (i > 0) {
				ret[index] = i;
				index++;
			}
		}
		return ret;
	}
}
