import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int H = Integer.parseInt(tokens[0]);
		int W = Integer.parseInt(tokens[1]);
		char[][] a = new char[H][W];
		for (int i = 0; i < H; ++i) {
			String line = in.nextLine();
			for (int j = 0; j < W; ++j) {
				a[i][j] = line.charAt(j);
			}
		}
		char[][] result = remove(a);
		for (int i = 0; i < result.length; ++i) {
			for (int j = 0; j < result[i].length; ++j) {
				System.out.print(result[i][j]);
			}
			System.out.println("");
		}
		in.close();
	}

	public static char[][] remove(char[][] origMat) {
		int rmRowIndex = checkRow(origMat);
		int rmColIndex = checkCol(origMat);
		char[][] temp = null;
		if (rmRowIndex < 0) {
			temp = origMat;
		} else {
			temp = removeRow(origMat, rmRowIndex);
		}
		char[][] temp2 = null;
		if (rmColIndex < 0) {
			temp2 = temp;
		} else {
			temp2 = removeCol(temp, rmColIndex);
		}
		if (origMat.length == temp2.length && origMat[0].length == temp2[0].length) {
			return temp2;
		} else {
			return remove(temp2);
		}
	}

	public static char[][] removeRow(char[][] origMat, int rmRowIndex) {
		char[][] result = new char[origMat.length - 1][origMat[0].length];
		for (int i = 0; i < rmRowIndex; ++i) {
			for (int j = 0; j < origMat[0].length; ++j) {
				result[i][j] = origMat[i][j];
			}
		}
		for (int i = rmRowIndex + 1; i < origMat.length; ++i) {
			for (int j = 0; j < origMat[0].length; ++j) {
				result[i - 1][j] = origMat[i][j];
			}
		}
		return result;
	}

	public static char[][] removeCol(char[][] origMat, int rmColIndex) {
		char[][] result = new char[origMat.length][origMat[0].length - 1];
		for (int i = 0; i < rmColIndex; ++i) {
			for (int j = 0; j < origMat.length; ++j) {
				result[j][i] = origMat[j][i];
			}
		}
		for (int i = rmColIndex + 1; i < origMat[0].length; ++i) {
			for (int j = 0; j < origMat.length; ++j) {
				result[j][i - 1] = origMat[j][i];
			}
		}
		return result;
	}

	public static int checkCol(char[][] mat) {
		int result = -1;
		for (int i = 0; i < mat[0].length; ++i) {
			boolean allSpace = true;
			for (int j = 0; j < mat.length; ++j) {
				if (mat[j][i] == '#') {
					allSpace = false;
					break;
				}
			}
			if (allSpace) {
				result = i;
				break;
			}
		}
		return result;
	}

	public static int checkRow(char[][] mat) {
		int result = -1;
		for (int i = 0; i < mat.length; ++i) {
			boolean allSpace = true;
			for (int j = 0; j < mat[i].length; ++j) {
				if (mat[i][j] == '#') {
					allSpace = false;
					break;
				}
			}
			if (allSpace) {
				result = i;
				break;
			}
		}
		return result;
	}
}