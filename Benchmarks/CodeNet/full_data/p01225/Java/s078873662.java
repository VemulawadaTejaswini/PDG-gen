import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] n = new int[9];
		String[] c = new String[9];
		int[][] num = new int[3][9];
		for (int l = 0; l < T; l++) {
			for (int i = 0; i < 9; i++) {
				n[i] = sc.nextInt();
			}
			for (int i = 0; i < 9; i++) {
				c[i] = sc.next();
			}
			for (int i = 0; i < 9; i++) {
				switch (c[i].charAt(0)) {
				case 'R':
					num[0][n[i] - 1]++;
					break;
				case 'G':
					num[1][n[i] - 1]++;
					break;
				case 'B':
					num[2][n[i] - 1]++;
				}
			}
			int count = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 9; j++) {
					if (num[i][j] >= 3) {
						num[i][j] -= 3;
						count++;
					} else if (num[i][j] > 0) {
						if (j < 7 && num[i][j + 1] > 0 && num[i][j + 2] > 0) {
							num[i][j]--;
							num[i][j + 1]--;
							num[i][j + 2]--;
							count++;
						}
					}
				}
			}
			if (count == 3)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}