import java.util.*;

public class Main {
	static char[][] field;
	static int h;
	static int w;

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		field = new char[h][];
		for (int i = 0; i < h; i++) {
			field[i] = sc.next().toCharArray();
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (field[i][j] == '#') {
					continue;
				}
				int count = 0;
				for (int x = -1; x <= 1; x++) {
					for (int y = -1; y <= 1; y++) {
						if (x * x + y * y != 0) {
							count += countMine(j + x, i + y);
						}
					}
				}
				field[i][j] = (char)('0' + count);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < h; i++) {
			sb.append(field[i]).append("\n");
		}
		System.out.print(sb);
	}
	
	static int countMine(int x, int y) {
		if (x < 0 || x >= w || y < 0 || y >= h) {
			return 0;
		}
		if (field[y][x] == '#') {
			return 1;
		} else {
			return 0;
		}
	}
	
}
