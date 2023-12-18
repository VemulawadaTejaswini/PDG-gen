import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int[] a = new int[N];
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		for (int i = 0; i < N; ++i) {
			a[i] = sc.nextInt();
			for (int j = 0; j < a[i]; ++j) {
				dq.add(i + 1);
			}
		}
		int[][] col = new int[H][W];
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				col[i][(i % 2 == 0 ? j : W - 1 - j)] = dq.pollFirst();
			}
		}
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				System.out.print(col[i][j] + (j == W - 1 ? "\n" : " "));
			}
		}
	}
}