import java.awt.Point;
import java.util.Scanner;

public class Main {
	static char[][] map;

	public static void main(String[] args) throws java.io.IOException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			map = new char[n + 1][n + 1];
			for (int i = 0; i < n; i++) {
				map[i] = (sc.next() + "*").toCharArray();
			}
			int max = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (map[i][j] != '*' && n-(j+1)>max) {		
						max = Math.max(max, ss(2, new Point(j+1, i), new Point(j, i+1)));
					}
				}
			}

			System.out.println(max);
		}
	}

	public static int ss(int n, Point a, Point b) {
		for (int i = 0; i < n; i++) {
			if (map[a.y + i][a.x] != '.' || map[b.y][b.x + i] != '.') {
				return n - 1;
			}
		}
		return ss(n + 1, new Point(a.x + 1, a.y), new Point(b.x, b.y + 1));
	}

}