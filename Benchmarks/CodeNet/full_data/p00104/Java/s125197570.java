
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
			boolean flag = false;
			while (true) {
				if (loop[y][x]) {
					flag = true;
					break;
				}
				loop[y][x] = true;
				if (map[y][x] == '>')
					x++;
				else if (map[y][x] == '<')
					x--;
				else if (map[y][x] == '^')
					y--;
				else if (map[y][x] == 'v')
					y++;
				else
					break;
			}
			if (flag) {
				System.out.println("LOOP");
			} else {
				System.out.println(x + " " + y);
			}
		}

	}

}