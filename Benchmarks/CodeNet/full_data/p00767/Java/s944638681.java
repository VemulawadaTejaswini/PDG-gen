import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int H, W;
		while (true) {
			H = sc.nextInt();
			W = sc.nextInt();
			if (H == 0) break;
			int aH = 999;
			int aW = 999;
			for (int i = 1; i <= 150; ++i) {
				for (int j = i+1; j <= 150; ++j) {
					if (compare(H, W, i, j) && compare(i, j, aH, aW)) {
						aH = i;
						aW = j;
					}
				}
			}
			System.out.println(aH + " " + aW);
		}
	}

	static boolean compare(int h1, int w1, int h2, int w2) {
		int d1 = h1 * h1 + w1 * w1;
		int d2 = h2 * h2 + w2 * w2;
		return d1 == d2 ? h1 < h2 : d1 < d2;
	}

}