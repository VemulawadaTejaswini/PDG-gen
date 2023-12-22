import java.util.Scanner;

public class Main {
	static class Pos {
		int x, y;

		Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static boolean f(Pos start, Pos s[], int n) {
		if (9 < n) {
			return true;
		}

		Pos next[] = jump(start);
		Pos nexts[] = sprinkler(s[n]);

		for (int i = 0; i < next.length; i++) {
			if (g(next[i], sprinkler(s[n]))) {
				if (f(next[i], s, n + 1)) {
					return true;
				}
			}
		}

		return false;
	}

	public static Pos[] jump(Pos start) {
		Pos next[] = new Pos[12];
		next[0]  = new Pos(start.x + 2, start.y + 1);
		next[1]  = new Pos(start.x + 2, start.y    );
		next[2]  = new Pos(start.x + 2, start.y - 1);
		next[3]  = new Pos(start.x - 2, start.y + 1);
		next[4]  = new Pos(start.x - 2, start.y    );
		next[5]  = new Pos(start.x - 2, start.y - 1);
		next[6]  = new Pos(start.x + 1, start.y + 2);
		next[7]  = new Pos(start.x    , start.y + 2);
		next[8]  = new Pos(start.x - 1, start.y + 2);
		next[9]  = new Pos(start.x + 1, start.y - 2);
		next[10] = new Pos(start.x    , start.y - 2);
		next[11] = new Pos(start.x - 1, start.y - 2);

		int index = 0;
		for (int i = 0; i < 12; i++) {
			if (0 <= next[i].x && next[i].x < 10 && 0 <= next[i].y && next[i].y < 10) {
				next[index++] = next[i];
			}
		}

		Pos next2[] = new Pos[index];
		for (int i = 0; i < index; i++) {
			next2[i] = next[i];
		}
		return next2;
	}

	public static Pos[] sprinkler(Pos s) {
		Pos next[] = new Pos[9];

		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				next[(i + 1) * 3 + (j + 1)] = new Pos(s.x + i, s.y + j);
			}
		}

		int index = 0;
		for (int i = 0; i < 9; i++) {
			if (0 <= next[i].x && next[i].x < 10 && 0 <= next[i].y && next[i].y < 10) {
				next[index++] = next[i];
			}
		}

		Pos next2[] = new Pos[index];
		for (int i = 0; i < index; i++) {
			next2[i] = next[i];
		}
		return next2;
	}

	public static boolean g(Pos start, Pos s[]) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].x == start.x && s[i].y == start.y) {
				return true;
			}
		}

		return false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		Pos start;
		Pos s[];

		while (true) {
			start = new Pos(sc.nextInt(), sc.nextInt());
			if ((start.x | start.y) == 0) {
				break;
			}

			n = sc.nextInt();
			s = new Pos[n];
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				s[i] = new Pos(x, y);
			}

			if (f(start, s, 0)) {
				System.out.println("OK");
			} else {
				System.out.println("NA");
			}
		}
	}
}