import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final long N = sc.nextLong();
		final long M = sc.nextLong();
		System.out.println(countCards(N, M));
		sc.close();
	}

	private long countCards(long n, long m) {
		if (n > m) {
			return countCards(m, n);
		}

		if (n == 1) {
			if (m == 1) {
				return 1;
			} else if (m == 2) {
				return 0;
			} else {
				return m - 2;
			}
		} else if (n == 2) {
			return 0;
		} else {
			return (n - 2) * (m - 2);
		}

	}

	private int testCode(int x, int y) {
		final int XSIZE = x;
		final int YSIZE = y;
		int[] a = { -1, 0, 1 };
		int[][] board = new int[XSIZE + 2][YSIZE + 2];

		for (int i = 0; i < XSIZE + 2; i++) {
			board[i][0] = -1;
			board[i][YSIZE + 1] = -1;
		}

		for (int i = 0; i < YSIZE + 2; i++) {
			board[0][i] = -1;
			board[XSIZE + 1][i] = -1;
		}

		for (int i = 1; i <= XSIZE; i++) {
			for (int j = 1; j <= YSIZE; j++) {
				for (int s : a) {
					for (int t : a) {
						if (board[i + s][j + t] >= 0) {
							board[i + s][j + t] += 1;
						}
					}
				}
			}
		}
		int cnt = 0;
		for (int i = 1; i <= XSIZE; i++) {
			for (int j = 1; j <= YSIZE; j++) {
				if (board[i][j] % 2 == 1) {
					cnt++;
				}
			}
		}
		printBoard(board);
		return cnt;
	}

	private void printBoard(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == -1) {
					System.out.print('x');
				} else {
					System.out.print(board[i][j]);
				}
			}
			System.out.println();
		}
	}
}