import java.util.*;
import java.lang.*;

class Main {
	private final static int NUM_QUEENS = 8;
	private static boolean[] row = new boolean[NUM_QUEENS];
	private static boolean[] col = new boolean[NUM_QUEENS];
	private static boolean[] dpos = new boolean[NUM_QUEENS*2-1];
	private static boolean[] dneg = new boolean[NUM_QUEENS*2-1];
	private static boolean[][] fixed = new boolean[NUM_QUEENS][NUM_QUEENS];
	private static boolean[][] board = new boolean[NUM_QUEENS][NUM_QUEENS];
	private static boolean done;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int r, c;

		for (int i = 0; i < k; i++)	{
			r = scanner.nextInt();
			c = scanner.nextInt();

			fixedQueen(r, c);
		}

		if(solve(0)) {
			printBoard();
		} else {
			System.out.println("No solution!");
		}
	}

	private static boolean isQueen(int r, int c) {
		return board[r][c];
	}

	private static boolean isFixed(int r, int c) {
		return fixed[r][c];
	}

	private static boolean putQueen(int r, int c) {
		if(isQueen(r, c))
			return false;

		if(row[r] || col[c] || dpos[r+c] || dneg[r-c+NUM_QUEENS-1])
			return false;

		board[r][c] = true;
		row[r] = col[c] = dpos[r+c] = dneg[r-c+NUM_QUEENS-1] = true;

		return true;
	}

	private static void fixedQueen(int r, int c) {
		putQueen(r, c);
		fixed[r][c] = true;
	}

	private static boolean solve(int i) {
		if(i == NUM_QUEENS)
			return done = true;

		for(int j = 0; j < NUM_QUEENS; j++) {
			if(col[j] || dpos[i+j] || dneg[i-j+NUM_QUEENS-1])
				if(!isQueen(i,j))
					continue;

			if(!isFixed(i,j))
				putQueen(i, j);

			if(solve(i+1))
				return done;

			if(!isFixed(i,j))
				takeQueen(i,j);
		}

		return false;
	}

	private static void takeQueen(int r, int c) {
		if(isQueen(r,c)) {
			board[r][c] = false;
			row[r] = col[c] = dpos[r+c] = dneg[r-c+NUM_QUEENS-1] = false;
		}
	}

	private static void printBoard() {
		StringBuilder s = new StringBuilder();

		for(int i = 0; i < NUM_QUEENS; i++) {
			for(int j = 0; j < NUM_QUEENS; j++) {
				s.append(isQueen(i,j) ? "Q" : ".");
			}
			s.append("\n");
		}

		System.out.print(s);
	}
}
