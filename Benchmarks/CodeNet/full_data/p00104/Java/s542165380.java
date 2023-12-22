
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			if (h == 0 && w == 0) {
				break;
			}
			char[][] map = new char[h][w];
			boolean[][] loop = new boolean[h][w];
			for (int i = 0; i < h; i++) {
				map[i] = scanner.next().toCharArray();
			}

			int x = 0;
			int y = 0;
			loop: while (true) {
				if (loop[y][x]) {
					System.out.println("LOOP");
					break;
				}
				loop[y][x] = true;
				switch (map[y][x]) {
				case '>':
					x++;
					break;
				case '<':
					x--;
					break;
				case '^':
					y--;
					break;
				case 'v':
					y++;
					break;
				default:
					System.out.println(x + " " + y);
					break loop;
				}
			}
		}

	}

}