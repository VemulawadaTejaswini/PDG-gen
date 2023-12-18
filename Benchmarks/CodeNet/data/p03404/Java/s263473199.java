import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int white = 0;
		int black = 0;
		char map[][] = new char[100][100];
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 100; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						map[i][j] = '#';
					} else {
						map[i][j] = '.';
						white++;
					}
				} else {
					map[i][j] = '#';
				}
			}
		}
		black++;
		for (int i = 50; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (i % 2 != 0) {
					if (j % 2 == 0) {
						map[i][j] = '.';
					} else {
						map[i][j] = '#';
						black++;
					}
				} else {
					map[i][j] = '.';
				}
			}
		}
		white++;
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 100; j++) {
				if (A == white) {
					break;
				}
				if (map[i][j] == '.') {
					map[i][j] = '#';
					white--;
				}
			}
			if (A == white) {
				break;
			}
		}
		for (int i = 50; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (B == black) {
					break;
				}
				if (map[i][j] == '#') {
					map[i][j] = '.';
					black--;
				}
			}
			if (B == black) {
				break;
			}
		}

		System.out.println("100 100");
		for (int i = 0; i < 100; i++) {
			System.out.println(String.valueOf(map[i]));
		}
	}
}
