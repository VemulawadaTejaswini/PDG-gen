// Property Distribution
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	int h, w;
	char[][] field;

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
		Queue<P> queue = new ArrayDeque<P>();
		queue.add(new P(x, y));
		while (!queue.isEmpty()) {
			P p = queue.remove();
			field[p.y][p.x] = '.';
			if (p.y > 0 && field[p.y - 1][p.x] == c)
				queue.add(new P(p.x, p.y - 1));
			if (p.x > 0 && field[p.y][p.x - 1] == c)
				queue.add(new P(p.x - 1, p.y));
			if (p.y < h - 1 && field[p.y + 1][p.x] == c)
				queue.add(new P(p.x, p.y + 1));
			if (p.x < w - 1 && field[p.y][p.x + 1] == c)
				queue.add(new P(p.x + 1, p.y));
		}
	}

}

class P {
	int x, y;

	P(int x, int y) {
		this.x = x;
		this.y = y;
	}
}