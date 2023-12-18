import java.util.Scanner;

public class Main {
	private static int[][] rgb;
	private final static char R = 'R';
	private final static char G = 'G';
	private final static char B = 'B';

	public static void main(String[] args) {
		long count = 0;

		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.next());
		String S = in.next();
		in.close();

		rgb = new int[3][2 * N + 1];

		int cntb = 0;
		int cntg = 0;
		int cntr = 0;
		char ch;
		for (int i = N - 1; i >= 0; i--) {
			ch = S.charAt(i);
			if (ch == B) {
				cntb++;
			} else if (ch == G) {
				cntg++;
			} else {
				cntr++;
			}
			rgb[0][i] = cntr; //iも含めて、それ以降のBの数
			rgb[1][i] = cntg; //iも含めて、それ以降のGの数
			rgb[2][i] = cntb; //iも含めて、それ以降のRの数

			//			System.out.println(String.format("rgb[0][%d]:%d, rgb[1][%d]:%d, rgb[2][%d]:%d"
			//					, i, rgb[0][i], i, rgb[1][i], i, rgb[2][i]));
		}

		char ch1, ch2;

		for (int i = 0; i < N - 2; i++) {
			ch1 = S.charAt(i);
			for (int j = i + 1; j < N - 1; j++) {
				ch2 = S.charAt(j);
				if (ch1 == ch2) {
					continue;
				}
				count += calc(i, j, ch1, ch2);
			}
		}
		System.out.println(count);
	}

	public static int calc(int i, int j, char ch1, char ch2) {
		int calc = 0;
		int idx = 2 * j - i;
		if (ch1 == R) {
			if (ch2 == G) { //S_k = Bのものを数える
				calc = rgb[2][j + 1] - (rgb[2][idx] - rgb[2][idx + 1]);
			} else { //S_k = Gのものを数える
				calc = rgb[1][j + 1] - (rgb[1][idx] - rgb[1][idx + 1]);
			}
		} else if (ch1 == G) {
			if (ch2 == R) { //S_k = Bのものを数える
				calc = rgb[2][j + 1] - (rgb[2][idx] - rgb[2][idx + 1]);
			} else { //S_k = Bのものを数える
				calc = rgb[0][j + 1] - (rgb[0][idx] - rgb[0][idx + 1]);
			}
		} else {// ch1 == B
			if (ch2 == R) { //S_k = Gのものを数える
				calc = rgb[1][j + 1] - (rgb[1][idx] - rgb[1][idx + 1]);
			} else { //S_k = Rのものを数える
				calc = rgb[0][j + 1] - (rgb[0][idx] - rgb[0][idx + 1]);
			}
		}
		return calc;
	}
}
