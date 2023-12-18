import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int mass[][] = new int[H][W];

		int count = 0;

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				mass[i][j] = 1;
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < W; j++) {
				mass[i][j] = 0;
			}
		}
		
		for(int j = 0; j < w; j++) {
			for (int i = 0; i < H; i++) {
				mass[i][j] = 0;
			}
		}

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (mass[i][j] == 1) {
					count++;
				}
			}
		}

		System.out.print(count);
	}
}