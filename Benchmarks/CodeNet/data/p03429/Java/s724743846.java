import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		char[][] map = new char[n][m];
		if (n % 2 == 1 && m % 2 == 1) {
			int aaa = Math.min(a, m / 2);

			for (int x = 0; x < aaa; x++) {
				map[n - 1][x * 2] = '<';
				map[n - 1][x * 2 + 1] = '>';
			}

			int bbb = Math.min(b, n / 2);

			for (int x = 0; x < bbb; x++) {
				map[x * 2][m - 1] = '^';
				map[x * 2 + 1][m - 1] = 'v';
			}

			boolean flag = checkEven(n - 1, m - 1, a - aaa, b - bbb);
			if (flag) {
				System.out.println("YES");
				fillEven(map, n - 1, m - 1, a - aaa, b - bbb);
				printMap(map);
			} else {
				System.out.println("NO");
			}

		} else if (n % 2 == 1) {
			int aaa = Math.min(a, m / 2);

			for (int x = 0; x < aaa; x++) {
				map[n - 1][x * 2] = '<';
				map[n - 1][x * 2 + 1] = '>';
			}

			boolean flag = checkEven(n - 1, m, a - aaa, b);
			if (flag) {
				System.out.println("YES");
				fillEven(map, n - 1, m, a - aaa, b);
				printMap(map);
			} else {
				System.out.println("NO");
			}

		} else if (m % 2 == 1) {
			int bbb = Math.min(b, n / 2);

			for (int x = 0; x < bbb; x++) {
				map[x * 2][m - 1] = '^';
				map[x * 2 + 1][m - 1] = 'v';
			}

			boolean flag = checkEven(n, m - 1, a, b - bbb);
			if (flag) {
				System.out.println("YES");
				fillEven(map, n, m - 1, a, b - bbb);
				printMap(map);
			} else {
				System.out.println("NO");
			}

		} else {
			boolean flag = checkEven(n, m, a, b);
			if (flag) {
				System.out.println("YES");
				fillEven(map, n, m, a, b);
				printMap(map);
			} else {
				System.out.println("NO");
			}
		}
	}

	boolean checkEven(int n, int m, int a, int b) {
		return n * m >= ((a + 1) / 2 + (b + 1) / 2) * 4;
	}

	void fillEven(char[][] map, int n, int m, int a, int b) {
		for (int i = 0; i < n; i += 2) {
			for (int j = 0; j < m; j += 2) {
				if (a >= 2) {
					map[i][j] = '<';
					map[i][j+1] = '>';
					map[i+1][j] = '<';
					map[i+1][j+1] = '>';

					a -= 2;
				} else if (a == 1) {
					map[i][j] = '<';
					map[i][j+1] = '>';

					a--;
				} else if (b >= 2) {
					map[i][j] = '^';
					map[i+1][j] = 'V';
					map[i][j+1] = '^';
					map[i+1][j+1] = 'V';

					b -= 2;
				} else if (b == 1) {
					map[i][j] = '^';
					map[i+1][j] = 'V';

					b--;
				}
			}
		}

	}

	void printMap(char[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if (map[i][j] == 0) {
					map[i][j] = '.';
				}
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}
