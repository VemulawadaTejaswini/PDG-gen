
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		str = new char[a][b];
		for (int i = 0; i < a; i++)
			str[i] = scanner.next().toCharArray();
		pat = new char[2][2];
		for (int i = 0; i < 2; i++)
			pat[i] = scanner.next().toCharArray();
		int ret = 0;
		ans = 0;
		map = new boolean[a][b];
		for (int i = 0; i < a - 1; i++) {
			loop: for (int j = 0; j < b - 1; j++) {
				for (int k = 0; k < 2; k++) {
					for (int l = 0; l < 2; l++) {
						if (str[i + k][j + l] != pat[k][l])
							continue loop;
					}

				}
				map[i][j] = true;
				ans++;

			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				for (int k = 0; k < 3; k++) {
					if (str[i][j] == cs[k])
						continue;
					char tmp = str[i][j];
					str[i][j] = cs[k];
					ret = Math.max(ret, slove(i, j));
					str[i][j] = tmp;
				}
			}
		}
		System.out.println(ret + ans);
	}

	private int slove(int p, int q) {
		int ret = 0;
		for (int i = p - 1; i <= p; i++) {
			loo: for (int j = q - 1; j <= q; j++) {
				if (i < 0 || a - 1 <= i || j < 0 || b - 1 <= j)
					continue;
				for (int k = 0; k < 2; k++) {
					for (int l = 0; l < 2; l++) {
						if (str[i + k][j + l] != pat[k][l]) {
							if (map[i][j])
								ret--;
							continue loo;
						}
					}

				}
				if (!map[i][j])
					ret++;
			}
		}
		return ret;
	}

	int a, b, ans;
	boolean[][] map;
	char[][] str, pat;
	char[] cs = { 'J', 'O', 'I' };
}