import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int h = sc.nextInt(), w = sc.nextInt();
		boolean[][] board = new boolean[h][w];
		for (int i = 0; i < h; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '#') {
					board[i][j] = true;
				}
			}
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (board[i][j]) {
					if (i == 0 && j == 0 || i == 0 && board[i][j - 1] || j == 0 && board[i - 1][j]
						|| i != 0 && j != 0 && (board[i - 1][j] ^ board[i][j - 1])) {
						continue;
					}
					System.out.println("Impossible");
					return;
				}
			}
		}
		System.out.println("Possible");
	}
}