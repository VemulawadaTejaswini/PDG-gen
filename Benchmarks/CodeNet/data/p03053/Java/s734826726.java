import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] field = new char[h][w];
		for (int i = 0; i < h; i++) {
			field[i] = sc.next().toCharArray();
		}
		int count = 0;
		while (true) {
			char[][] next = new char[h][w];
			boolean isChanged = false;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (field[i][j] == '#') {
						next[i][j] = '#';
						if (i != 0) {
							if (field[i - 1][j] != '#') {
								isChanged = true;
							}
							next[i - 1][j] = '#';
						}
						if (i != h - 1) {
							if (field[i + 1][j] != '#') {
								isChanged = true;
							}
							next[i + 1][j] = '#';
						}
						if (j != 0) {
							if (field[i][j - 1] != '#') {
								isChanged = true;
							}
							next[i][j - 1] = '#';
						}
						if (j != w- 1) {
							if (field[i][j + 1] != '#') {
								isChanged = true;
							}
							next[i][j + 1] = '#';
						}
					}
				}
			}
			if (!isChanged) {
				break;
			}
			field = next;
			count++;
		}
		System.out.println(count);
	}
}
