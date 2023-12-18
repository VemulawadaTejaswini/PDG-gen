import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inN = stdin.nextInt();
		int inH = stdin.nextInt();

		int aMax = 0;
		int[] inB = new int[inN];
		int sumB = 0;
		for (int i = 0; i < inN; i++) {
			aMax = Math.max(aMax, stdin.nextInt());
			sumB += (inB[i] = stdin.nextInt());
		}

		if (sumB > inH) {
			Arrays.sort(inB);
			for (int i = (inN - 1); i >= 0; i--) {
				inH -= inB[i];

				if (inH <= 0) {
					System.out.println(inN - i);
					return;
				}
			}
		}
		else {
			inH -= sumB;
		}

		inN += inH / aMax;
		if ((inH % aMax) > 0) {
			inN++;
		}

		System.out.println(inN);
	}

}
