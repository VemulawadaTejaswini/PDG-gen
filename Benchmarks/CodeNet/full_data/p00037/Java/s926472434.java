import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj0037/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/xxxyyyy/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		char[][] table = new char[9][9];
		for (int i = 0; i < 9; i++) {
			char[] str = sc.next().toCharArray();
			if (i % 2 == 0) {
				for (int col = 1; col < 9; col += 2)
					table[i][col] = str[col / 2];
			} else {
				for (int col = 0; col < 9; col += 2)
					table[i][col] = str[col / 2];
			}
		}
		System.out.println(solve(table));

	}

	String solve(char[][] table) {
		int row = 0, col = 0, dir = 0;
		char[] dirs = "RDLU".toCharArray();
		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };
		StringBuilder sb = new StringBuilder();
		do {
			for(int i = 0; i < 4; i++) {
				int next_dir = (dir + i + 3) % 4;
				int nr = row + dr[next_dir];
				int nc = col + dc[next_dir];
				if( !(0 <= nr && nr < 9 && 0 <= nc && nc < 9) ) continue;
				if( table[nr][nc] != '1' ) continue;
				row = nr + dr[next_dir];
				col = nc + dc[next_dir];
				dir = next_dir;
				sb.append(dirs[dir]);
				break;
			}
		} while( (row | col) != 0);
		return sb.toString();
	}
	

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}
}