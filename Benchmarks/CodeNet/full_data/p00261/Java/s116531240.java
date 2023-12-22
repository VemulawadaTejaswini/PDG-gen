import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Aka-beko and 40 Thieves
 */
public class Main {

	static int[][] map = {
			//
			{ 2, 3 },// 0:A
			{ 3, 2 },// 1:B
			{ 6, 4 },// 2:X
			{ 2, 6 },// 3:Y
			{ 5, 1 },// 4:Z
			{ 1, 3 },// 5:W
			{ 6, 6 },// 6:Sand
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("#")) {

			int at = 0;
			for (char c : line.toCharArray()) {
				at = map[at][c - '0'];
				if (at == 6) {
					break;
				}
			}
			if (at == 1) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}
}