import java.util.Scanner;

public class Main {
	private int[][] mass = new int[8][8];

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		String[] alp = {"A", "B", "C", "D", "E", "F", "G", "error"};
		while (scan.hasNext()) {
			String str = "error";
			for (int i = 0; i < 8; i++) {
				str = scan.nextLine();
				if (str.isEmpty()) break;
				for (int j = 0; j < 8; j++) {
					mass[i][j] = Integer.parseInt(str.substring(j, j + 1));
				}
			}
			if (str.isEmpty()) continue;
			System.out.println(alp[seek()]);
		}
	}
	
	private int seek() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (mass[i][j] == 1) {
					if (j + 1 < 8 && mass[i][j + 1] == 1) {
						if (i + 1 < 8) {
							if (mass[i + 1][j] == 1 && mass[i + 1][j + 1] == 1) {
								return 0;
							}else if (j + 2 < 8 && mass[i + 1][j + 1] == 1 && mass[i + 1][j + 2] == 1) {
								return 4;
							}else if (j - 1 > -1 && mass[i + 1][j - 1] == 1 && mass[i + 1][j] == 1) {
								return 6;
							}else if (j + 3 < 8 && mass[i][j + 2] == 1 && mass[i][j + 3] == 1) {
								return 2;
							}else {
								return 7;
							}
						}else {
							return 2;
						}
					}else {
						if (j + 1 < 8 && mass[i + 1][j + 1] == 1) {
							return 5;
						}else if (j - 1 > -1 && mass[i + 1][j - 1] == 1) {
							return 3;
						}else {
							return 1;
						}
					}
				}
			}
		}
		return 7;
	}
	
	private void debug() {
		System.out.println();
	}

}