import java.util.Scanner;

public class Main {

	static Scanner sc = new java.util.Scanner(System.in);


	public static void main(String[] args) {

		int[][] num = new int[15][15];
		String str = "";

		while (sc.hasNextLine()) {
			// ???????????¨????????????????´?
			for (int i = 0; i < 8; i++) {
				syokika(num);
				str = sc.next();
				String[] st = str.split("");
				for (int j = 0; j < 8; j++) {
					num[i][j] = Integer.parseInt(st[j]);
				}
			}
			// ????????????
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (num[i][j] == 1 && num[i][j + 1] == 1 && num[i + 1][j] == 1 && num[i + 1][j + 1] == 1) {
						System.out.println("A");
					} else if (num[i][j] == 1 && num[i + 1][j] == 1 && num[i + 2][j] == 1 && num[i + 3][j] == 1) {
						System.out.println("B");
					} else if (num[i][j] == 1 && num[i][j + 1] == 1 && num[i][j + 2] == 1 && num[i][j + 3] == 1) {
						System.out.println("C");
					} else if (num[i][j + 1] == 1 && num[i + 1][j] == 1 && num[i][j + 1] == 1 && num[i + 2][j] == 1) {
						System.out.println("D");
					} else if (num[i][j] == 1 && num[i][j + 1] == 1 && num[i + 1][j + 1] == 1
							&& num[i + 1][j + 2] == 1) {
						System.out.println("E");
					} else if (num[i][j] == 1 && num[i + 1][j] == 1 && num[i + 1][j + 1] == 1
							&& num[i + 2][j + 1] == 1) {
						System.out.println("F");
					} else if (num[i][j + 1] == 1 && num[i][j + 2] == 1 && num[i + 1][j] == 1
							&& num[i + 1][j + 1] == 1) {
						System.out.println("G");
					}

				}
			}

		}

	}

	// ???????????¢??°
	public static int[][] syokika(int[][] num) {

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				num[i][j] = 0;
			}
		}
		return num;
	}

}