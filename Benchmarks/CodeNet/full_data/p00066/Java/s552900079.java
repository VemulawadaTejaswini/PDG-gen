import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		char[][] map = new char[5][5];

		for (; sc.hasNextLine();) {

			String buffer = sc.nextLine();

			if (buffer.equals("_"))

				break;

			for (int i = 0; i < 9; i++) {

				map[i / 3 + 1][i % 3 + 1] = buffer.charAt(i);

			}

			int[] dx = { 0, 1, 1, 1 };

			int[] dy = { 1, -1, 0, 1 };

			char mes = 'd';

			for (int i = 1; i <= 3; i++) {

				for (int j = 1; j <= 3; j++) {

					for (int p = 0; p < 4; p++) {

						if (map[i][j] == map[i + dx[p]][j + dy[p]]) {

							if (map[i][j] == map[i - dx[p]][j - dy[p]]) {

								if (map[i][j] == 'x' || map[i][j] == 'o') {

									mes = map[i][j];

								}

							}

						}

					}

				}

			}

			System.out.println(mes);

		}



	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();



	}

}