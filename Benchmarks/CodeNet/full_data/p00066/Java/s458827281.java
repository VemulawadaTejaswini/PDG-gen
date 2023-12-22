import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			String str = sc.nextLine();
			tictactoe(str);
		}

	}

	private static void tictactoe(String str) {
		char[][] t = new char[3][3];
		char winner = 'd';

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					t[i][j] = str.charAt( i * 3 + j );
				}
			}

			for (int i = 0; i < 3; i++) {
					if ( t[i][0] == t[i][1] && t[i][0] == t[i][2] &&
						 t[i][1] == t[i][2] && t[i][0] != 's'		)
					{
						winner = t[i][0];
						break;
					} else if (t[0][i] == t[1][i] && t[0][i] == t[2][i] &&
							 t[1][i] == t[2][i] && t[0][i] != 's'		)
					{
						winner = t[0][i];
						break;
					}
			}

			if ( winner == 'd' ) {
				if ( t[0][0] == t[1][1] && t[1][1] == t[2][2] &&
					 t[0][0] == t[2][2] && t[0][0] != 's'	)
				{
					winner = t[0][0];
				} else if ( t[0][2] == t[1][1] && t[1][1] == t[2][0] &&
						 	t[0][2] == t[2][0] && t[0][2] != 's'	)
				{
					winner = t[0][2];
				}

			}

			System.out.println(winner);
	}

}
