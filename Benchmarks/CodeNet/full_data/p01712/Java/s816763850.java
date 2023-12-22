import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int W = sc.nextInt();
		int H = sc.nextInt();
		int[] row = new int[H + 1];
		int[] col = new int[W + 1];
		for (int i = 0; i < N; ++i) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int w = sc.nextInt();
			row[Math.max(0, y - w)]++;
			row[Math.min(H, y + w)]--;
			col[Math.max(0, x - w)]++;
			col[Math.min(W, x + w)]--;
		}
		boolean okRow = true;
		boolean okCol = true;
		int sum = 0;
		for (int i = 0; i < H; ++i) {
			sum += row[i];
			if (sum == 0) okRow = false;
		}
		sum = 0;
		for (int i = 0; i < W; ++i) {
			sum += col[i];
			if (sum == 0) okCol = false;
		}
		System.out.println(okRow || okCol ? "Yes" : "No");
	}

}