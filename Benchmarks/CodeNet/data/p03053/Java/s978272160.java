import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int H = scanner.nextInt();
		int W = scanner.nextInt();
		scanner.nextLine();

		int[][] board = new int[H][W];

		for (int y = 0; y < H; y++) {
			String s = scanner.nextLine();
			char[] chars = s.toCharArray();

			for (int x = 0; x < W; x++) {
				if (chars[x] == '#') {
					board[y][x] = 0;
				} else {
					board[y][x] = -1;
				}
			}
		}

		int answer = 0;

		while (!isFinished(board, H, W)) {

			action(board, answer, H, W);
			answer++;
		}

		System.out.println(answer);

	}

	public static boolean isFinished(int[][] board, int H, int W) {
		for (int y = 0; y < H; y++) {
			for (int x = 0; x < W; x++) {
				if (board[y][x] == -1) {
					return false;
				}
			}
		}
		return true;
	}

	public static void action(int[][] board, int answer, int H, int W) {
		for (int y = 0; y < H; y++) {
			for (int x = 0; x < W; x++) {
				if (board[y][x] == -1) {
					if (x < W - 1) {
						if (board[y][x + 1] == answer) {
							board[y][x] = answer + 1;
							continue;
						}
					}

					if (x > 0) {
						if (board[y][x - 1] == answer) {
							board[y][x] = answer + 1;
							continue;
						}
					}

					if (y < H - 1) {
						if (board[y + 1][x] == answer) {
							board[y][x] = answer + 1;
							continue;
						}
					}
					if (y > 0) {
						if (board[y - 1][x] == answer) {
							board[y][x] = answer + 1;
							continue;
						}

					}
				}
			}
		}
	}

}
