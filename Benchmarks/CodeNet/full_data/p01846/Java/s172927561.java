import java.util.Scanner;

/**
 * jfen
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			String S = sc.nextLine();
			if (S.equals("#")) break;

			int a, b, c, d;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			sc.nextLine();

			char[][] board = unpack(S);
			board[a - 1][b - 1] = '.';
			board[c - 1][d - 1] = 'b';

			System.out.println(pack(board));

		}

	} //end main


	static char[][] unpack(String s) {

		String[] lines = s.split("/");

		char[][] board = new char[lines.length][];

		for (int i = 0; i < lines.length; i++) {
			String row = "";
			int sp = 0;
			for (int j = 0; j < lines[i].length(); j++) {
				char c = lines[i].charAt(j);
				if ('0' <= c && c <= '9') {
					sp *= 10;
					sp += c - '0';
				} else {
					for (int k = 0; k < sp; k++) {
						row += '.';
					}
					row += 'b';
					sp = 0;
				}
			}
			for (int k = 0; k < sp; k++) {
				row += '.';
			}
			board[i] = row.toCharArray();
		}
		return board;
	}

	static String pack(char[][] board) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < board.length; i++) {
			String row = "";
			int sp = 0;
			for (int j = 0; j < board[i].length; j++) {
				char c = board[i][j];
				if (c == '.') {
					sp++;
				} else {
					if (sp > 0) {
						row += String.valueOf(sp);
					}
					row += 'b';
					sp = 0;
				}
			}
			if (sp > 0) {
				row += String.valueOf(sp);
			}
			if (0 < i) {
				sb.append('/');
			}
			sb.append(row);
		}
		return sb.toString();
	}
}