import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		// ------------------------------------------------
		int[][] a = new int[3][3];
		boolean[][] card = { { false, false, false }, { false, false, false }, { false, false, false } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = Integer.parseInt(sc.next());
			}
		}
		int n = Integer.parseInt(sc.next());

		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(sc.next());
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (a[i][j] == b[k]) {
						card[i][j] = true;
					}
				}
			}
		}

		boolean bingo = false;
		if ((card[0][0] && card[1][1] && card[2][2]) || (card[0][2] && card[1][1] && card[2][0])) {
			bingo = true;
		}
		for (int i = 0; i < 3; i++) {
			if ((card[i][0] && card[i][1] && card[i][2]) || (card[0][i] && card[1][i] && card[2][i])) {
				bingo = true;
			}
		}
		if (bingo) {
			out.println("Yes");
		} else {
			out.println("No");
		}

		// ------------------------------------------------
		sc.close();
		out.flush();
	}
}