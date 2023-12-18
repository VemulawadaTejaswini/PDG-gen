import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inH = stdin.nextInt();
		int inW = stdin.nextInt();
		int max = inH * inW;

		int inD = stdin.nextInt();

		int[] ah = new int[max];
		int[] aw = new int[max];
		for (int h = 1; h <= inH; h++) {
			for (int w = 1; w <= inW; w++) {
				int inA = stdin.nextInt();
				ah[inA - 1] = h;
				aw[inA - 1] = w;
			}
		}

		int inQ = stdin.nextInt();
		for (int i = 0; i < inQ; i++) {
			int inL = stdin.nextInt();
			int inR = stdin.nextInt();

			long cost = 0;
			int prev = inL;
			for (int a = (inL + inD); a <= inR; a += inD) {
				cost += getPow(ah, aw, prev, a);
				prev = a;
			}

			System.out.println(cost);
		}
	}

	private static int getPow(int[] ah, int[] aw, int prev, int a) {
		return Math.abs(ah[prev - 1] - ah[a - 1]) + Math.abs(aw[prev - 1] - aw[a - 1]);
	}
}
