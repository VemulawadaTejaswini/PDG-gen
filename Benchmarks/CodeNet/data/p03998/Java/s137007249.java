import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	static BufferedReader br;

	public static void main(String[] args) {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			char[][] player = new char[3][];

			for (int i = 0; i < 3; i++) {
				player[i] = br.readLine().toCharArray();
			}
			System.out.println(play(player));
		} catch (Exception e) {
			System.err.println("Error : " + e.getMessage());
		}
	}

	private static int play(char[][] player) {
		int i = 0, j = 0;
		try {
			int a = 0, b = 0, c = 0;
			while (true) {
				switch (player[i][j]) {
				case 'a':
					i = 0;
					j = a++;
					break;
				case 'b':
					i = 1;
					j = b++;
					break;
				case 'c':
					i = 2;
					j = c++;
					break;
				default:
					break;
				}
			}
		} catch (Exception e) {
			return i;
		}
	}

}
