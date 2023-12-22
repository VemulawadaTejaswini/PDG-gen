
import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			char[][] table = new char[3][];
			table[0] = sc.next().toCharArray();
			if (table[0][0] == '0') return;
			table[1] = sc.next().toCharArray();
			table[2] = sc.next().toCharArray();
			String ans = "NA";
			if (win(table, 'b')) ans = "b";
			else if (win(table, 'w')) ans = "w";
			System.out.println(ans);
		}
	}
	
	boolean win(char[][] table, char ch) {
		for (int i = 0; i < 3; i++) {
			int cnt = 0;
			for (int j = 0; j < 3; j++) {
				if (table[i][j] == ch) {
					cnt++;
				}
			}
			if (cnt == 3) return true;
		}
		for (int j = 0; j < 3; j++) {
			int cnt = 0;
			for (int i = 0; i < 3; i++) {
				if (table[i][j] == ch) {
					cnt++;
				}
			}
			if (cnt == 3) return true;
		}
		
		if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
		if (table[0][2] == ch && table[1][1] == ch && table[2][0] == ch) return true;
		return false;
	}
}