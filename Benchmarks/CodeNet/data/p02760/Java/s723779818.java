import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc157/tasks/abc157_b
 *
 */
public final class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			Box[][] bingo = new Box[3][3];

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					bingo[i][j] = new Box(scanner.nextInt());
				}
			}

			int n = scanner.nextInt();
			for (int ct = 0; ct < n; ct++) {
				int number = scanner.nextInt();
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (bingo[i][j].number == number) {
							bingo[i][j].checked = true;
						}
					}
				}
			}

			boolean succeed = false;
			if (bingo[0][0].checked && bingo[0][1].checked && bingo[0][2].checked) {
				succeed |= true;
			}
			if (bingo[1][0].checked && bingo[1][1].checked && bingo[1][2].checked) {
				succeed |= true;
			}
			if (bingo[2][0].checked && bingo[2][1].checked && bingo[2][2].checked) {
				succeed |= true;
			}

			if (bingo[0][0].checked && bingo[1][0].checked && bingo[2][0].checked) {
				succeed |= true;
			}
			if (bingo[0][1].checked && bingo[1][1].checked && bingo[2][1].checked) {
				succeed |= true;
			}
			if (bingo[0][2].checked && bingo[1][2].checked && bingo[2][2].checked) {
				succeed |= true;
			}

			if (bingo[0][0].checked && bingo[1][1].checked && bingo[2][2].checked) {
				succeed |= true;
			}
			if (bingo[2][0].checked && bingo[1][1].checked && bingo[0][2].checked) {
				succeed |= true;
			}

			System.out.println(succeed ? "Yes" : "No");
		}
	}

	private static final class Box {
		public final int number;
		public boolean checked;

		public Box(int number) {
			this.number = number;
			this.checked = false;
		}

	}

}
