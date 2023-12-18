import java.util.Scanner;

public class Main {
	static int[][] bingo = new int[3][3];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				bingo[i][j] = Integer.parseInt(sc.next());
			}
		}
		int n = Integer.parseInt(sc.next());
		for (int i = 0; i < n; i++) {
			int ball = Integer.parseInt(sc.next());
			check(ball);
		}

		if (isBingo()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	private static boolean isBingo() {
		// 縦、横
		for (int i = 0; i < 3; i++) {
			if (bingo[i][0] == -1 && bingo[i][1] == -1 && bingo[i][2] == -1) {
				return true;
			}
			if (bingo[0][i] == -1 && bingo[1][i] == -1 && bingo[2][i] == -1) {
				return true;
			}
		}

		// ナナメ
		if (bingo[0][0] == -1 && bingo[1][1] == -1 && bingo[2][2] == -1) {
			return true;
		}
		if (bingo[2][0] == -1 && bingo[1][1] == -1 && bingo[0][2] == -1) {
			return true;
		}
		return false;
	}

	static void check(int num) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (num == bingo[i][j]) {
					bingo[i][j] = -1; // 穴
				}
			}
		}
	}

}
