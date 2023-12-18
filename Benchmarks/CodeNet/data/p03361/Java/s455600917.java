import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static final String SHARP = "#";
	private static final String DOT = ".";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] sH = new String[H];
		String[][] s = new String[H + 2][W + 2];
		boolean can = true;

		for (int i = 0; i < H + 1; i++) {
			Arrays.fill(s[i], DOT);
		}

		for (int i = 0; i < H; i++) {
			sH[i] = sc.next();
		}

		for (int i = 1; i < H + 1; i++) {
			for (int j = 1; j < W + 1; j++) {
				s[i][j] = sH[i - 1].split("")[j - 1];
			}
		}

		for (int i = 1; i < H + 1; i++) {
			for (int j = 1; j < W + 1; j++) {
				if (SHARP.equals(s[i][j])) {
					if (DOT.equals(s[i - 1][j]) &&
						DOT.equals(s[i + 1][j]) &&
						DOT.equals(s[i][j - 1]) &&
						DOT.equals(s[i][j + 1])) {
						can = false;
					}
				}
			}
		}
		if (can) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
