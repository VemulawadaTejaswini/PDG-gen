import java.util.Scanner;

public class Main {
	static class Pos {
		int x, y;

		Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static boolean f(Pos start, Pos s[], int n, int m) {
		if (m - 1 < n) {
			return true;
		}

		Pos next[] = nextArea(jump(start), sprinkler(s[n]));
		for (int i = 0; i < next.length; i++) {
			if (f(next[i], s, n + 1, m)) {
				return true;
			}
		}

		return false;
	}

	public static Pos[] jump(Pos s) {
		Pos next[] = new Pos[12];
		next[0]  = new Pos(s.x + 2, s.y + 1);
		next[1]  = new Pos(s.x + 2, s.y    );
		next[2]  = new Pos(s.x + 2, s.y - 1);
		next[3]  = new Pos(s.x - 2, s.y + 1);
		next[4]  = new Pos(s.x - 2, s.y    );
		next[5]  = new Pos(s.x - 2, s.y - 1);
		next[6]  = new Pos(s.x + 1, s.y + 2);
		next[7]  = new Pos(s.x    , s.y + 2);
		next[8]  = new Pos(s.x - 1, s.y + 2);
		next[9]  = new Pos(s.x + 1, s.y - 2);
		next[10] = new Pos(s.x    , s.y - 2);
		next[11] = new Pos(s.x - 1, s.y - 2);

		return remake(next);
	}

	public static Pos[] sprinkler(Pos s) {
		Pos next[] =  new Pos[9];
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				next[(i + 1) * 3 + (j + 1)] = new Pos(s.x + i, s.y + j);
			}
		}

		return remake(next);
	}

	public static Pos[] nextArea(Pos f[], Pos s[]) {
		Pos next[] = new Pos[Math.max(f.length, s.length)];

		int index = 0;
		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (f[i].x == s[j].x && f[i].y == s[j].y) {
					next[index++] = new Pos(f[i].x, f[i].y);
				}
			}
		}

		return remake(next);
	}

	public static Pos[] remake(Pos s[]) {
		int index = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null && 0 <= s[i].x && s[i].x < 10 && 0 <= s[i].y && s[i].y < 10) {
				s[index++] = s[i];
			}
		}
		Pos s2[] = new Pos[index];
		for (int i = 0; i < index; i++) {
			s2[i] = s[i];
		}
		return s2;
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

			if (f(start, s, 0, n)) {
				System.out.println("OK");
			} else {
				System.out.println("NA");
			}
		}
	}
}