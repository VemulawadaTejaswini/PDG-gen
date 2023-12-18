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
		for (int i = 0; i < inN; i++) {
			aMax = Math.max(aMax, stdin.nextInt());
			inB[i] = stdin.nextInt();
		}

		int count = 0;
		Arrays.sort(inB);
		for (int i = (inN - 1); (i >= 0) && (inB[i] > aMax); i--) {
			inH -= inB[i];
			count++;

			if (inH <= 0) {
				System.out.println(count);
				return;
			}
		}

		count += inH / aMax;
		if ((inH % aMax) > 0) {
			count++;
		}

		System.out.println(count);
	}

}
