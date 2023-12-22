import java.awt.Point;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int w, h, n;
		int town[][];
		String st;
		char c;
		Point fuct[];
		int count;

		h = sc.nextInt();
		w = sc.nextInt();
		n = sc.nextInt();
		town = new int[h][w];
		fuct = new Point[n + 1];
		count = 0;
		for (int i = 0; i < h; i++) {
			st = sc.next();
			for (int j = 0; j < w; j++) {
				c = st.charAt(j);
				if (c == '.') {
					town[i][j] = 0;
				} else if (c == 'X') {
					town[i][j] = -1;
				} else if (c == 'S') {
					fuct[0] = new Point(j, i);
				} else {
					fuct[c - '0'] = new Point(j, i);
				}
			}
		}
		for (int i = 0; i < n; i++) {
			count += f(town, w, h, fuct[i], fuct[i + 1]);
			for (int j = 0; j < w; j++) {
				for (int k = 0; k < w; k++) {
					if (town[j][k] != -1) {
						town[j][k] = 0;
					}
				}
			}
		}
		System.out.println(count);
	}

	public static int f(int town[][], int w, int h, Point start, Point goal) {
		int count = 1;
		town[start.y][start.x] = 1;
		while (town[goal.y][goal.x] == 0) {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (town[i][j] == 0) {
						if (i + 1 < h && town[i + 1][j] == count) {
							town[i][j] = count + 1;
						} else if (0 <= i - 1 && town[i - 1][j] == count) {
							town[i][j] = count + 1;
						} else if (j + 1 < w && town[i][j + 1] == count) {
							town[i][j] = count + 1;
						} else if (0 <= j - 1&& town[i][j - 1] == count) {
							town[i][j] = count + 1;
						}
					}
				}
			}
			count++;
		}
		return town[goal.y][goal.x] - 1;
	}
}