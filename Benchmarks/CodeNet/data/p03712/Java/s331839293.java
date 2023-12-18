import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int W = s.nextInt();

		char[][] arrays = new char[2][3];

		for (int i = 0; i < H; i++) {
			arrays[i] = s.next().toCharArray();
		}
		for (int i = 0; i < H + 2; i++) {
			if (i == 0 || i == H + 1) {
				for (int j = 0; j < W + 2; j++) {
					System.out.print("#");
				}
			} else {
				for (int j = 0; j < W + 2; j++) {
					if (j == 0 || j == W + 1) {
						System.out.print("#");
					} else {
						System.out.print(arrays[i - 1][j - 1]);
					}
				}
			}
			System.out.print("\n");
		}
	}

}
