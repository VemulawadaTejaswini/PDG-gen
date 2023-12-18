import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		String[] str = new String[h];
		char[][] chararray = new char[h][w];

		for (int i = 0; i < h; i++) {
			chararray[i] = scanner.next().toCharArray();
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int count = 0;
				if (chararray[i][j] == '#') {
					System.out.print("#");
				} else {
					if (i - 1 >= 0) {
						if (j - 1 >= 0) {
							if (chararray[i - 1][j - 1] == '#') {
								count++;
							}
							if (chararray[i][j - 1] == '#') {
								count++;
							}
						}
						if (j + 1 < w) {
							if (chararray[i - 1][j + 1] == '#') {
								count++;
							}
							if (chararray[i][j + 1] == '#') {
								count++;
							}
						}
						if (chararray[i - 1][j] == '#') {
							count++;
						}
					}
					if (i + 1 < h) {
						if (j - 1 >= 0) {
							if (chararray[i + 1][j - 1] == '#') {
								count++;
							}
						}
						if (j + 1 < w) {
							if (chararray[i + 1][j + 1] == '#') {
								count++;
							}
						}
						if (chararray[i + 1][j] == '#') {
							count++;
						}
					}
					System.out.print(count);
				}
			}
			System.out.println();
		}
	}
}