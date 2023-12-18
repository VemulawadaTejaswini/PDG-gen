import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] answer = new int[h][w];
		int[] as = new int[h];
		int[] bs = new int[w];
		Arrays.fill(as, a);
		Arrays.fill(bs, b);


		boolean success = true;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (as[i] > 0 && bs[j] > 0) {
					as[i]--;
					bs[j]--;
					answer[i][j] = 1;
				} else {
					answer[i][j] = 0;
				}

			}
			if (as[i] > 0) {
				success = false;
				break;
			}
		}

		if (success) {
			for (int j = 0; j < w; j++) {
				if (bs[j] > 0) {
					success = false;
					break;
				}
			}
		}

		if (success) {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					System.out.print(answer[i][j]);
				}
				System.out.println();
			}
			return;
		}


		//--------------

		Arrays.fill(as, a);
		Arrays.fill(bs, b);
		success = true;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (as[i] > 0) {
					as[i]--;
					answer[i][j] = 1;
				} else {
					answer[i][j] = 0;
					bs[j]--;
				}
			}
			if (as[i] > 0) {
				success = false;
				break;
			}
		}

		if (success) {
			for (int j = 0; j < w; j++) {
				if (bs[j] > 0) {
					success = false;
					break;
				}
			}
		}

		if (success) {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					System.out.print(answer[i][j]);
				}
				System.out.println();
			}
			return;
		}

		System.out.println("No");

	}
}
