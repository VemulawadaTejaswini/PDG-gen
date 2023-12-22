import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (;;) {
			int h = in.nextInt();
			int w = in.nextInt();
			if ((h | w) == 0)
				break;
			int val[][] = new int[150][150];
			int input = h * h + w * w;
			for (int i = 1; i <= 150; i++) {
				for (int j = 1; j <= 150; j++) {
					val[i - 1][j - 1] = i * i + j * j;
				}
			}
			int ansH = 101;
			int ansW = 101;
			boolean judge = false;
			for (int i = input; i <= 150 * 150; i++) {

				for (int j = 1; j <= 150; j++) {
					for (int k = 1; k <= 150; k++) {
						if (j >= k || (j == h && k == w)) {
							continue;
						}
						if (i == val[j - 1][k - 1]) {
							if(h < j || i>input){
								if (j < ansH) {
									ansH = j;
									ansW = k;
									judge = true;
								}
							}
						}
					}
				}
				if (judge) {
					break;
				}
			}
			System.out.println(ansH + " " + ansW);
		}
	}

	static public void debug(Object... o) {
		System.err.println(Arrays.deepToString(o));
	}
}