// Ennichi
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt(), n = sc.nextInt();
		char[][] field = new char[h][w];
		for (int i = 0; i < h; i++)
			field[i] = sc.next().toCharArray();
		char[][] tfield = new char[h][w];
		boolean result = false;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w - 1; j++) {
				if ((field[i][j] != '.' || field[i][j + 1] != '.')
						&& field[i][j] != field[i][j + 1]) {
					for (int k = 0; k < h; k++)
						for (int l = 0; l < w; l++) {
							if (k == i && l == j)
								tfield[k][l] = field[i][j + 1];
							else if (k == i && l == j + 1)
								tfield[k][l] = field[i][j];
							else
								tfield[k][l] = field[k][l];
						}
					for (int k = h - 2; k >= 0; k--)
						for (int l = 0; l < w; l++) {
							if (tfield[k][l] != '.' && tfield[k + 1][l] == '.') {
								int t = k;
								while (t < h - 1 && tfield[t + 1][l] == '.') {
									tfield[t + 1][l] = tfield[t][l];
									tfield[t][l] = '.';
									t++;
								}
							}
						}
					boolean c = false;
					do {
						c = false;
						int[][] bfield = new int[h][w];
						for (int k = 0; k < h; k++) {
							for (int l = 0; l < w - n + 1; l++) {
								if (tfield[k][l] != '.') {
									boolean b = true;
									for (int m = 0; m < n; m++)
										b = b
												&& tfield[k][l] == tfield[k][l
														+ m];
									if (b) {
										for (int m = 0; m < n; m++)
											bfield[k][l + m] = 1;
										c = true;
									}
								}
							}
						}
						for (int k = 0; k < h - n + 1; k++) {
							for (int l = 0; l < w; l++) {
								if (tfield[k][l] != '.') {
									boolean b = true;
									for (int m = 0; m < n; m++)
										b = b
												&& tfield[k][l] == tfield[k + m][l];
									if (b) {
										for (int m = 0; m < n; m++)
											bfield[k + m][l] = 1;
										c = true;
									}
								}
							}
						}
						for (int l = 0; l < w; l++) {
							boolean b = false;
							for (int k = h - 1; k >= 0; k--) {
								if (b && tfield[k][l] != '.'
										&& bfield[k][l] == 0)
									bfield[k][l] = 2;
								if (bfield[k][l] == 1)
									b = true;
							}
						}
						for (int k = 0; k < h; k++)
							for (int l = 0; l < w; l++)
								if (bfield[k][l] == 1) {
									tfield[k][l] = '.';
									bfield[k][l] = 0;
								}
						for (int k = h - 2; k >= 0; k--)
							for (int l = 0; l < w; l++)
								if (bfield[k][l] == 2) {
									int t = k;
									while (t < h - 1 && bfield[t + 1][l] == 0) {
										bfield[t + 1][l] = 2;
										bfield[t][l] = 0;
										tfield[t + 1][l] = tfield[t][l];
										tfield[t][l] = '.';
										t++;
									}
								}
						boolean tresult = true;
						for (int k = 0; k < h; k++)
							for (int l = 0; l < w; l++)
								tresult = tresult && tfield[k][l] == '.';
						result = result || tresult;
					} while (c && !result);
				}
			}
		}
		if (result)
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}

	static void printfield(char[][] field, int w, int h) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++)
				System.out.print(field[i][j]);
			System.out.println();
		}
		System.out.println();
	}
}