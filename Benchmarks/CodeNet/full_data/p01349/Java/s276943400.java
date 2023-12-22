import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int height = scanner.nextInt();
		int width = scanner.nextInt();
		int n = scanner.nextInt();

		char[][] field = new char[height][width];// フィールド状態
		for (int i = 0; i < field.length; i++) {
			String line = scanner.next();
			for (int j = 0; j < field[i].length; j++) {
				field[i][j] = line.charAt(j);
			}
		}
		scanner.close();

		for (int ih = 0; ih < field.length; ih++) {
			for (int iw = 0; iw < field[ih].length; iw++) {
				int[][] dir = { { 0, 1 }, { 1, 0 } };
				for (int j = 0; j < dir.length; j++) {
					int jh = ih + dir[j][0];
					int jw = iw + dir[j][1];
					if (jh >= height || jw >= width
							|| field[jh][jw] == field[ih][iw]) {
						continue;
					}

					// フィールドを複製する
					char[][] cloneField = new char[height][width];
					for (int k = 0; k < cloneField.length; k++) {
						for (int k2 = 0; k2 < cloneField[k].length; k2++) {
							cloneField[k][k2] = field[k][k2];
						}
					}

					// 入れ替える
					char tmp = cloneField[ih][iw];
					cloneField[ih][iw] = cloneField[jh][jw];
					cloneField[jh][jw] = tmp;

					boolean infloop = false;
					while (true) {

						// 消えるところをリストアップする
						Deque<Integer> toVanish = new ArrayDeque<Integer>();
						for (int row = 0; row < cloneField.length; row++) {
							int start = -1;
							for (int l = 1; l < cloneField[row].length + 1; l++) {
								if (l < cloneField[row].length
										&& start == -1
										&& cloneField[row][l - 1] != '.'
										&& cloneField[row][l] == cloneField[row][l - 1]) {
									start = l - 1;
								} else if (l == cloneField[row].length
										|| cloneField[row][l] != cloneField[row][l - 1]) {
									if (start != -1 && l - start >= n) {
										for (int t = 0; t < cloneField[row].length; t++) {
											if (t >= start && t < l) {
												toVanish.add(width * row + t);
											}
										}
									}
									start = -1;
								}
							}
						}

						for (int column = 0; column < cloneField[0].length; column++) {
							int start = -1;
							for (int l = 1; l < cloneField.length + 1; l++) {
								if (l < cloneField.length
										&& start == -1
										&& cloneField[l - 1][column] != '.'
										&& cloneField[l][column] == cloneField[l - 1][column]) {
									start = l - 1;
								} else if (l == cloneField.length
										|| cloneField[l][column] != cloneField[l - 1][column]) {
									if (start != -1 && l - start >= n) {
										for (int t = 0; t < cloneField.length; t++) {
											if (t >= start && t < l) {
												toVanish.add(width * t + column);
											}
										}
									}
									start = -1;
								}

							}

						}

						// 消えるところがなければ終了
						if (toVanish.isEmpty() && infloop) {
							break;
						} else if (toVanish.isEmpty()) {
							infloop = true;
						} else {
							infloop = false;
						}

						// 消えるところを消す
						while (!toVanish.isEmpty()) {
							int k = toVanish.poll();
							int ki = k / width;
							int kj = k % width;
							cloneField[ki][kj] = '.';
						}

						// 落下処理
						for (int column = 0; column < cloneField[0].length; column++) {
							Deque<Character> characters = new ArrayDeque<Character>();
							for (int k = height - 1; k >= 0; k--) {
								if (cloneField[k][column] != '.') {
									characters.add(cloneField[k][column]);
								}
							}
							for (int k = height - 1; k >= 0; k--) {
								if (!characters.isEmpty()) {
									cloneField[k][column] = characters
											.pollFirst();
								} else {
									cloneField[k][column] = '.';
								}
							}
						}

					}

					boolean toApply = true;
					check: for (int k = 0; k < cloneField.length; k++) {
						for (int k2 = 0; k2 < cloneField[k].length; k2++) {
							if (cloneField[k][k2] != '.') {
								toApply = false;
								break check;
							}
						}
					}

					if (toApply) {
						System.out.println("YES");
						return;
					}
				}

			}
		}

		System.out.println("NO");
		return;

	}
}