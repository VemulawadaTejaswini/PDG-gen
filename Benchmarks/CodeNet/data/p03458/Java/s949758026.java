import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inN = stdin.nextInt();
		int inK = stdin.nextInt();

		int[] gridX = new int[inN];
		int[] gridY = new int[inN];
		for (int i = 0; i < inN; i++) {
			long inX = stdin.nextLong();
			long inY = stdin.nextLong();
			String inC = stdin.next();
			if (inC.equals("W")) {
				inX += inK;
			}

			gridX[i] = (int)(inX % (inK * 2));
			gridY[i] = (int)(inY % (inK * 2));
		}

		int max = 0;
		for (int blackX = 0; blackX < (inK * 2); blackX++) {
			for (int blackY = 0; blackY < (inK * 2); blackY++) {
				int count = 0;
				for (int i = 0; i < inN; i++) {
					if (isBlack(gridX[i], gridY[i], blackX, blackY, inK)) {
						count++;
					}
				}

				max = Math.max(max, count);
			}
		}

		System.out.println(max);
	}

	private static boolean isBlack(int x, int y, int blackX, int blackY, int k) {
		if (x < blackX) {
			x += (k * 2);
		}
		if ((x < blackX) || ((blackX + k) <= x)) {
			return false;
		}

		if (y < blackY) {
			y += (k * 2);
		}
		if ((y < blackY) || ((blackY + k) <= y)) {
			return false;
		}

		return true;
	}
}
