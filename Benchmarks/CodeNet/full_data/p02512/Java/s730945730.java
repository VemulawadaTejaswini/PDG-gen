import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[][] field = new char[21][57];
	static Face[] facesBase = new Face[] { new Face(new String[] { ".....", "...|.", ".....", "...|.", "..-.." }),
			new Face(new String[] { "..-..", "...|.", "..-..", ".|...", "..-.." }),
			new Face(new String[] { "..-..", "...|.", "..-..", "...|.", "..-.." }),
			new Face(new String[] { ".....", ".|.|.", "..-..", "...|.", "....." }),
			new Face(new String[] { "..-..", ".|...", "..-..", "...|.", "..-.." }),
			new Face(new String[] { "..-..", ".|...", "..-..", ".|.|.", "..-.." }),
			new Face(new String[] { "..-..", "...|.", ".....", "...|.", "....." }),
			new Face(new String[] { "..-..", ".|.|.", "..-..", ".|.|.", "..-.." }),
			new Face(new String[] { "..-..", ".|.|.", "..-..", "...|.", "..-.." }), };

	static Face[][] faces = new Face[6][9];

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 9; ++i) {
			faces[0][i] = facesBase[i].mirrorHorz();
			faces[1][i] = faces[0][i].rotate270();
			faces[2][i] = faces[0][i];
			faces[3][i] = faces[0][i].rotate90();
			faces[4][i] = faces[0][i];
			faces[5][i] = facesBase[i].mirrorVert().mirrorHorz();
		}
		int[] posR = new int[] { 0, 7, 7, 7, 7, 14 };
		int[] posC = new int[] { 7, 0, 7, 14, 21, 7 };
		while (true) {
			for (int i = 0; i < 21; ++i) {
				String line = sc.nextLine();
				if (line.length() == 1) return;
				field[i] = line.toCharArray();
			}
			int[] my = new int[6];
			int[] other = new int[6];
			for (int i = 0; i < 6; ++i) {
				my[i] = get(i, posR[i] + 1, posC[i] + 1);
				other[i] = get(i, posR[i] + 1, 29 + posC[i] + 1);
			}
//			System.out.println(Arrays.toString(my));
//			System.out.println(Arrays.toString(other));
			int win = 0;
			int lose = 0;
			for (int i = 0; i < 6; ++i) {
				for (int j = 0; j < 6; ++j) {
					if (my[i] > other[j]) {
						++win;
					} else if (my[i] < other[j]) {
						++lose;
					}
				}
			}
			System.out.println(win >= lose ? "HIGH" : "LOW");
		}
	}

	static int get(int idx, int r, int c) {
		for (int i = 0; i < 9; ++i) {
			if (match(faces[idx][i], r, c)) {
				return i + 1;
			}
		}
		throw new RuntimeException();
	}

	static boolean match(Face f, int r, int c) {
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if (f.val[i][j] != field[r + i][c + j]) return false;
			}
		}
		return true;
	}

	static class Face {
		char[][] val = new char[5][5];

		Face(String[] v) {
			for (int i = 0; i < 5; ++i) {
				val[i] = v[i].toCharArray();
			}
		}

		Face() {}

		Face mirrorHorz() {
			Face ret = new Face();
			for (int i = 0; i < 5; ++i) {
				for (int j = 0; j < 5; ++j) {
					ret.val[i][j] = this.val[i][4 - j];
				}
			}
			return ret;
		}

		Face mirrorVert() {
			Face ret = new Face();
			for (int i = 0; i < 5; ++i) {
				for (int j = 0; j < 5; ++j) {
					ret.val[i][j] = this.val[4 - i][j];
				}
			}
			return ret;
		}

		Face rotate90() {
			Face ret = new Face();
			for (int i = 0; i < 5; ++i) {
				for (int j = 0; j < 5; ++j) {
					ret.val[i][j] = this.val[4 - j][i];
					if (ret.val[i][j] == '|') {
						ret.val[i][j] = '-';
					} else if (ret.val[i][j] == '-') {
						ret.val[i][j] = '|';
					}
				}
			}
			return ret;
		}

		Face rotate270() {
			Face ret = new Face();
			for (int i = 0; i < 5; ++i) {
				for (int j = 0; j < 5; ++j) {
					ret.val[i][j] = this.val[j][4 - i];
					if (ret.val[i][j] == '|') {
						ret.val[i][j] = '-';
					} else if (ret.val[i][j] == '-') {
						ret.val[i][j] = '|';
					}
				}
			}
			return ret;
		}

	}

}