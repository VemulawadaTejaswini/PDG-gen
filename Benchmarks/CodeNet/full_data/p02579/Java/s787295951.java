import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var h = sc.nextInt();
		var w = sc.nextInt();
		var ch = sc.nextInt();
		var cw = sc.nextInt();
		var dh = sc.nextInt();
		var dw = sc.nextInt();
		var s = new int[h][w];
		for (var i = 0; i < h; i++) {
			var rs = sc.next();
			for (var j = 0; j < w; j++) {
				s[i][j] = rs.substring(j, j + 1).equals(".") ? 0 : -1;
			}
		}
		sc.close();

		var number = 1;
		var set = new HashSet<Position>();
		set.add(new Main().new Position(ch - 1, cw - 1));
		while (!set.isEmpty()) {
			var set2 = new HashSet<Position>();
			for (var p : set) {
				s[p.getH()][p.getW()] = number;
				check(s, p, number, set2);
			}
			number++;
			set = set2;
		}

		var result = s[dh - 1][dw - 1] < 0 ? -1 : s[dh - 1][dw - 1] - 1;
		System.out.println(result);
	}

	public static void check(int[][] s, Position p, int number, HashSet<Position> set) {
		var h = s.length;
		var w = s[0].length;
		var ph = p.getH();
		var pw = p.getW();
		for (var i = ph - 2; i <= ph + 2; i++) {
			for (var j = pw - 2; j <= pw + 2; j++) {
				if (i >= 0 && i < h && j >= 0 && j < w) {
					var d = Math.abs(i - ph) + Math.abs(j - pw);
					if (d == 1 && (s[i][j] == 0 || s[i][j] == number + 1)) {
						s[i][j] = number;
						set.remove(new Main().new Position(i, j));
						check(s, new Main().new Position(i, j), number, set);
					} else if (d > 1 && s[i][j] == 0) {
						set.add(new Main().new Position(i, j));
					}
				}
			}
		}
	}

	public class Position {
		private int h;
		private int w;

		public Position(int h, int w) {
			this.h = h;
			this.w = w;
		}

		public int getH() {
			return h;
		}

		public int getW() {
			return w;
		}

		public boolean equals(Object obj) {
			if (obj instanceof Position) {
				var target = (Position) obj;
				return this.h == target.h && this.w == target.w;
			}

			return (this == obj);
		}
	}
}
