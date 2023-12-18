import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt = 0;

		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.nextLine();

		char box[][] = new char[h][w];

		for (int i = 0; i < h; i++) {
			String temp = sc.nextLine();
			for (int j = 0; j < w; j++) {
				box[i][j] = temp.charAt(j);
			}
		}

		int save = 0;
		char curCell;
		char rightCell;
		char underCell;

		for (int i = 0; i < h; i++) {
			char curRow[] = box[i];
			char nextRow[] = null;
			if (i + 1 < h) {
				nextRow = box[i + 1];
			}
			for (int j = save; j < w; j++) {
				curCell = curRow[j];
				rightCell = '1';
				underCell = '1';

				if (j + 1 < w) {
					rightCell = curRow[j + 1];
				}
				if (nextRow != null) {
					underCell = nextRow[j];
				}

				if (i == 0 && j == 0) {
					if (curCell != '.') {
						cnt++;
					}
				} else if (i == h - 1 && j == w - 1) {
					//					if (curCell != '.') {
					//						cnt++;
					//					}
					break;
				}

				if (rightCell != '.' && underCell != '.') {
					if (rightCell == '1') {
						save = j;
						cnt++;
						break;
					}
					save = j;
					cnt++;
					continue;
				} else if (rightCell != '.') {
					save = j;
					break;
				}

			}
		}

		System.out.println(cnt);
	}
}
