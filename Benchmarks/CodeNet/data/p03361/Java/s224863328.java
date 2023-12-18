import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int H = sc.nextInt();
		final int W = sc.nextInt();

		char[][] board = new char[H + 2][W + 2];
		sc.nextLine();

		final char WALL = 'x';

		for (int i = 0; i < H + 2; i++) {
			board[i][0] = board[i][W + 1] = WALL;
		}
		for (int j = 0; j < W + 2; j++) {
			board[0][j] = board[H + 1][j] = WALL;
		}

		for (int i = 0; i < H; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < s.length(); j++) {
				board[i + 1][j + 1] = s.charAt(j);
			}
		}

		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				if (board[i][j] == '#') {
					if (board[i - 1][j] != '#' && board[i][j - 1] != '#' && board[i + 1][j] != '#'
							&& board[i][j + 1] != '#') {	
						System.out.println("No");
						return;
					}

				}
			}
		}
		System.out.println("Yes");
		sc.close();

	}

}
