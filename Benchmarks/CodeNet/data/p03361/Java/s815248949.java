
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		sc.nextLine();

		String[][] board = new String[H][W];

		for (int i = 0; i < H; i++) {
			board[i] = sc.nextLine().split("");
		}

		int dx[] = {1,0,-1,0};
		int dy[] = {0,1,0,-1};
		boolean ans = false;

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if ("#".equals(board[i][j])) {
					for (int d = 0; d < 4; d++) {
						ans = false;
						int ni = i + dy[d];
						int nj = j + dx[d];
						if (ni < 0 || H <= ni) {
							continue;
						}
						if (nj < 0 || W <= nj) {
							continue;
						}
						if ("#".equals(board[ni][nj])) {
							ans = true;
						}
					}
					if (!ans) {
						break;
					}
				}
			}
		}
		if (ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
