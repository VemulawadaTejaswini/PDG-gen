import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int H = scanner.nextInt();
		int W = scanner.nextInt();
		scanner.nextLine();

		char[][] board = new char[H][W];

		for (int y = 0; y < H; y++) {
			String s = scanner.nextLine();
			char[] chars = s.toCharArray();
			board[y] = chars;
		}

		int answer = 0;

		char[][] currentBoard = board;

		while (!isFinish(currentBoard)) {
			answer++;
			char[][] nextBoard = new char[H][W];
			initBoard(nextBoard);
			draw(currentBoard, nextBoard);
			currentBoard = nextBoard;
		}

		System.out.println(answer);
	}

	public static boolean isFinish(char[][] board) {
		for (char[] a : board) {
			for (char b : a) {
				if (b == '.')
					return false;
			}
		}
		return true;
	}

	public static void initBoard(char[][] board) {
		for (int y = 0; y < board.length; y++) {
			for (int x = 0; x < board[y].length; x++) {
				board[y][x] = '.';
			}
		}
	}

	public static void draw(char[][] currentBoard, char[][] nextBoard) {
		int H = currentBoard.length;
		int W = currentBoard[0].length;

		for (int y = 0; y < currentBoard.length; y++) {
			for (int x = 0; x < currentBoard[y].length; x++) {
				if (currentBoard[y][x] == '#') {
					nextBoard[y][x] = '#';
					if (x < W - 1)
						nextBoard[y][x + 1] = '#';
					if (x > 0)
						nextBoard[y][x - 1] = '#';
					if (y < H - 1)
						nextBoard[y + 1][x] = '#';
					if (y > 0)
						nextBoard[y - 1][x] = '#';
				}
			}
		}

	}

}
