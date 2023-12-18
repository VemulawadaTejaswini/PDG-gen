import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveC();
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();

		int h_num = (H / h);
		int w_num = (W / w);
		if (h_num * w_num * h * w < H * W - (h_num * w_num)) {
			System.out.println("Yes");
			for (int i_h = 1; i_h <= H; i_h++) {
				for (int i_w = 1; i_w <= W; i_w++) {
					if (i_h % h == 0 && i_w % w == 0) {
						System.out.print(-(h * w));
					} else {
						System.out.print(1);
					}
					if (i_w < W) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("No");
		}
	}
}