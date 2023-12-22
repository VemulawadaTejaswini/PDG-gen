// Property Distribution
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int h, w;
	char[][] field;
	boolean[][] visited;

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if ((h | w) == 0)
				break;
			field = new char[h][w];
			visited = new boolean[h][w];
			for (int i = 0; i < h; i++)
				field[i] = sc.next().toCharArray();
			int result = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (!visited[i][j]) {
						result++;
						visit(i, j);
					}
				}
			}
			System.out.println(result);
		}
		sc.close();
	}

	void visit(int y, int x) {
		if (visited[y][x])
			return;
		visited[y][x] = true;
		if (y > 0 && field[y][x] == field[y - 1][x])
			visit(y - 1, x);
		if (x > 0 && field[y][x] == field[y][x - 1])
			visit(y, x - 1);
		if (y < h - 1 && field[y][x] == field[y + 1][x])
			visit(y + 1, x);
		if (x < w - 1 && field[y][x] == field[y][x + 1])
			visit(y, x + 1);
	}

}