import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int r = sc.nextInt();
		int c = sc.nextInt();

		int[][] sheet = new int[r + 1][c + 1];
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				int data = sc.nextInt();
				sheet[i][j] = data;
				sheet[i][c] += data;
				sheet[r][j] += data;
				sheet[r][c] += data;
			}
		}

		for (int i = 0; i < r + 1; i++) {
			StringBuffer line = new StringBuffer();
			for (int j = 0; j < c + 1; j++) {
				line.append(sheet[i][j]);
				if (j != c) {
					line.append(' ');
				}
			}
			System.out.println(line);
		}

		sc.close();
	}
}