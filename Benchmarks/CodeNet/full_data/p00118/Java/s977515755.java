// Property Distribution
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	int h, w;
	char[][] field;
	Queue<int[]> queue = new ArrayDeque<int[]>();

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
			field = new char[h][];
			for (int i = 0; i < h; i++)
				field[i] = sc.next().toCharArray();
			int result = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (field[i][j] != '.') {
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
		char c = field[y][x];
		queue.add(new int[] { x, y });
		while (!queue.isEmpty()) {
			int[] p = queue.poll();
			field[p[1]][p[0]] = '.';
			if (p[1] > 0 && field[p[1] - 1][p[0]] == c)
				queue.add(new int[] { p[0], p[1] - 1 });
			if (p[0] > 0 && field[p[1]][p[0] - 1] == c)
				queue.add(new int[] { p[0] - 1, p[1] });
			if (p[1] < h - 1 && field[p[1] + 1][p[0]] == c)
				queue.add(new int[] { p[0], p[1] + 1 });
			if (p[0] < w - 1 && field[p[1]][p[0] + 1] == c)
				queue.add(new int[] { p[0] + 1, p[1] });
		}
	}

}